package homework0516;

public class RPGgame implements Keypad {
    private int currentMode;

    public RPGgame() {
        currentMode = NORMAL_MODE;
        System.out.println("RPGgame ����");
    }

    @Override
    public void leftUpButton() {
        System.out.println("ĳ���Ͱ� �������� �̵��Ѵ�");
    }

    @Override
    public void leftDownButton() {
        System.out.println("ĳ���Ͱ� �Ʒ������� �̵��Ѵ�.");
    }

    @Override
    public void rightUpButton() {
        if (currentMode == NORMAL_MODE) {
            System.out.println("ĳ���Ͱ� ��ĭ������ �����Ѵ�");
        } else if (currentMode == HARD_MODE) {
            System.out.println("ĳ���Ͱ� ��ĭ������ �����Ѵ�");
        }
    }

    @Override
    public void rightDownButton() {
        if (currentMode == NORMAL_MODE) {
            System.out.println("ĳ���Ͱ� �Ϲ� ����");
        } else if (currentMode == HARD_MODE) {
            System.out.println("ĳ���Ͱ� HIT ����");
        }
    }

    @Override
    public void changeMode() {
        if (currentMode == NORMAL_MODE) {
            currentMode = HARD_MODE;
        } else if (currentMode == HARD_MODE) {
            currentMode = NORMAL_MODE;
        }
        System.out.println("���� ���: " + (currentMode == NORMAL_MODE ? "NORMAL_MODE" : "HARD_MODE"));
    }
}