package Model;

import java.sql.*;

public class Connection {
 
    
    String JDBC_DRIVER = Parameter.JDBC_DRIVER; 
    String DB_URL = Parameter.DB_URL;
    String USER = Parameter.USER;
    String PASS = Parameter.PASS;
    //本方法是在遊戲用戶登陸后將數據庫的信息讀取呈現并保存在本地變量中
    public boolean startGameConnection(String usernameFromUser,String passwordFromUser) {
        java.sql.Connection conn = null;
        Statement stmt = null;
        try{
        	//註冊驅動操作
            Class.forName(JDBC_DRIVER);
            //獲取驅動管理器
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            //查詢操作
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT password,isMunber, hiscore, view,sqrtState,infoPanelPos,WIDTH,HEIGHT,speed,autoSpeed FROM test WHERE username='"+usernameFromUser+"'";
            ResultSet rs = stmt.executeQuery(sql);
            //操作結果集
            if(rs!=null){
            while(rs.next()){
                // 字段檢索
                String passwordFromDatabase=rs.getString("password");
            	//如果數據庫密碼和用戶密碼不相同
                if(!passwordFromDatabase.equals(passwordFromUser)){
            		//返回false
                	return false;
                	//否則開始讀取用戶信息
            	}else{
            	int isMunber=rs.getInt("isMunber");
            	int hiscore=rs.getInt("hiscore");
            	int view=rs.getInt("view");
            	int sqrtState=rs.getInt("sqrtState");
            	int infoPanelPos=rs.getInt("infoPanelPos");
            	int WIDTH =rs.getInt("WIDTH");
        		int HEIGHT = rs.getInt("HEIGHT");
        		int speed=rs.getInt("speed");
        		int autoSpeed=rs.getInt("autoSpeed");
                // 將讀取的用戶信息保存在本地變量
                Parameter.isMunber=isMunber;
                Parameter.hiscore=hiscore;
                Parameter.view=view;
                Parameter.sqrtState=sqrtState;
                Parameter.infoPanelPos=infoPanelPos;
                Parameter.WIDTH=WIDTH;
                Parameter.HEIGHT=HEIGHT;
                Parameter.speed=speed;
                Parameter.autoSpeed=autoSpeed;
              }
            }}else{
            	return false;
            }
            // 關閉
            rs.close();
            stmt.close();
            conn.close();
            //返回true
            return true;
        }catch(SQLException se){
            // 處理錯誤
            se.printStackTrace();
            return false;
        }catch(Exception e){
            // 處理forName錯誤
            e.printStackTrace();
            return false;
        }finally{
            // 關閉
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
                return false;
            }
        }
        

    }
    //以下代碼和上面類似，不再寫注釋，不會的可以LINE上問我。
    //其實部分代碼是可以複用的，為什麼寫成這樣，因為期末到了，沒時間了，我還沒複習啊啊啊
    //本方法是在用戶更改設置后將新的設置保存在遠端數據庫。
    public boolean afterSettingConnection(String username ,int isMunber,int hiscore,int view,int sqrtState,int infoPanelPos,int WIDTH,int HEIGHT,int speed,int autoSpeed) {
        java.sql.Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
            String sql;
            sql = "UPDATE test SET isMunber="+isMunber+", hiscore="+hiscore+", view="+view+",sqrtState="+sqrtState+",infoPanelPos="+infoPanelPos+",WIDTH="+WIDTH+",HEIGHT="+HEIGHT+",speed="+speed+",autoSpeed="+autoSpeed+" WHERE username='"+username+"'";
            System.out.println(sql);
            stmt.execute(sql);
            stmt.close();
            conn.close();
            return true;
        }catch(SQLException se){
            se.printStackTrace();
            return false;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
           try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
                return false;
            }
        }
     }
    //以下方法用於新用戶註冊保存信息到數據庫
    public boolean reg(String username ,String password){
        java.sql.Connection conn = null;
        Statement stmt = null;
        try{ 
        	Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
            String sql;
            sql = "INSERT INTO test (username, password) VALUES ('"+username+"','"+password+"')";
            stmt.execute(sql);
            stmt.close();
            conn.close();
            return true;
        }catch(SQLException se){
            se.printStackTrace();
            return false;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
                return false;
            }
        }
     }
    //以下方法用於查詢最高分的五個人
    public String[] highestScore(){
        java.sql.Connection conn = null;
        Statement stmt = null;
        String[] s=new String[10];
        int i=0;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
            String sql = "SELECT username,hiscore FROM test ORDER BY hiscore DESC LIMIT 5";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                s[i]=rs.getString(1);
                i++;
                s[i]=rs.getInt(2)+"";
                i++;
                }
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
               try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
		return s;
     }
    //以下方法用於將用戶的最高分更新到數據庫
    public boolean sendHightestScoreConnection() {
        java.sql.Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
            String sql;
            sql = "UPDATE test SET hiscore="+Parameter.hiscore+" WHERE username='"+Parameter.username+"'";
           System.out.println(sql);
            stmt.execute(sql);
            stmt.close();
            conn.close();
            return true;
        }catch(SQLException se){     
            se.printStackTrace();
            return false;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
         
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
                return false;
            }
        }
    }
    //以下方法用來核驗用戶輸入的充值（高級會員）密碼是否有效
    public boolean verMem(String memSer) {
        java.sql.Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
            String sql;
            sql = "DELETE FROM mem WHERE memno='"+memSer+"'";
            System.out.println(sql);
            int rs = stmt.executeUpdate(sql);
            if(rs!=0){
            	sql = "UPDATE test SET isMunber=1 WHERE username='"+Parameter.username+"'";
                System.out.println(sql);
                stmt.execute(sql);
            		return true;
            	}
            stmt.close();
            conn.close();
            return false;
        }catch(SQLException se){
        	se.printStackTrace();
            return false;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
         
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
                return false;
            }
        }
    }
}