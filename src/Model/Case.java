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
		//�_���µľ���
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
		//�O�÷��K�ɫ
		g.setColor(Parameter.color);
		//����һ��4*4��ꇣ��Á�[�ňD��
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				//�xȡ���M�І΂�Ԫ�صĔ��֣��Á�Q���Ƿ���Ҫ���@�e���D
				//������c�xȡ�ĽY������
				if (getFlagByPoint(x, y)) {
					//����ǵ�һ�N�ΑB
					if(Parameter.sqrtState==1){
						//�L�u���K
					g.fill3DRect((tuxingX + x) * Parameter.CELL_SIZE, (tuxingY + y) * Parameter.CELL_SIZE, Parameter.CELL_SIZE, Parameter.CELL_SIZE, true);}
					//����ǵڶ��N�ΑB
					if(Parameter.sqrtState==2){
						//�L�u�A��
						g.fillRoundRect((tuxingX + x) * Parameter.CELL_SIZE, (tuxingY + y) * Parameter.CELL_SIZE, Parameter.CELL_SIZE, Parameter.CELL_SIZE,40,40);}
				}
			}
		}
	}

	private boolean getFlagByPoint(int x, int y) {
		//status�Ǡ�B���Q�������S���M�ĵ�һ�S�ȣ�������һ���D�εĲ�ͬ�ΑB
		//�v���4�әM����ǔ��M�д˷���Ķ�λ
		return body[status][y * 4 + x] == 1;
	}
	
	//��becomeNewBottom����ʹ�ã���ֹ�D���������^���б��Ñ��ѽ��D�˷���
	public boolean isMember(int x, int y, boolean rotate) {
		int tempStatus = status;
		if (rotate) {
			tempStatus = (status + 1) % body.length;
		}
		return body[tempStatus][y * 4 + x] == 1;

	}

	private class caseSpeciesDriver implements Runnable {

		public void run() {
			//�_���µľ��̿��Ʒ��K�Ƅ�
			//�Д��ܷ��Ƅ�
			while (listener.iscaseSpeciesCanMoveDown(Case.this)) {
				//�����Ƅ�
				moveToDown();
				listener.caseSpeciesMoveDown(Case.this);
				try {
					//�������߿����ٶ�
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
