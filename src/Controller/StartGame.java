package Controller;


import javax.swing.JFrame;

import Model.Bottom;
import Model.CaseMaker;
import View.GamePanel;
import View.InfoPanel;

//�[����������
public class StartGame {
	public  void game() {
		//�������D���u����
		CaseMaker caseSpeciesFactory = new CaseMaker();
		//����������
		Bottom ground = new Bottom();
		//�������[�����
		GamePanel gamePanel = new GamePanel();
		//�������[�������
		GameController controller = new GameController(caseSpeciesFactory, ground, gamePanel);
		//��������Ϣ����
		InfoPanel im=new InfoPanel();
		//��Ϣ����Ć���
		im.start();
		//�L�uһ������
		JFrame frame = new JFrame();
		//�O������λ�úʹ�С
		frame.setSize(gamePanel.getSize().width + 10, gamePanel.getSize().height + 35);
		//��������[�������볨��
		frame.add(gamePanel);
		//�o�[�������ӱO ��
		gamePanel.addKeyListener(controller);
		//�o���w��ӱO ��
		frame.addKeyListener(controller);
		//�O�ô��w��Ҋ
		frame.setVisible(true);
		//�����[�������
		controller.newGame();
	}
}
