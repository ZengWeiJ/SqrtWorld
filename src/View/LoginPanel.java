/*
 * startLoginPanel.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.awt.Color;

import javax.swing.JOptionPane;

import Controller.LoginController;
import Controller.OtherController;
import Controller.StartGame;
import Model.Parameter;
import Model.Connection;

/**
 * 登錄面板，檢查用戶登錄，提供一些功能
 * */
public class LoginPanel extends javax.swing.JFrame {

	public LoginPanel() {
		initComponents();
	}

	
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jPasswordField1 = new javax.swing.JPasswordField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setIcon(new javax.swing.ImageIcon(
				Parameter.TopBannnerUrl)); 

		jLabel2.setText("\u7528\u6236\u540d\uff1a");

		jLabel3.setText("\u5bc6  \u78bc\uff1a");

		jTextField1.setText("ntust");

		jPasswordField1.setText("ntust");

		jButton1.setText("\u958b\u59cb\u904a\u6232");
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton1MouseClicked(evt);
			}
		});

		jButton2.setText("\u9000\u51fa\u904a\u6232");

		jButton3.setText("\u96e2\u7dda\u6a21\u5f0f");
		jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton3MouseClicked(evt);
			}
		});

		 OtherController o=new OtherController();
//	        if(o.isNetCanUse("8.8.8.8")){
//	        	jLabel4.setOpaque(true);
//	        	jLabel4.setBackground(Color.yellow);
//	        	jLabel4.setText("網絡連通正常，但可能仍需要額外時間。");
//	        }else{
//	        	jLabel4.setOpaque(true);
//	        	jLabel4.setBackground(Color.red);
//	        	jLabel4.setText("網絡連通斷開，您可以嘗試離線遊戲。");
//	        	jButton1.setEnabled(false);
//	        }
	        jLabel4.setOpaque(true);
        	jLabel4.setBackground(Color.yellow);
        	jLabel4.setText("[訊息]  您可能需要額外時間等待數據庫聯結。");
		jButton4.setText("\u8a3b\u518a\u65b0\u7528\u6236");
		jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton4MouseClicked(evt);
			}
		});

		jButton5.setText("\u67e5\u770b\u7a4d\u5206\u699c");
		jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton5MouseClicked(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(48, 48, 48)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(
																						jLabel4,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						334,
																						Short.MAX_VALUE)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(36,
																										36,
																										36)
																								.addComponent(
																										jButton1,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										jButton3,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										95,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jButton2)
																								.addGap(11,
																										11,
																										11)))
																.addGap(126,
																		126,
																		126))
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel3)
																				.addComponent(
																						jLabel2))
																.addGap(40, 40,
																		40)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addComponent(
																						jTextField1)
																				.addComponent(
																						jPasswordField1,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						235,
																						Short.MAX_VALUE))
																.addContainerGap())))
				.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
						508, Short.MAX_VALUE)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(84, Short.MAX_VALUE)
								.addComponent(jButton4,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										151,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(jButton5,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										118,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(137, 137, 137)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										74,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(41, 41, 41)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(jTextField1))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(
														jPasswordField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(13, 13, 13)
								.addComponent(jLabel4)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton1)
												.addComponent(jButton3)
												.addComponent(jButton2))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton5)
												.addComponent(jButton4))
								.addGap(14, 14, 14)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {
		hightestScorePanel h = new hightestScorePanel();
		String s[] = new String[2];
		h.main(s);
	}

	private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {
		RegPanel r = new RegPanel();
		String s[] = new String[2];
		r.main(s);
	}

	private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {

		new StartGame().game();
		this.setVisible(false);
	}

	private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
		String username = jTextField1.getText();
		String password = jPasswordField1.getText();

		Connection login = new Connection();
		LoginConfirmPanel confirm = new LoginConfirmPanel();
		
		if (login.startGameConnection(username, password)) {
			String[] temp = new String[2];
			confirm.main(temp);
			Parameter.username=username;
		    Parameter.password=password;
			this.setVisible(false);

		} else {
			JOptionPane.showMessageDialog(null, "用戶名或密碼錯誤！");

		}

	}

	
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LoginPanel().setVisible(true);
			}
		});
	}


	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JTextField jTextField1;
	

}