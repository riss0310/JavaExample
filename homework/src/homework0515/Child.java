package homework0515;

public class Child extends Employee{
	
	
	String name;
	int income;
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("이릉 : "+ name +"연봉 : "income);
	}
	
	
	
	
}
