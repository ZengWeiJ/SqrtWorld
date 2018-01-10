package ClassmatesView;

import java.awt.Color;

import javax.swing.JOptionPane;

import Model.Parameter;

public class A10615004 extends AbstractInterfaceSetting{

	@Override
	public void setSqrtState() {
		Parameter.sqrtState=1;
		
	}

	@Override
	public void setInfoPanelPos() {
		Parameter.infoPanelPos=0;
		
	}

	@Override
	public void setWidth() {
		Parameter.WIDTH=30;
		
	}

	@Override
	public void setHeight() {
		Parameter.HEIGHT=35;
		
	}

	@Override
	public void setColor() {
		Parameter.color=Color.red;
		
	}

	@Override
	public void setBackgroundColor() {
		Parameter.backgroundColor=0xCC00CC;
		
	}
	
	public void show() {
		JOptionPane.showMessageDialog(null, "您選擇了曾偉傑的方案");
		
	}

}
