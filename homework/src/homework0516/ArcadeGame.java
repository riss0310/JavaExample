package homework0516;

public class ArcadeGame implements Keypad {
    private int currentMode;

    public ArcadeGame() {
        currentMode = NORMAL_MODE;
        System.out.println("ArcadeGame ����");
    }

    @Override
    public void leftUpButton() {
        System.out.println("ĳ���Ͱ� �������� �̵��Ѵ�.");
    }

    @Override
    public void leftDownButton() {
        System.out.println("ĳ���Ͱ� �������� �̵��Ѵ�");
    }

    @Override
    public void rightUpButton() {
        if (currentMode == NORMAL_MODE) {
            System.out.println("ĳ���Ͱ� �Ϲ� ����");
        } else if (currentMode == HARD_MODE) {
            System.out.println("ĳ���Ͱ� ���� ����");
        }
    }

 
	@Override
    public void rightDownButton() {
        if (currentMode == NORMAL_MODE) {
            System.out.println("ĳ���Ͱ� HIT ����");
        } else if (currentMode == HARD_MODE) {
            System.out.println("ĳ���Ͱ� Double HIT ����");
        }
    }

    public void changeMode() {
        if (currentMode == NORMAL_MODE) {
            currentMode = HARD_MODE;
        }
    }
}