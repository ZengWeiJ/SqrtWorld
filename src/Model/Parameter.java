package Model;

import java.awt.Color;

public class Parameter {
	/**
	 * �����Ǻ͔����콻�Q�Ĕ�����
	 * ���Ñ��x���x��ģʽ�r���@Щ����Ҳ��Ĭ�J�ġ�
	 * */
	//�Ñ����Q
	public static String username="ntust";
	//�Ñ��ܴa
	public static String password="ntust";
	//�Ƿ�߼����T
	public static int isMunber=0;
	//�Ñ�����ߵ÷�
	public static int hiscore=0;
	//�Ñ�ҕ�D���@���ǜʂ����oС�M�����ɆT��ҕ�D�ГQ�ӿ�
	//���S�����ڸĞ��O�����[���˅����ѽ�����Ҫ���������
	//�еøĄӔ����죬���������@�e���酢�������x�
	public static int view=0;
	//���K�Ġ�B��1�Ƿ��Σ�2�ǈA��
	public static int sqrtState=1;
	//��Ϣ���λ�ã�1���������҂ȣ�2���������·�
	public static int infoPanelPos=1;
	//�[�򌒶ȣ��M�򷽸�
	public static int WIDTH = 25;
	//�[��߶ȣ��v�򷿂���
	public static int HEIGHT = 30;
	//�[���ٶȣ���λ����
	public static int speed=1000;
	//�Ƿ��_���Ԅ�׃�٣�Ҳ�����S���֔���ߣ��[���ٶ��Ԅ�׃��
	public static int autoSpeed=1;
	
	/**
	 * �����Ǳ��ؔ����������c�����씵�����Q��
	 * �@Щ����ͨ����Ĭ�J�ġ�
	 * */
	//�������@ʾ�ľWַ
	public static String newsUrl="http://140.118.75.44";
	//�����Ϸ��ęM��V���ַ
	public static String TopBannnerUrl="pic\\777.png";
	//�����С
	public static final int CELL_SIZE = 20;
	//�ξַ֔�
	public static int score=0;
	//��Ϣ����ʽ�������λ�õĴ��䅢�����H������Ȳ����R��
	public static int infPanelState=0;
	//���K�ɫ
	public static Color color=Color.RED;
	//�[�򱳾��ɫ
	public static int backgroundColor=0xD1EEEE;
	//�[���Z�ԣ������OӋ�У����r�g�P�S�]����
	public static int language=0;
	//���R�Ƿ����M���[��
	public static int isGameing=0;
	//��춘��R�Ƿ��ѽ��@ʾ�^�Y����棬��ֹ���}�@ʾ
	public static int isShowedResultPanel=0;
	/**
	 * �����ǔ��������P����
	 * */
	//��������
	public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	//�������ַ
	public static final String DB_URL = "jdbc:mysql://��Ĕ������ַ:�˿�/���������Q";
	//��������
	public static final String USER = "�������Ñ���";
	//�������ܴa
	public static final String PASS = "�������ܴa";
}
