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
      //構造方法，初始化參數
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
   //按鍵監聽
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		//向上轉型
		case KeyEvent.VK_UP:
			if (bottom.isCanMove(caseSpecies, Case.ROTATE)) {
				caseSpecies.rotateCase();
			}
			break;
			//向下加速下落
		case KeyEvent.VK_DOWN:
			if (iscaseSpeciesCanMoveDown(caseSpecies)) {
				caseSpecies.moveToDown();
			}
			break;
			//向左左移
		case KeyEvent.VK_LEFT:
			if (bottom.isCanMove(caseSpecies, Case.LEFT)) {
				caseSpecies.moveToLeft();
			}
			break;
			//向右右移
		case KeyEvent.VK_RIGHT:
			if (bottom.isCanMove(caseSpecies, Case.RIGHT)) {
				caseSpecies.moveToRight();
			}
			break;
		}
		gamePanel.disPlay(bottom, caseSpecies);
	}
    //判斷能否下落
	public synchronized boolean iscaseSpeciesCanMoveDown(Case caseSpecies) {
		if (this.caseSpecies != caseSpecies) {
			return false;
		}
		//如果可以移動
		if (bottom.isCanMove(caseSpecies, Case.DOWN))
			return true;
		else {
			//將圖形變成地面一部分
			bottom.becomeNewBottom(this.caseSpecies);
			//如果圖形沒滿
			if (!bottom.isFull())
				this.caseSpecies = caseMaker.madecaseSpecies(this);
			else{
				
			    //實例化結果頁面
				/**這裡的判斷是為了解決程序中的一個實際問題，
				有一種情況就是用戶按住加速下落鍵不放，那麼最後很可能調用多次結果頁面，
				於是我設定了一個參數，當結果頁面顯示后，它的值被改為1，直到在結果頁面點
				再來一局時，它的參數才被重新改為0，確保了單局只有一個結果頁面的顯示。*/
				if(Parameter.isShowedResultPanel==0){
				new ResultPanel().result();
				//將本窗口隱形
				this.gamePanel.setVisible(false);
				Parameter.isShowedResultPanel=1;
				}
		}
			return false;
		}
	}
    // 控制下落
	public void caseSpeciesMoveDown(Case caseSpecies) {
		//就是重繪
		gamePanel.disPlay(bottom, caseSpecies);
	}
    
	public void newGame() {
		//開局
		caseSpecies = caseMaker.madecaseSpecies(this);
	}

}
