package Model;

import java.util.Random;


public class CaseMaker {

	
    //�u��һ���µĈD��
	public Case madecaseSpecies(CaseInterface listener) {
		//������һ���D��
		Case oneSpecies = new Case();
		//�o�������ĈD�μ���O ��
		oneSpecies.addcaseSpeciesListener(listener);
		//�������D��ĸ��
		CaseSpecies caseSpecies = new CaseSpecies();
		//�S�C�a��һ���D��
		int type = new Random().nextInt(caseSpecies.caseSpeciess.length);
		//�O�ÈD���Π�
		oneSpecies.setBody(caseSpecies.caseSpeciess[type]);
		//�O�ÈD�εĠ�B
		oneSpecies.setStatus(0);
		//���؈D��
		return oneSpecies;
	}
}
