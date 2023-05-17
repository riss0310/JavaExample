package homework0515;
//
//Question 1]
//		1) Employee Ŭ������ �����Ѵ�.
//			- �̸��� ������ �ʵ�� ������ �����ڸ� �̿��Ͽ� ���� �ʱ�ȭ�Ѵ�.
//			- �� �ʵ��� getter�� �����Ѵ�.
//			- �޼ҵ�� ������ ���� �����Ѵ�.
//			(1) public void getInformation() : �̸��� ������ ����ϴ� ���
//			(2) public void print() : "����Ŭ����"�� ������ ����ϴ� ���
//			
//		2) EmpDept Ŭ������ �����Ѵ�.
//			- Employee Ŭ������ ����Ѵ�.
//			- �߰��� �μ��̸��� �ʵ�� ������ �����ڸ� �̿��Ͽ� ���� �ʱ�ȭ�Ѵ�.
//			- �߰��� �ʵ��� getter�� �����Ѵ�.
//			- Employee Ŭ������ �޼ҵ带 �������̵��Ѵ�.
//			(1) public void getInformation() : �̸��� ����, �μ��� ����ϴ� ���
//			(2) public void print() : "����Ŭ����\n����Ŭ����"�� ������ ����ϴ� ���
//			
//		3) �Ʒ��� ���� ��°���� �������� �����ڵ带 �����Ѵ�.
//		- ��°��
//			�̸�:������  ����:3000  �μ�:������
//			����Ŭ����
//			����Ŭ����

	public class Employee {
	    private String name;
	    private int salary;

	    public Employee(String name, int salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getSalary() {
	        return salary;
	    }

	    public void getInfo() {
	        System.out.println("�̸� : " + name + "  ���� : " + salary);
	    }

	    public void print() {
	        System.out.println("����Ŭ����\n����Ŭ����");
	    }

	}


