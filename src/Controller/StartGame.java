package Controller;


import javax.swing.JFrame;

import Model.Bottom;
import Model.CaseMaker;
import View.GamePanel;
import View.InfoPanel;

//遊戲界面的生成
public class StartGame {
	public  void game() {
		//實例化圖形製造器
		CaseMaker caseSpeciesFactory = new CaseMaker();
		//實例化地面
		Bottom ground = new Bottom();
		//實例化遊戲界面
		GamePanel gamePanel = new GamePanel();
		//實例化遊戲控制器
		GameController controller = new GameController(caseSpeciesFactory, ground, gamePanel);
		//實例化信息界面
		InfoPanel im=new InfoPanel();
		//信息界面的啟動
		im.start();
		//繪製一個窗口
		JFrame frame = new JFrame();
		//設定窗口位置和大小
		frame.setSize(gamePanel.getSize().width + 10, gamePanel.getSize().height + 35);
		//將上面的遊戲界面加入敞口
		frame.add(gamePanel);
		//給遊戲界面添加監聽器
		gamePanel.addKeyListener(controller);
		//給窗體添加監聽器
		frame.addKeyListener(controller);
		//設置窗體可見
		frame.setVisible(true);
		//啟動遊戲控制器
		controller.newGame();
	}
}
