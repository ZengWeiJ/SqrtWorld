package View;



import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import Model.Parameter;
/**
 * 信息顯示面板，它有兩種形態，由Paramter中的參數決定
 * */

public class InfoPanel extends JFrame{
	public void start() {
		JFrame jf=new JFrame();
		Container c=new Container();
		JLabel jl=new JLabel("遊戲說明");
		JButton jb1=new JButton("高級設定");
		JButton jb2=new JButton("遊戲加速");
		JButton jb3=new JButton("遊戲減速");
		JButton jb4=new JButton("成為會員");
		JTextArea jt2=new JTextArea("按上方向鍵變形，按左方向鍵向左移動" +
				"按右方向鍵像右移動，按下方向鍵加速下落。如果第一個圖形沒有出現，" +
				"請長按知道將它拖到最下方。");
		if(Parameter.infoPanelPos==1){
			jf.setBounds(Parameter.WIDTH * Parameter.CELL_SIZE+10,
					0, 150, Parameter.HEIGHT * Parameter.CELL_SIZE+35);
		
		jl.setBounds(0, 10, 150, 25);
		jt2.setBounds(0, 50, 140, 100);
		jb1.setBounds(15, 200, 100, 25);
		jb2.setBounds(15, 235, 100, 25);
		jb3.setBounds(15, 270, 100, 25);
		jb4.setBounds(15, 320, 100, 25);}
		if(Parameter.infoPanelPos==2){
			jf.setBounds(0,
					Parameter.HEIGHT * Parameter.CELL_SIZE+35, 
					Parameter.WIDTH * Parameter.CELL_SIZE+10,100 );
		
		jl.setBounds(0, 0, 0, 0);
		jt2.setBounds(0, 0, Parameter.WIDTH * Parameter.CELL_SIZE+10, 20);
		jb1.setBounds(10, 30, 100, 25);
		jb2.setBounds(120, 30, 100, 25);
		jb3.setBounds(230, 30, 100, 25);
		jb4.setBounds(340, 30, 100, 25);}
		
		
		
		
		
		
		jt2.setEnabled(false);
		jt2.setLineWrap(true);
		jb1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String args[]=null;
				new SettingPanel().main(args);
				
			}});
		jb2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(Parameter.speed>500){
				Parameter.speed-=100;}else{
					JOptionPane.showMessageDialog(null, "已經是最大速度！");
				}
				
			}});
		jb3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(Parameter.speed<2000){
				Parameter.speed+=100;}else{
					JOptionPane.showMessageDialog(null, "已經是最小速度！");
				}
				
			}});
		jb4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				ShopPanel s=new ShopPanel();
				String s2[]=new String[2];
				s.main(s2);
			}});
		c.add(jl);
		c.add(jt2);
		c.add(jb1);
		c.add(jb2);
		c.add(jb3);
		c.add(jb4);
		jf.add(c);
		//jf.setUndecorated(true);
		jf.setVisible(true);
	}
}

