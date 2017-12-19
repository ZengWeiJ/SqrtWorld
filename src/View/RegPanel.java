/*
 * Reg.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import javax.swing.JOptionPane;

import Model.Connection;
import Model.Parameter;
/**
 * 用戶註冊面板，搭配Connection類實現用戶註冊
 * */
public class RegPanel extends javax.swing.JFrame {

	
	public RegPanel() {
		initComponents();
	}

	
	public void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jPasswordField1 = new javax.swing.JPasswordField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setIcon(new javax.swing.ImageIcon(
			Parameter.TopBannnerUrl)); 

		jLabel2.setText("\u7528\u6236\u540d");

		jLabel3.setText("\u5bc6\u78bc");

		jButton1.setText("\u78ba\u8a8d");
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton1MouseClicked(evt);
			}
		});

		jButton2.setText("\u53d6\u6d88");
		jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton2MouseClicked(evt);
			}
		});
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
						540, Short.MAX_VALUE)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(77, 77, 77)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel3)
												.addComponent(jLabel2))
								.addGap(25, 25, 25)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addComponent(jPasswordField1)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														239, Short.MAX_VALUE))
								.addGap(163, 163, 163))
				.addGroup(
						layout.createSequentialGroup().addGap(117, 117, 117)
								.addComponent(jButton1).addGap(69, 69, 69)
								.addComponent(jButton2)
								.addContainerGap(240, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										69,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(32, 32, 32)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(28, 28, 28)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(
														jPasswordField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(26, 26, 26)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton2)
												.addComponent(jButton1))
								.addContainerGap(30, Short.MAX_VALUE)));

		pack();
	}

	private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
		if(jTextField1.getText().length()>=8&&jPasswordField1.getText().length()>=8){
		Connection c=new Connection();
		c.reg(jTextField1.getText(), jPasswordField1.getText());
	    this.setVisible(false);}else{
	    	JOptionPane.showMessageDialog(null, "用戶名和密碼長度都必須大於8位！");
	    }
	}

	private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {
		this.setVisible(false);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
	
	}

	
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new RegPanel().setVisible(true);
			}
		});
	}

	
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JTextField jTextField1;
	

}