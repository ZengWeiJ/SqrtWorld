/*
 * Setting.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.awt.Color;

import Model.Parameter;
import Model.Connection;

/**
 * 設置面板，設置完成后同時更改遠程和本地參數
 * */
public class SettingPanel extends javax.swing.JFrame {

	
	public SettingPanel() {
		initComponents();
	}

	
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jComboBox2 = new javax.swing.JComboBox();
		jComboBox3 = new javax.swing.JComboBox();
		jComboBox4 = new javax.swing.JComboBox();
		jButton1 = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		jComboBox5 = new javax.swing.JComboBox();
		jLabel7 = new javax.swing.JLabel();
		jComboBox6 = new javax.swing.JComboBox();
		jButton2 = new javax.swing.JButton();
		jLabel8 = new javax.swing.JLabel();
		jComboBox7 = new javax.swing.JComboBox();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setIcon(new javax.swing.ImageIcon(
				Parameter.TopBannnerUrl));

		jLabel2.setText("\u65b9\u584a\u984f\u8272");

		jLabel3.setText("\u80cc\u666f\u984f\u8272");

		jLabel4.setText("\u901f\u5ea6\u7d1a\u5225");

		jLabel5.setText("\u81ea\u52d5\u52a0\u901f");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"紅", "黃", "藍", "綠" }));

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"紅", "黃", "藍", "綠" }));
		jComboBox2.setSelectedIndex(2);

		jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		jComboBox3.setSelectedIndex(6);

		jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"開啟", "關閉" }));

		jButton1.setText("\u78ba\u5b9a");
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton1MouseClicked(evt);
			}
		});

		jLabel6.setText("\u5340\u57df\u5927\u5c0f");

		jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"大", "小" }));
		jComboBox5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox5ActionPerformed(evt);
			}
		});

		jLabel7.setText("\u4fe1\u606f\u5340\u4f48\u5c40");

		jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"右邊", "下邊" }));

		jButton2.setText("\u53d6\u6d88");
		
		if(Parameter.isGameing==0){
			
			jComboBox5.setEnabled(true);
			jComboBox6.setEnabled(true);
		
		}
		if(Parameter.isGameing==1){
			if(Parameter.WIDTH==15){jComboBox5.setSelectedIndex(1);}
			if(Parameter.WIDTH==25){jComboBox5.setSelectedIndex(0);}
			jComboBox5.setEnabled(false);
			
			jComboBox6.setEnabled(false);
		}
		
		
		
		
		jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton2MouseClicked(evt);
			}
		});

		jLabel8.setText("\u65b9\u584a\u6a23\u5f0f");

		jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"方角", "圓角" }));
		if(Parameter.isMunber==0){
			jComboBox7.setEnabled(false);
		}else{
			jComboBox7.setEnabled(true);
		}
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(121, 121, 121)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel8)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jComboBox7,
																		0,
																		132,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel7)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jComboBox6,
																		0,
																		120,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
																.addGroup(
																		layout.createSequentialGroup()
																				.addComponent(
																						jLabel5)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																				.addComponent(
																						jComboBox4,
																						0,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE))
																.addGroup(
																		layout.createSequentialGroup()
																				.addComponent(
																						jLabel4)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																				.addComponent(
																						jComboBox3,
																						0,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE))
																.addGroup(
																		layout.createSequentialGroup()
																				.addComponent(
																						jLabel2)
																				.addGap(12,
																						12,
																						12)
																				.addComponent(
																						jComboBox1,
																						0,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE))
																.addGroup(
																		layout.createSequentialGroup()
																				.addComponent(
																						jLabel3)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																				.addComponent(
																						jComboBox2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						135,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGroup(
																		layout.createSequentialGroup()
																				.addComponent(
																						jLabel6)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																				.addComponent(
																						jComboBox5,
																						0,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE))
																.addGroup(
																		layout.createSequentialGroup()
																				.addGap(78,
																						78,
																						78)
																				.addComponent(
																						jButton1)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(
																						jButton2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						56,
																						javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGap(181, 181, 181)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										68,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(45, 45, 45)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jComboBox1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														16,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(
														jComboBox2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel4)
												.addComponent(
														jComboBox3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(8, 8, 8)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel5)
												.addComponent(
														jComboBox4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel6)
												.addComponent(
														jComboBox5,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(16, 16, 16)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel8)
												.addComponent(
														jComboBox7,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel7)
												.addComponent(
														jComboBox6,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(23, 23, 23)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton1)
												.addComponent(jButton2))
								.addContainerGap(28, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {
		this.setVisible(false);
	}

	private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
		int colorFront = jComboBox1.getSelectedIndex();
		int colorBackground = jComboBox2.getSelectedIndex();
		int speed = jComboBox3.getSelectedIndex();
		int autoSpeed = jComboBox4.getSelectedIndex();
		int scale = jComboBox5.getSelectedIndex();
		int infoPanelPos = jComboBox6.getSelectedIndex();
		int sqrtState = jComboBox7.getSelectedIndex();
		switch (colorFront) {
		case 0:
			Parameter.color = Color.RED;
			break;
		case 1:
			Parameter.color = Color.YELLOW;
			break;
		case 2:
			Parameter.color = Color.BLUE;
			break;
		case 3:
			Parameter.color = Color.GREEN;
			break;
		}
		switch (colorBackground) {
		case 0:
			Parameter.backgroundColor = 0xFF0000;
			break;
		case 1:
			Parameter.backgroundColor = 0xF0E68C;
			break;
		case 2:
			Parameter.backgroundColor = 0x00EEEE;
			break;
		case 3:
			Parameter.backgroundColor = 0xC1FFC1;
			break;
		}
		switch (speed) {
		case 0:
			Parameter.speed = 2100;
			speed = 2100;
			break;
		case 1:
			Parameter.speed = 1900;speed = 1900;
			break;
		case 2:
			Parameter.speed = 1700;speed = 1700;
			break;
		case 3:
			Parameter.speed = 1500;speed = 1500;
			break;
		case 4:
			Parameter.speed = 1300;speed = 1300;
			break;
		case 5:
			Parameter.speed = 1100;speed = 1100;
			break;
		case 6:
			Parameter.speed = 900;speed = 900;
			break;
		case 7:
			Parameter.speed = 700;speed = 700;
			break;
		case 8:
			Parameter.speed = 500;speed = 500;
			break;
		case 9:
			Parameter.speed = 300;speed = 300;
			break;

		}
		switch (autoSpeed) {
		case 0:
			Parameter.autoSpeed = 1;autoSpeed = 1;
			break;
		case 1:
			Parameter.autoSpeed = 0;autoSpeed = 0;
			break;
		}
		switch (scale) {
		case 0:
			Parameter.WIDTH = 25;
			Parameter.HEIGHT = 30;
			
			break;
		case 1:
			Parameter.WIDTH = 15;
			Parameter.HEIGHT = 20;
			break;

		}
		switch (infoPanelPos) {
		case 0:
			Parameter.infoPanelPos = 1;infoPanelPos = 1;
			break;
		case 1:
			Parameter.infoPanelPos = 2;infoPanelPos = 2;
			break;
		}

		switch (sqrtState) {
		case 0:
			Parameter.sqrtState = 1;sqrtState = 1;
			break;
		case 1:
			Parameter.sqrtState= 2;sqrtState= 2;
			break;
		}
		this.setVisible(false);
		String username=Parameter.username;
		int isMunber=Parameter.isMunber;
		int hiscore=Parameter.hiscore;
		int view=Parameter.view;
		int WIDTH=Parameter.WIDTH;
		int HEIGHT=Parameter.HEIGHT;
		
		Connection c=new Connection();
		c.afterSettingConnection( username ,isMunber,hiscore,view,sqrtState,infoPanelPos,WIDTH,HEIGHT,speed,autoSpeed);
		
		
		
		
		
	}


	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new SettingPanel().setVisible(true);
			}
		});
	}


	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JComboBox jComboBox3;
	private javax.swing.JComboBox jComboBox4;
	private javax.swing.JComboBox jComboBox5;
	private javax.swing.JComboBox jComboBox6;
	private javax.swing.JComboBox jComboBox7;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	

}