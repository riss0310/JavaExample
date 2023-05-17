package homework0516;

public abstract class RPGgame implements Keypad{

	public int NORMAL_MODE = 0;
	public int HARD_MODE = 0;
	System.out.println("RPGgame 실행");
	
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다");
	}

	@Override
	public void RightUpButton(NORMAL_MODE) {
		
	}

	@Override
	public void RightDownButton() {
		System.out.println();
	}

	@Override
	public void changeMode() {
		System.out.println();
	}

	
}

