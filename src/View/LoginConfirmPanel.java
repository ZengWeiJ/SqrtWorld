/*
 * LoginConfirm.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.awt.Color;

import Controller.StartGame;
import Model.Parameter;

/**
 * 信息確認面板，搭配Connection類顯示用戶基本信息
 * */
public class LoginConfirmPanel extends javax.swing.JFrame {

	
	public LoginConfirmPanel() {
		initComponents();
	}

	
private void initComponents() {

jLabel1 = new javax.swing.JLabel();
jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jLabel20 = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setIcon(new javax.swing.ImageIcon(
				Parameter.TopBannnerUrl)); // NOI18N

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel2.setText("\u7528\u6236\u540d");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel3.setText("\u662f\u5426\u6703\u54e1");

		jLabel4.setText("\u6700\u9ad8\u5206");

		jLabel5.setText("\u8996\u5716\u985e\u578b");

		jLabel6.setText("\u65b9\u584a\u985e\u578b");

		jLabel7.setText("\u9762\u677f\u4f4d\u7f6e");

		jLabel8.setText("\u9762\u677f\u5bec\u5ea6");

		jLabel9.setText("\u9762\u677f\u9ad8\u5ea6");

		jLabel10.setText("\u904a\u6232\u901f\u5ea6");

		jLabel11.setText("\u81ea\u52d5\u901f\u5ea6");

		jButton1.setText("\u958b\u59cb\u904a\u6232");
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton1MouseClicked(evt);
			}
		});

		jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel12.setText("\u53c3\u6578\u6f2b\u904a");

		jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel13.setText("jLabel13");

		jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
jLabel13.setText(Parameter.username);
		
		if(Parameter.isMunber==0){
			jLabel14.setText("普通用户");
			
		}else{
			jLabel14.setText("高级会员");
			jLabel14.setOpaque(true);
			jLabel14.setBackground(Color.yellow);
		}
		jLabel15.setText(Parameter.hiscore+"分");

		jLabel16.setText("視圖類型"+Parameter.view);

		
		if(Parameter.sqrtState==1){
			jLabel17.setText("方角矩形");
			
		}else{
			jLabel17.setText("圓形");
		}
		
		if(Parameter.infoPanelPos==1){
			jLabel18.setText("右側");
			
		}else{
			jLabel18.setText("下方");

		}
		jLabel19.setText(Parameter.WIDTH+"方塊");

		jLabel20.setText(Parameter.HEIGHT+"方塊");

		jLabel21.setText(Parameter.speed+"ms");

		
		if(Parameter.autoSpeed==1){
			jLabel22.setText("開啟自動");
			
		}else{
			jLabel22.setText("關閉自動");

		}

		jButton2.setText("\u4fee\u6539\u8a2d\u7f6e");
		jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton2MouseClicked(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(33, 33, 33)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel4)
												.addComponent(jLabel2)
												.addComponent(jLabel6)
												.addComponent(jLabel8)
												.addComponent(jLabel10))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel13)
												.addComponent(jLabel15)
												.addComponent(jLabel17)
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(
																		jLabel19)
																.addComponent(
																		jButton1,
																		javax.swing.GroupLayout.Alignment.TRAILING))
												.addComponent(jLabel21))
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(88, 88,
																		88)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel9)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jLabel20))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel7)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jLabel18))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel5)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jLabel16))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel3)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jLabel14))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jLabel11)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jLabel22))))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(76, 76,
																		76)
																.addComponent(
																		jButton2))))
				.addGroup(
						layout.createSequentialGroup().addGap(151, 151, 151)
								.addComponent(jLabel12)).addComponent(jLabel1));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										62,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel12)
								.addGap(4, 4, 4)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(jLabel13)
												.addComponent(jLabel3)
												.addComponent(jLabel14))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel4)
												.addComponent(jLabel15)
												.addComponent(jLabel5)
												.addComponent(jLabel16))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel6)
												.addComponent(jLabel17)
												.addComponent(jLabel7)
												.addComponent(jLabel18))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel8)
												.addComponent(jLabel19)
												.addComponent(jLabel9)
												.addComponent(jLabel20))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel10)
												.addComponent(jLabel21)
												.addComponent(jLabel11)
												.addComponent(jLabel22))
								.addGap(43, 43, 43)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton1)
												.addComponent(jButton2))
								.addContainerGap(29, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {
		String[] args = new String[2];
		new SettingPanel().main(args);
	}

	private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
		String[] args = new String[2];
		new NewsPanel().main(args);
	}

	
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LoginConfirmPanel().setVisible(true);
			}
		});
	}

	
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;


}