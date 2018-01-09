/*
 * news.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.io.IOException;

import javax.swing.JEditorPane;
import javax.swing.JScrollPane;

import Controller.StartGame;
import Model.Parameter;

public class NewsPanel extends javax.swing.JFrame {


	public NewsPanel() {
		initComponents();
	}

	
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jEditorPane1 = new javax.swing.JEditorPane();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jScrollPane1.setViewportView(jEditorPane1);
		String path = Parameter.newsUrl;
		jEditorPane1.setEditable(false);     //请把editorPane设置为只读，不然显示就不整齐
		try {
			jEditorPane1.setPage(path);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		jButton1.setText("\u958b\u59cb\u904a\u6232");
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
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap(452, Short.MAX_VALUE)
								.addComponent(jButton1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										115,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addComponent(jScrollPane1,
						javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, 579,
						Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 291,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(26, 26, 26)
						.addComponent(jButton1)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		pack();
	}

	private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
		String[] args = new String[2];
		new StartGame().game();
	}

	
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new NewsPanel().setVisible(true);
			}
		});
	}
	private javax.swing.JButton jButton1;
	private javax.swing.JEditorPane jEditorPane1;
	private javax.swing.JScrollPane jScrollPane1;
}