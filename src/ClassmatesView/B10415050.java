package ClassmatesView;

import java.awt.Color;

import javax.swing.JOptionPane;

import Model.Parameter;

public class B10415050 extends AbstractInterfaceSetting{

	@Override
	public void setSqrtState() {
		Parameter.sqrtState=0;
		
	}

	@Override
	public void setInfoPanelPos() {
		Parameter.infoPanelPos=1;
		
	}

	@Override
	public void setWidth() {
		Parameter.WIDTH=35;
		
	}

	@Override
	public void setHeight() {
		Parameter.HEIGHT=40;
		
	}

	@Override
	public void setColor() {
		Parameter.color=Color.blue;
		
	}

	@Override
	public void setBackgroundColor() {
		Parameter.backgroundColor=0xCCCC00;
		
	}
	public void show() {
		JOptionPane.showMessageDialog(null, "您選擇了施心偉的方案");
		
	}

}
