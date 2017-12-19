package Controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import View.GamePanel;
import View.ResultPanel;
import Model.Bottom;
import Model.Case;
import Model.CaseMaker;
import Model.CaseInterface;
import Model.Parameter;

public class GameController extends KeyAdapter implements CaseInterface {
      //���췽������ʼ������
	public GameController(CaseMaker caseMaker, Bottom bottom,
			GamePanel gamePanel) {
		this.caseMaker = caseMaker;
		this.bottom = bottom;
		this.gamePanel = gamePanel;
	}

	public CaseMaker caseMaker;
	public Bottom bottom;
	public Case caseSpecies;
	public GamePanel gamePanel;
   //���I�O 
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		//�����D��
		case KeyEvent.VK_UP:
			if (bottom.isCanMove(caseSpecies, Case.ROTATE)) {
				caseSpecies.rotateCase();
			}
			break;
			//���¼�������
		case KeyEvent.VK_DOWN:
			if (iscaseSpeciesCanMoveDown(caseSpecies)) {
				caseSpecies.moveToDown();
			}
			break;
			//��������
		case KeyEvent.VK_LEFT:
			if (bottom.isCanMove(caseSpecies, Case.LEFT)) {
				caseSpecies.moveToLeft();
			}
			break;
			//��������
		case KeyEvent.VK_RIGHT:
			if (bottom.isCanMove(caseSpecies, Case.RIGHT)) {
				caseSpecies.moveToRight();
			}
			break;
		}
		gamePanel.disPlay(bottom, caseSpecies);
	}
    //�Д��ܷ�����
	public synchronized boolean iscaseSpeciesCanMoveDown(Case caseSpecies) {
		if (this.caseSpecies != caseSpecies) {
			return false;
		}
		//��������Ƅ�
		if (bottom.isCanMove(caseSpecies, Case.DOWN))
			return true;
		else {
			//���D��׃�ɵ���һ����
			bottom.becomeNewBottom(this.caseSpecies);
			//����D�Λ]�M
			if (!bottom.isFull())
				this.caseSpecies = caseMaker.madecaseSpecies(this);
			else{
				
			    //�������Y�����
				/**�@�e���Д��Ǟ��˽�Q�����е�һ�����H���}��
				��һ�N��r�����Ñ���ס���������I���ţ����N����ܿ����{�ö�νY����棬
				������O����һ�����������Y������@ʾ������ֵ���Ğ�1��ֱ���ڽY������c
				�ف�һ�֕r�����ą����ű����¸Ğ�0���_���ˆξ�ֻ��һ���Y�������@ʾ��*/
				if(Parameter.isShowedResultPanel==0){
				new ResultPanel().result();
				//���������[��
				this.gamePanel.setVisible(false);
				Parameter.isShowedResultPanel=1;
				}
		}
			return false;
		}
	}
    // ��������
	public void caseSpeciesMoveDown(Case caseSpecies) {
		//�������L
		gamePanel.disPlay(bottom, caseSpecies);
	}
    
	public void newGame() {
		//�_��
		caseSpecies = caseMaker.madecaseSpecies(this);
	}

}
