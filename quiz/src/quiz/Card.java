package quiz;

public class Card {
	String cardNo;
	String validDate;
	int cvc;
	
	public Card(String cardNo, String validDate, int cvc) {
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.cvc = cvc;
	
}

	public String getCardNo() {
		return cardNo;
	}

	public String getValidDate() {
		return validDate;
	}

	public int getcvc() {
		return cvc;
	}	
	public void showCardInfo() {
		System.out.println("Card NO : " + "," + cardNo+ ","+ "유효기간 : "+validDate + "," + "cvc : " + cvc);
	}
	
	
	
	}
