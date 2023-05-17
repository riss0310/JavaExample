package quiz;

public class DGBCard extends Card{
	
	String company = "대구은행";
	String cardStaff;
	
	public DGBCard(String cardNo, String validDate, int CVC) {
		super(cardNo, validDate, CVC);
	}
	public DGBCard(String company, String cardStaff,String cardNo, String validDate, int CVC) {
		super(cardNo, validDate, CVC);
		this.company = company;
		this.cardStaff= cardStaff;
	}
	public DGBCard(String cardStaff,String cardNo, String validDate, int CVC) {
		super(cardNo, validDate, CVC);
		this.cardStaff= cardStaff;
	}
	
	@Override
	public void showCardInfo() {
		super.showCardInfo();
		System.out.println("담당직원 - "+ "cardStaff" + "," + company);
	}
	
	
	
}
