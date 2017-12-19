package Model;

import java.awt.Color;
import java.awt.Graphics;


public class Case {

	public static final int ROTATE = 0;
	public static final int LEFT = 1;
	public static final int RIGHT = 2;
	public static final int DOWN = 3;

	private int[][] body;
	private int status;
	private int tuxingX;
	private int tuxingY;

	private CaseInterface listener;

	public Case() {
		//開啟新的線程
		new Thread(new caseSpeciesDriver()).start();
	}

	public void moveToLeft() {
		tuxingX--;
	}

	public void moveToRight() {
		tuxingX++;
	}

	public void moveToDown() {
		tuxingY++;
	}

	public void rotateCase() {
		status = (status + 1) % body.length;
	}

	public void drawMe(Graphics g) {
		//設置方塊顏色
		g.setColor(Parameter.color);
		//生成一個4*4矩陣，用來擺放圖形
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				//讀取數組中單個元素的數字，用來決定是否需要在這裡畫圖
				//如果單點讀取的結果為真
				if (getFlagByPoint(x, y)) {
					//如果是第一種形態
					if(Parameter.sqrtState==1){
						//繪製方塊
					g.fill3DRect((tuxingX + x) * Parameter.CELL_SIZE, (tuxingY + y) * Parameter.CELL_SIZE, Parameter.CELL_SIZE, Parameter.CELL_SIZE, true);}
					//如果是第二種形態
					if(Parameter.sqrtState==2){
						//繪製圓形
						g.fillRoundRect((tuxingX + x) * Parameter.CELL_SIZE, (tuxingY + y) * Parameter.CELL_SIZE, Parameter.CELL_SIZE, Parameter.CELL_SIZE,40,40);}
				}
			}
		}
	}

	private boolean getFlagByPoint(int x, int y) {
		//status是狀態，決定了三維數組的第一維度，保存了一個圖形的不同形態
		//縱向乘4加橫向就是數組中此方格的定位
		return body[status][y * 4 + x] == 1;
	}
	
	//和becomeNewBottom搭配使用，防止圖形在下落過程中被用戶已經轉了方向
	public boolean isMember(int x, int y, boolean rotate) {
		int tempStatus = status;
		if (rotate) {
			tempStatus = (status + 1) % body.length;
		}
		return body[tempStatus][y * 4 + x] == 1;

	}

	private class caseSpeciesDriver implements Runnable {

		public void run() {
			//開啟新的線程控制方塊移動
			//判斷能否移動
			while (listener.iscaseSpeciesCanMoveDown(Case.this)) {
				//向下移動
				moveToDown();
				listener.caseSpeciesMoveDown(Case.this);
				try {
					//線程休眠控制速度
					Thread.sleep(Parameter.speed);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public void addcaseSpeciesListener(CaseInterface s) {
		if (s != null) {
			this.listener = s;
		}
	}

	public void setBody(int body[][]) {
		this.body = body;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getTuxingY() {
		return tuxingY;
	}

	public int getTuxingX() {
		return tuxingX;
	}
}
