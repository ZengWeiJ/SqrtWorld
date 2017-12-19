/*
 * shop.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import javax.swing.Icon;
import javax.swing.JOptionPane;

import Model.Connection;
import Model.Parameter;

/**
 * 高級會員充值面板面板
 * */
public class ShopPanel extends javax.swing.JFrame {


	public ShopPanel() {
		initComponents();
	}

	
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setIcon(new javax.swing.ImageIcon(
			Parameter.TopBannnerUrl)); 

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel2.setText("\u5145\u503c\u6703\u54e1");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel3.setText("\u8acb\u8f38\u5165\u5145\u503c\u5bc6\u78bc");

		jButton1.setText("\u5145\u503c");
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton1MouseClicked(evt);
			}
		});

		jButton2.setText("\u653e\u68c4");
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
				.addComponent(jLabel1)
				.addGroup(
						layout.createSequentialGroup().addGap(166, 166, 166)
								.addComponent(jLabel3))
				.addGroup(
						layout.createSequentialGroup()
								.addGap(149, 149, 149)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING,
												false)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jButton1)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(
																		jButton2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		65,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														165,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addGroup(
						layout.createSequentialGroup().addGap(184, 184, 184)
								.addComponent(jLabel2)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jLabel1)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel2)
								.addGap(14, 14, 14)
								.addComponent(jLabel3)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jTextField1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton2)
												.addComponent(jButton1))
								.addGap(22, 22, 22)));

		pack();
	}

	private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
		Connection c=new Connection();
		if(c.verMem(jTextField1.getText())){
			JOptionPane.showMessageDialog(null, "您已經成為高級會員！感謝您的使用！");
		}else{
			JOptionPane.showMessageDialog(null, "充值密碼輸入錯誤！請重新輸入");
		}
	}

	private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {
		this.setVisible(false);
	}

	
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ShopPanel().setVisible(true);
			}
		});
	}

	
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JTextField jTextField1;
	

}