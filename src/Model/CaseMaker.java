package Model;

import java.util.Random;


public class CaseMaker {

	
    //製造一個新的圖形
	public Case madecaseSpecies(CaseInterface listener) {
		//實例化一個圖形
		Case oneSpecies = new Case();
		//給實例化的圖形加入監聽器
		oneSpecies.addcaseSpeciesListener(listener);
		//實例化圖形母版
		CaseSpecies caseSpecies = new CaseSpecies();
		//隨機產生一個圖形
		int type = new Random().nextInt(caseSpecies.caseSpeciess.length);
		//設置圖形形狀
		oneSpecies.setBody(caseSpecies.caseSpeciess[type]);
		//設置圖形的狀態
		oneSpecies.setStatus(0);
		//返回圖形
		return oneSpecies;
	}
}
