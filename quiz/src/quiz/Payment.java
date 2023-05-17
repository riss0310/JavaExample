package quiz;

public interface Payment {
	//static final
	//상수
	public double ONLINE_PAYMENT_RATIO = 0.05;
	public double OFFLINE_PAYMENT_RATIO = 0.03;
	
	public int onloine(int price);
	public int offloine(int price);
	public void showInfo();
}
