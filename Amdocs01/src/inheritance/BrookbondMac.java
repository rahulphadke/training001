package inheritance;

public class BrookbondMac extends CoffeeMac{
	private String company="Brookbond";
	public BrookbondMac(String company,int qtyCofee,int qtyMilk){
		super(qtyCofee,qtyMilk);
		this.company=company;
	}
	public String getCompany() {
		return company;
	}
//	private void setCompany(String company) {
//		this.company = company;
//	}
	
	// Method Overriding
	@Override
	void giveCoffee() {
		System.out.println("Here is your Brookbond coffee");
	}
	
	void giveTea() {
		System.out.println("Enjoy Brookbond Tea !!");
	}
	
	
}
