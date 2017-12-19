package Model;

import java.sql.*;

public class Connection {
 
    
    String JDBC_DRIVER = Parameter.JDBC_DRIVER; 
    String DB_URL = Parameter.DB_URL;
    String USER = Parameter.USER;
    String PASS = Parameter.PASS;
    //�����������[���Ñ���ꑺ󌢔��������Ϣ�xȡ�ʬF�������ڱ���׃����
    public boolean startGameConnection(String usernameFromUser,String passwordFromUser) {
        java.sql.Connection conn = null;
        Statement stmt = null;
        try{
        	//�]���Ӳ���
            Class.forName(JDBC_DRIVER);
            //�@ȡ�ӹ�����
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            //��ԃ����
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT password,isMunber, hiscore, view,sqrtState,infoPanelPos,WIDTH,HEIGHT,speed,autoSpeed FROM test WHERE username='"+usernameFromUser+"'";
            ResultSet rs = stmt.executeQuery(sql);
            //�����Y����
            if(rs!=null){
            while(rs.next()){
                // �ֶΙz��
                String passwordFromDatabase=rs.getString("password");
            	//����������ܴa���Ñ��ܴa����ͬ
                if(!passwordFromDatabase.equals(passwordFromUser)){
            		//����false
                	return false;
                	//��t�_ʼ�xȡ�Ñ���Ϣ
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
                // ���xȡ���Ñ���Ϣ�����ڱ���׃��
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
            // �P�]
            rs.close();
            stmt.close();
            conn.close();
            //����true
            return true;
        }catch(SQLException se){
            // ̎���e�`
            se.printStackTrace();
            return false;
        }catch(Exception e){
            // ̎��forName�e�`
            e.printStackTrace();
            return false;
        }finally{
            // �P�]
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
    //���´��a��������ƣ����ٌ�עጣ������Ŀ���LINE�φ��ҡ�
    //�䌍���ִ��a�ǿ����}�õģ���ʲ�N�����@�ӣ������ĩ���ˣ��]�r�g�ˣ���߀�]�}��������
    //�����������Ñ������O�ú��µ��O�ñ������h�˔����졣
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
    //���·���������Ñ��]�Ա�����Ϣ��������
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
    //���·�����춲�ԃ��߷ֵ��傀��
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
    //���·�����춌��Ñ�����߷ָ��µ�������
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
    //���·����Á����Ñ�ݔ��ĳ�ֵ���߼����T���ܴa�Ƿ���Ч
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