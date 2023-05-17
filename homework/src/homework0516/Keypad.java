package homework0516;

public interface Keypad{
	public static final int NORMAL_MODE = 0;
	public static final int HARD_MODE = 1;
	
	public abstract void leftUpButton();
	public abstract void leftDownButton();
	public abstract void RightUpButton();
	public abstract void RightDownButton();
	public abstract void changeMode();
	void rightDownButton();
	
}
