package quiz;

public class SimplePayment implements Payment{

	double cardRatio;
	
	@Override
	public int onloine(int price) {
		int result = (int)(price - (price *(1-Payment.ONLINE_PAYMENT_RATIO+cardRatio)));
		return result;
	}

	@Override
	public int offloine(int price) {
		int result = (int)(price - (price *(1-Payment.OFFLINE_PAYMENT_RATIO+cardRatio)));
		return result;
	}

	@Override
	public void showInfo() {
		
		
	}

}
