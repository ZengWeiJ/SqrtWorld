/*
 * LoginPanel2.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import javax.swing.JOptionPane;

import ClassmatesView.A10615004;
import ClassmatesView.A10615005;
import ClassmatesView.AbstractInterfaceSetting;
import ClassmatesView.B10415050;
import ClassmatesView.B10415052;
import Controller.StartGame;
import Model.Connection;
import Model.Parameter;

/**
 *
 * @author  __USER__
 */
public class LoginPanel999 extends javax.swing.JFrame {

	/** Creates new form LoginPanel2 */
	public LoginPanel999() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jLabel9 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel12 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jLabel13 = new javax.swing.JLabel();
		jPasswordField1 = new javax.swing.JPasswordField();
		jPasswordField2 = new javax.swing.JPasswordField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setFont(new java.awt.Font("Aharoni", 1, 36));

		jLabel1.setIcon(new javax.swing.ImageIcon(
				"C:\\Users\\workman.hsa\\Desktop\\方塊世界\\===主程序===\\pic\\777.png")); // NOI18N

		jLabel2.setBackground(new java.awt.Color(255, 153, 255));
		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel2.setText("\u6b61\u8fce\u5149\u81e8\u65b9\u584a\u4e16\u754c");
		jLabel2.setOpaque(true);

		jLabel3.setText("\u7528\u6236\u540d");

		jLabel4.setText("\u5bc6\u78bc");

		jLabel5.setText("\u9810\u8a2d\u65b9\u6848");

		jLabel6.setText("\u4f3a\u670d\u5668IP");

		jLabel7.setText("\u6578\u64da\u5eab\u7528\u6236");

		jLabel8.setText("\u6578\u64da\u5eab\u5bc6\u78bc");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"無預設方案", "A10615005", "A10615004", "B10415050", "B10415052" }));

		jLabel9.setBackground(new java.awt.Color(255, 255, 204));
		jLabel9.setText("\u9810\u8a2d\u65b9\u6848\u7528\u65bc\u5be6\u73fe\u591a\u578b\u7684\u8a2d\u8a08\u539f\u5247");
		jLabel9.setOpaque(true);

		jTextField1.setText("ntust");

		jTextField3.setText("140.118.139.207");

		jTextField4.setText("root");

		jLabel10.setBackground(new java.awt.Color(255, 255, 204));
		jLabel10.setText("\u672c\u8edf\u4ef6\u5141\u8a31\u9060\u7a0b\u6578\u64da\u5eab\u7684\u806f\u7d50");
		jLabel10.setOpaque(true);

		jLabel11.setIcon(new javax.swing.ImageIcon(
				"C:\\Users\\workman.hsa\\Desktop\\timg.jpg")); // NOI18N
		jLabel11.setText("jLabel11");

		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jButton1.setText("\u9023\u7dda\u904a\u6232");
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton1MouseClicked(evt);
			}
		});

		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jButton2.setText("\u96e2\u7dda\u904a\u6232");
		jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton2MouseClicked(evt);
			}
		});

		jLabel12.setBackground(new java.awt.Color(255, 153, 153));
		jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jLabel12.setText("\u63a7\u5236\u5340");
		jLabel12.setOpaque(true);

		jButton3.setText("\u8a3b\u518a\u65b0\u7528\u6236");
		jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton3MouseClicked(evt);
			}
		});

		jButton4.setText("\u67e5\u770b\u7a4d\u5206\u699c");
		jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton4MouseClicked(evt);
			}
		});

		jButton5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jButton5.setText("\u9ad8\u7d1a\u8a2d\u7f6e");
		jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton5MouseClicked(evt);
			}
		});

		jButton6.setText("\u958b\u767c\u4eba\u54e1");
		jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton6MouseClicked(evt);
			}
		});

		jButton7.setText("\u9000\u51fa\u904a\u6232");
		jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton7MouseClicked(evt);
			}
		});

		jLabel13.setBackground(new java.awt.Color(51, 255, 255));
		jLabel13.setText("\u5c31\u7dd2");
		jLabel13.setOpaque(true);

		jPasswordField1.setText("ntust");

		jPasswordField2.setText("root");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
						512, Short.MAX_VALUE)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(
														jLabel12,
														javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														437, Short.MAX_VALUE)
												.addComponent(
														jLabel13,
														javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														437, Short.MAX_VALUE)
												.addComponent(
														jButton5,
														javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														437, Short.MAX_VALUE)
												.addComponent(
														jLabel7,
														javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																												.addComponent(
																														jLabel2,
																														javax.swing.GroupLayout.Alignment.LEADING,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														310,
																														Short.MAX_VALUE)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addGroup(
																																		layout.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																				.addComponent(
																																						jLabel5)
																																				.addComponent(
																																						jLabel4)
																																				.addComponent(
																																						jLabel3))
																																.addGroup(
																																		layout.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																				.addGroup(
																																						layout.createSequentialGroup()
																																								.addGap(21,
																																										21,
																																										21)
																																								.addComponent(
																																										jComboBox1,
																																										javax.swing.GroupLayout.PREFERRED_SIZE,
																																										168,
																																										javax.swing.GroupLayout.PREFERRED_SIZE))
																																				.addGroup(
																																						layout.createSequentialGroup()
																																								.addPreferredGap(
																																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																								.addGroup(
																																										layout.createParallelGroup(
																																												javax.swing.GroupLayout.Alignment.LEADING)
																																												.addComponent(
																																														jPasswordField1,
																																														javax.swing.GroupLayout.DEFAULT_SIZE,
																																														250,
																																														Short.MAX_VALUE)
																																												.addComponent(
																																														jTextField1,
																																														javax.swing.GroupLayout.DEFAULT_SIZE,
																																														250,
																																														Short.MAX_VALUE))))))
																								.addGap(30,
																										30,
																										30))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel9,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										333,
																										Short.MAX_VALUE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																.addComponent(
																		jLabel11,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		97,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(
																						jLabel10,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						281,
																						Short.MAX_VALUE)
																				.addComponent(
																						jButton1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						113,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(38, 38,
																		38)
																.addComponent(
																		jButton2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		118,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(
																						jButton6,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						211,
																						Short.MAX_VALUE)
																				.addComponent(
																						jButton3,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						211,
																						Short.MAX_VALUE))
																.addGap(18, 18,
																		18)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addComponent(
																						jButton7,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						jButton4,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						208,
																						Short.MAX_VALUE)))
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel6)
																				.addComponent(
																						jLabel8))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		31,
																		Short.MAX_VALUE)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jPasswordField2,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						346,
																						Short.MAX_VALUE)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																								.addComponent(
																										jTextField4,
																										javax.swing.GroupLayout.Alignment.TRAILING)
																								.addComponent(
																										jTextField3,
																										javax.swing.GroupLayout.Alignment.TRAILING,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										346,
																										Short.MAX_VALUE)))))
								.addGap(63, 63, 63)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										58,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jLabel2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		34,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel3)
																				.addComponent(
																						jTextField1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(14, 14,
																		14)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel4)
																				.addComponent(
																						jPasswordField1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jComboBox1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jLabel5))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jLabel9))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(36, 36,
																		36)
																.addComponent(
																		jLabel11,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		125,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(21, 21, 21)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTextField3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel6))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel7)
												.addComponent(
														jTextField4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel8)
												.addComponent(
														jPasswordField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel10)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jButton1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														39,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														40,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel12)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jButton5,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										34,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jButton4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														36,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														35,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton6)
												.addComponent(jButton7))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel13)
								.addContainerGap(28, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {
		System.exit(0);
	}

	private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {
		JOptionPane.showMessageDialog(null, "開發人員：臺科俄羅斯方塊開發組");
	}

	private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {
		SettingPanel st = new SettingPanel();
		String s[] = new String[2];
		st.main(s);
	}

	private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {
		hightestScorePanel h = new hightestScorePanel();
		String s[] = new String[2];
		h.main(s);
	}

	private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {
		RegPanel r = new RegPanel();
		String s[] = new String[2];
		r.main(s);
	}

	private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {

		new StartGame().game();
		this.setVisible(false);
	}

	private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
		String username = jTextField1.getText();
		String password = jPasswordField1.getText();
		Parameter.url = jTextField3.getText();
		Parameter.newsUrl="http://"+Parameter.url;
		Parameter.DB_URL="jdbc:mysql://"+Parameter.url+":3306/test";
		
		Parameter.USER = jTextField4.getText();
		Parameter.PASS = jPasswordField2.getText();
		Connection login = new Connection();
		LoginConfirmPanel confirm = new LoginConfirmPanel();
		int sl = jComboBox1.getSelectedIndex();
		switch (sl) {
		case 1:
			AbstractInterfaceSetting a10615005 = new A10615005();
			a10615005.show();
			break;
		case 2:
			AbstractInterfaceSetting a10615004 = new A10615004();
			a10615004.show();
			break;
		case 3:
			AbstractInterfaceSetting b10415050 = new B10415050();
			b10415050.show();
			break;
		case 4:
			AbstractInterfaceSetting b10415052 = new B10415052();
			b10415052.show();
			break;
		}
				
		
		if (login.startGameConnection(username, password)) {
			String[] temp = new String[2];
			confirm.main(temp);
			Parameter.username = username;
			Parameter.password = password;
			this.setVisible(false);

		} else {
			JOptionPane.showMessageDialog(null, "用戶名或密碼錯誤！");

		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LoginPanel999().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JPasswordField jPasswordField2;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	// End of variables declaration//GEN-END:variables

}