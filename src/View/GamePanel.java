package View;


import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import Model.Bottom;
import Model.Parameter;
import Model.Case;

/**
 * ���[��^�@ʾ���
 * */
public class GamePanel extends JPanel {

	private Bottom ground;
	private Case caseSpecies;

	public GamePanel() {
		//��ʼ����壬��΢�{���I
		this.setSize(Parameter.WIDTH * Parameter.CELL_SIZE+6, Parameter.HEIGHT * Parameter.CELL_SIZE+3);
		//���f�������R���[��
		Parameter.isGameing=1;
	}

	public void disPlay(Bottom ground, Case caseSpecies) {
		//�F�ڵ�����o����
		this.ground = ground;
		//�F�ڈD�΂��o����
		this.caseSpecies = caseSpecies;
		//�D�����L
		this.repaint();
	}

	protected void paintComponent(Graphics g) {
		//�O�ñ����ɫ
		g.setColor(new Color(Parameter.backgroundColor));
		//�ñ����ɫ����[��^
		g.fillRect(0, 0, Parameter.WIDTH * Parameter.CELL_SIZE, Parameter.HEIGHT * Parameter.CELL_SIZE);
		//����D�κ͵��涼�����
		if (caseSpecies != null && ground != null) {
			//�L�u�D��
			caseSpecies.drawMe(g);
			//�L�u����
			ground.drawMe(g);
		}
	}

}