package Model;

import java.awt.Graphics;
//�L�u�ײ�������r
public class Bottom {

	private int[][] obstacles = new int[Parameter.WIDTH][Parameter.HEIGHT];
	//�шD�μӵ��µĵ����У����������^�K׃��1
	public void becomeNewBottom(Case caseSpecies) {
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				if (caseSpecies.isMember(x, y, false)) {
					obstacles[caseSpecies.getTuxingX() + x][caseSpecies
							.getTuxingY() + y] = 1;
				}
			}
		}
		//�z��һ���Л]�НM
		deleteFullLine();
	}
    //�L�u���棬��v�z��1�ǵ���0�ǿհ�
	public void drawMe(Graphics g) {
		for (int x = 0; x < Parameter.WIDTH; x++) {
			for (int y = 0; y < Parameter.HEIGHT; y++) {
				if (obstacles[x][y] == 1) {
					//��������Ƿ��K
					if(Parameter.sqrtState==1){
					g.fill3DRect(x * Parameter.CELL_SIZE, y
							* Parameter.CELL_SIZE, Parameter.CELL_SIZE,
							Parameter.CELL_SIZE, false);}
					//��������ǈA��
					if(Parameter.sqrtState==2){
					g.fillRoundRect(x * Parameter.CELL_SIZE, y
							* Parameter.CELL_SIZE, Parameter.CELL_SIZE,
							Parameter.CELL_SIZE, 40,40);}
      			}
			}
		}
	}
    //�Д��ܷ��Ƅ�
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
				//�Ƅ�֮�ῴ���Л]�г���߅��
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
    //�Д��Ƿ�M��
	public boolean isFull() {
		//���б�v
		for (int x = 0; x < Parameter.WIDTH; x++) {
			if (obstacles[x][0] == 1) {

				return true;
			}
		}
		return false;
	}
    //�Д��h��һ��
	private void deleteFullLine() {
		for (int y = Parameter.HEIGHT - 1; y >= 0; y--) {
			boolean full = true;
			//�z��һ���Л]�И�ӛ��0�ķ���
			for (int x = 0; x < Parameter.WIDTH; x++) {
				if (obstacles[x][y] == 0)
					full = false;
			}
			//�����
			if (full) {
				//�֔���1
				Parameter.score++;
				//�����֔���׃�ٶ�
				if(Parameter.autoSpeed==1&&Parameter.speed>300){
					Parameter.speed=Parameter.speed-((Parameter.score/5)*50);
				}
				//�{�Äh���Z�䣬���f���h��̖
				deleteLine(y);
			}
		}
	}
    //�h����
	private void deleteLine(int lineNum) {
		for (int y = lineNum; y > 0; y--) {
			for (int x = 0; x < Parameter.WIDTH; x++) {
				obstacles[x][y] = obstacles[x][y - 1];
			}
		}
		//��ӛ��0
		for (int x = 0; x < Parameter.WIDTH; x++) {
			obstacles[x][0] = 0;
		}
	}
}
