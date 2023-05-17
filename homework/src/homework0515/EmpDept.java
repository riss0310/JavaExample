package homework0515;

public class EmpDept extends Employee {
    private String dept;

    public EmpDept(String name, int salary, String dept) {
        super(name, salary);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("�μ� : " + dept);
    }


    public void print() {
        super.print();
        System.out.println("����Ŭ����\n����Ŭ����");
    }
}