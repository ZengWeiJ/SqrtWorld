/*
 * resultPanel.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import javax.swing.JOptionPane;

import Controller.StartGame;
import Model.Parameter;
import Model.Connection;
/**
 * 結果顯示面板，顯示用戶得分，如果最高分提交數據庫
 * */

public class ResultPanel extends javax.swing.JFrame {


	public ResultPanel() {
		initComponents();
		Parameter.isGameing = 0;
	}
	
	private void initComponents() {
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		Connection c=new Connection();
		c.sendHightestScoreConnection();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setIcon(new javax.swing.ImageIcon(
				Parameter.TopBannnerUrl)); 

		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("\u904a\u6232\u7d50\u679c");

		jButton1.setText("\u518d\u4f86\u4e00\u5c40");
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton1MouseClicked(evt);
			}
		});
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u7d50\u675f\u904a\u6232");
		jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton2MouseClicked(evt);
			}
		});

		jLabel3.setText("\u7528\u6236\u540d");

		jLabel4.setText("\u672c\u5c40\u5f97\u5206");

		jLabel5.setText("\u6700\u9ad8\u5f97\u5206");

		jButton3.setText("\u6392\u884c\u699c");
		jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton3MouseClicked(evt);
			}
		});

		jLabel6.setText(Parameter.username);

		jLabel7.setText(Parameter.score+"");

		jLabel8.setText(Parameter.hiscore+"");
		if(Parameter.hiscore<Parameter.score){
			//JOptionPane.showMessageDialog(null, "恭喜刷新紀錄！");
			Parameter.hiscore=Parameter.score;
			Parameter.score=0;
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
								.addGap(144, 144, 144)
								.addComponent(jLabel2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										206,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(150, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
								.addGap(96, 96, 96)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup()
																.addComponent(
																		jButton3,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		93,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(14, 14,
																		14)
																.addComponent(
																		jButton1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		90,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		jButton2))
												.addGroup(
														javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel3)
																				.addComponent(
																						jLabel4)
																				.addComponent(
																						jLabel5))
																.addGap(36, 36,
																		36)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel8)
																				.addComponent(
																						jLabel7)
																				.addComponent(
																						jLabel6))))
								.addGap(114, 114, 114)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										59,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(14, 14, 14)
								.addComponent(jLabel2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										27,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(20, 20, 20)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(jLabel6))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel4)
												.addComponent(jLabel7))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel5)
												.addComponent(jLabel8))
								.addGap(11, 11, 11)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton3)
												.addComponent(jButton1)
												.addComponent(jButton2))
								.addContainerGap()));

		pack();
	}

	private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {
		hightestScorePanel h=new hightestScorePanel();
		String[] temp = new String[2];
		h.main(temp);
	}

	private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {
		System.exit(0);
	}

	private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
		new InfoPanel().start();
		new StartGame().game();
		Parameter.isShowedResultPanel=0;
		this.setVisible(false);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		
	}

	
	public void result() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ResultPanel().setVisible(true);
			}
		});
	}

	
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	

}