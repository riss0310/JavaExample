package quiz;

public class TossCard extends Card{
	
	String company = "Toss";
	String cardStaff;
	
	public TossCard(String cardNo, String validDate, int CVC) {
		super(cardNo, validDate, CVC);
	}
	public TossCard(String company, String cardStaff,String cardNo, String validDate, int CVC) {
		super(cardNo, validDate, CVC);
		this.company = company;
		this.cardStaff = cardStaff;
	
	}
	public TossCard(String cardStaff,String cardNo, String validDate, int CVC) {
		super(cardNo, validDate, CVC);
		this.cardStaff = cardStaff;
	}
	
	@Override
	public void showCardInfo() {
		super.showCardInfo();
		System.out.println("담당직원 - "+ "cardStaff" + "," + company);
	}

	
	
	
}
