package ClassmatesView;

public abstract class AbstractInterfaceSetting {
	public AbstractInterfaceSetting(){
		setSqrtState();
		setInfoPanelPos();
		setWidth();
		setHeight();
		setColor();
		setBackgroundColor();
		
	}
	public abstract void setSqrtState();
	public abstract void setInfoPanelPos();
	public abstract void setWidth();
	public abstract void setHeight();
	public abstract void setColor();
	public abstract void setBackgroundColor();
	public abstract void show();
}
