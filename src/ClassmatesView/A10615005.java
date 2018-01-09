package ClassmatesView;

import java.awt.Color;

import javax.swing.JOptionPane;

import Model.Parameter;

public class A10615005 extends AbstractInterfaceSetting{

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
		Parameter.WIDTH=25;
		
	}

	@Override
	public void setHeight() {
		Parameter.HEIGHT=30;
		
	}

	@Override
	public void setColor() {
		Parameter.color=Color.blue;
		
	}

	@Override
	public void setBackgroundColor() {
		Parameter.backgroundColor=0xFFCCCC;
		
	}
	public void show() {
		JOptionPane.showMessageDialog(null, "您選擇了包含的方案");
		
	}

}
