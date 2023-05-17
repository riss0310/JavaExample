package quiz;

public class CardPayment implements Payment {

	double cardRatio;
	
	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}
	
	
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
		System.out.println("온라인 결제시 총 할인율 : " + (
				Payment.ONLINE_PAYMENT_RATIO + cardRatio));
		System.out.println("온라인 결제시 총 할인율 : " + (
				Payment.OFFLINE_PAYMENT_RATIO + cardRatio));
	}
}
