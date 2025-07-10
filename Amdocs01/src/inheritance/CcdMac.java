package inheritance;

public class CcdMac extends CoffeeMac{
	private String company="Cafe Coffee Day";
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	// Method Overriding
	void giveCoffee() {
		System.out.println("Here is your CCD coffee");
	}
}
