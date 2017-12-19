/*
 * hightestScore.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import Model.Connection;
import Model.Parameter;

/**
 * 最高分顯示面板，搭配Connection類顯示最高的5個人的分數
 * */
public class hightestScorePanel extends javax.swing.JFrame {


	public hightestScorePanel() {
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
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setIcon(new javax.swing.ImageIcon(
				Parameter.TopBannnerUrl)); // NOI18N

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel2.setText("\u6700\u9ad8\u5206\u5217\u8868");

		jLabel3.setText("\u7b2c\u4e00\u540d");

		jLabel4.setText("\u7b2c\u4e8c\u540d");

		jLabel5.setText("\u7b2c\u4e09\u540d");

		jLabel6.setText("\u7b2c\u56db\u540d");

		jLabel7.setText("\u7b2c\u4e94\u540d");

		jLabel8.setText("jLabel8");

		jLabel9.setText("jLabel9");

		jLabel10.setText("jLabel10");

		jLabel11.setText("jLabel11");

		jLabel12.setText("jLabel12");

		jLabel13.setText("jLabel13");

		jLabel14.setText("jLabel14");

		jLabel15.setText("jLabel15");

		jLabel16.setText("jLabel16");

		jLabel17.setText("jLabel17");
        Connection c=new Connection();
		String s[]=c.highestScore();
		jLabel8.setText(s[0]);
		jLabel9.setText(s[1]);
		jLabel10.setText(s[2]);
		jLabel11.setText(s[3]);
		jLabel12.setText(s[4]);
		jLabel13.setText(s[5]);
		jLabel14.setText(s[6]);
		jLabel15.setText(s[7]);
		jLabel16.setText(s[8]);
		jLabel17.setText(s[9]);
		
		
		
		
		
		
		
		jButton1.setText("\u78ba\u5b9a");
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton1MouseClicked(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel1)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup()
																.addGap(48, 48,
																		48)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel3)
																				.addComponent(
																						jLabel4)
																				.addComponent(
																						jLabel5)
																				.addComponent(
																						jLabel6)
																				.addComponent(
																						jLabel7))
																.addGap(50, 50,
																		50)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel16,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						154,
																						Short.MAX_VALUE)
																				.addComponent(
																						jLabel14,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						154,
																						Short.MAX_VALUE)
																				.addComponent(
																						jLabel12,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						154,
																						Short.MAX_VALUE)
																				.addComponent(
																						jLabel10,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						154,
																						Short.MAX_VALUE)
																				.addComponent(
																						jLabel8,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						154,
																						Short.MAX_VALUE)))
												.addGroup(
														javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup()
																.addGap(168,
																		168,
																		168)
																.addComponent(
																		jLabel2)))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
																.addComponent(
																		jLabel11,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(
																		jLabel13,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(
																		jLabel15,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(
																		jLabel17,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE))
												.addComponent(
														jLabel9,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														113,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(153, 153, 153))
				.addGroup(
						layout.createSequentialGroup()
								.addGap(193, 193, 193)
								.addComponent(jButton1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										74,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(294, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jLabel1)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel2)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(jLabel8)
												.addComponent(jLabel9))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel4)
												.addComponent(jLabel10)
												.addComponent(jLabel11))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel5)
												.addComponent(jLabel12)
												.addComponent(jLabel13))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel6)
												.addComponent(jLabel14)
												.addComponent(jLabel15))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel7)
												.addComponent(jLabel16)
												.addComponent(jLabel17))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jButton1)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		pack();
	}
	private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
		this.setVisible(false);
	}

	
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new hightestScorePanel().setVisible(true);
			}
		});
	}


	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
}