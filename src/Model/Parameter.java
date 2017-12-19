package Model;

import java.awt.Color;

public class Parameter {
	/**
	 * 以下是和數據庫交換的數據。
	 * 當用戶選擇離線模式時候，這些參數也是默認的。
	 * */
	//用戶名稱
	public static String username="ntust";
	//用戶密碼
	public static String password="ntust";
	//是否高級會員
	public static int isMunber=0;
	//用戶的最高得分
	public static int hiscore=0;
	//用戶視圖，這個是準備留給小組其它成員的視圖切換接口
	//但隨著後期改為設置漫遊，此參數已經不重要，但是因為
	//懶得改動數據庫，所以留在這裡作為參數備用選項
	public static int view=0;
	//方塊的狀態，1是方形，2是圓形
	public static int sqrtState=1;
	//信息面板位置，1在主界面右側，2在主界面下方
	public static int infoPanelPos=1;
	//遊戲寬度，橫向方格數
	public static int WIDTH = 25;
	//遊戲高度，縱向房個數
	public static int HEIGHT = 30;
	//遊戲速度，單位毫秒
	public static int speed=1000;
	//是否開啟自動變速，也就是隨著分數提高，遊戲速度自動變快
	public static int autoSpeed=1;
	
	/**
	 * 以下是本地數據，不參與數據庫數據交換。
	 * 這些參數通常是默認的。
	 * */
	//新聞界面顯示的網址
	public static String newsUrl="http://140.118.75.44";
	//界面上方的橫向廣告地址
	public static String TopBannnerUrl="pic\\777.png";
	//方格大小
	public static final int CELL_SIZE = 20;
	//單局分數
	public static int score=0;
	//信息面板樣式，是面板位置的搭配參數，僅供程序內部標識。
	public static int infPanelState=0;
	//方塊顏色
	public static Color color=Color.RED;
	//遊戲背景顏色
	public static int backgroundColor=0xD1EEEE;
	//遊戲語言，初版設計有，後來時間關係沒做。
	public static int language=0;
	//標識是否在進行遊戲
	public static int isGameing=0;
	//用於標識是否已經顯示過結果頁面，防止重複顯示
	public static int isShowedResultPanel=0;
	/**
	 * 以下是數據庫相關配置
	 * */
	//數據庫驅動
	public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	//數據庫地址
	public static final String DB_URL = "jdbc:mysql://你的數據庫地址:端口/數據庫名稱";
	//數據庫名
	public static final String USER = "數據庫用戶名";
	//數據庫密碼
	public static final String PASS = "數據庫密碼";
}
