package Model;

import java.awt.Graphics;
//繪製底部地面情況
public class Bottom {

	private int[][] obstacles = new int[Parameter.WIDTH][Parameter.HEIGHT];
	//把圖形加到新的地面中，即把相應區塊變成1
	public void becomeNewBottom(Case caseSpecies) {
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				if (caseSpecies.isMember(x, y, false)) {
					obstacles[caseSpecies.getTuxingX() + x][caseSpecies
							.getTuxingY() + y] = 1;
				}
			}
		}
		//檢查一行有沒有滿
		deleteFullLine();
	}
    //繪製地面，遍歷檢查1是地面0是空白
	public void drawMe(Graphics g) {
		for (int x = 0; x < Parameter.WIDTH; x++) {
			for (int y = 0; y < Parameter.HEIGHT; y++) {
				if (obstacles[x][y] == 1) {
					//如果參數是方塊
					if(Parameter.sqrtState==1){
					g.fill3DRect(x * Parameter.CELL_SIZE, y
							* Parameter.CELL_SIZE, Parameter.CELL_SIZE,
							Parameter.CELL_SIZE, false);}
					//如果參數是圓形
					if(Parameter.sqrtState==2){
					g.fillRoundRect(x * Parameter.CELL_SIZE, y
							* Parameter.CELL_SIZE, Parameter.CELL_SIZE,
							Parameter.CELL_SIZE, 40,40);}
      			}
			}
		}
	}
    //判斷能否移動
	public boolean isCanMove(Case caseSpecies, int action) {
		int tuxingX = caseSpecies.getTuxingX();
		int tuxingY = caseSpecies.getTuxingY();
		switch (action) {
		case Case.LEFT:
			tuxingX--;
			break;
		case Case.RIGHT:
			tuxingX++;
			break;
		case Case.DOWN:
			tuxingY++;
			break;
		}
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				//移動之後看看有沒有超出邊界
				if (caseSpecies.isMember(x, y, action == Case.ROTATE)) {
					if (tuxingY + y >= Parameter.HEIGHT || tuxingX + x < 0
							|| tuxingX + x >= Parameter.WIDTH
							|| obstacles[tuxingX + x][tuxingY + y] == 1)
						return false;
				}
			}
		}
		return true;
	}
    //判斷是否滿行
	public boolean isFull() {
		//整行遍歷
		for (int x = 0; x < Parameter.WIDTH; x++) {
			if (obstacles[x][0] == 1) {

				return true;
			}
		}
		return false;
	}
    //判斷刪除一行
	private void deleteFullLine() {
		for (int y = Parameter.HEIGHT - 1; y >= 0; y--) {
			boolean full = true;
			//檢查一行有沒有標記為0的方格
			for (int x = 0; x < Parameter.WIDTH; x++) {
				if (obstacles[x][y] == 0)
					full = false;
			}
			//如果有
			if (full) {
				//分數加1
				Parameter.score++;
				//根據分數改變速度
				if(Parameter.autoSpeed==1&&Parameter.speed>300){
					Parameter.speed=Parameter.speed-((Parameter.score/5)*50);
				}
				//調用刪行語句，傳遞待刪行號
				deleteLine(y);
			}
		}
	}
    //刪除行
	private void deleteLine(int lineNum) {
		for (int y = lineNum; y > 0; y--) {
			for (int x = 0; x < Parameter.WIDTH; x++) {
				obstacles[x][y] = obstacles[x][y - 1];
			}
		}
		//標記為0
		for (int x = 0; x < Parameter.WIDTH; x++) {
			obstacles[x][0] = 0;
		}
	}
}
