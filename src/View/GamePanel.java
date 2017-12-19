package View;


import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import Model.Bottom;
import Model.Parameter;
import Model.Case;

/**
 * 主遊戲區顯示面板
 * */
public class GamePanel extends JPanel {

	private Bottom ground;
	private Case caseSpecies;

	public GamePanel() {
		//初始化面板，有微調作業
		this.setSize(Parameter.WIDTH * Parameter.CELL_SIZE+6, Parameter.HEIGHT * Parameter.CELL_SIZE+3);
		//傳遞參數標識在遊戲
		Parameter.isGameing=1;
	}

	public void disPlay(Bottom ground, Case caseSpecies) {
		//現在地面傳給父層
		this.ground = ground;
		//現在圖形傳給父層
		this.caseSpecies = caseSpecies;
		//圖形重繪
		this.repaint();
	}

	protected void paintComponent(Graphics g) {
		//設置背景顏色
		g.setColor(new Color(Parameter.backgroundColor));
		//用背景顏色填充遊戲區
		g.fillRect(0, 0, Parameter.WIDTH * Parameter.CELL_SIZE, Parameter.HEIGHT * Parameter.CELL_SIZE);
		//如果圖形和地面都不為空
		if (caseSpecies != null && ground != null) {
			//繪製圖形
			caseSpecies.drawMe(g);
			//繪製地面
			ground.drawMe(g);
		}
	}

}