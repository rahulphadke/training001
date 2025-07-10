package inheritance;

public class Overriding {
	public static void main(String[] args) {
//		1) Give choice
//		if CCD  new CcdMac();
//		if Brb new BrookbondMac();
		
		useSomeCofeeMac(new CcdMac());
		useSomeCofeeMac(new BrookbondMac());
	}


	static void useSomeCofeeMac(CoffeeMac mac){ // CoffeeMac mac=new BrookbondMac()
		System.out.println(mac.isReady());
//		2) if CCD 
		if (mac instanceof CcdMac) { // checking if mac points to CcdMac type of object
			// DownCasting to call getCompany()
			System.out.println("Machine company : " + ((CcdMac) mac).getCompany()); 
			mac.giveCoffee(); // calling overridden method using base class reference
		}
//		3) else
		if (mac instanceof BrookbondMac) {
			System.out.println("Machine company : " + ((BrookbondMac) mac).getCompany());
			mac.giveCoffee(); // calling overridden method using base class reference
			((BrookbondMac) mac).giveTea();
		}
	}
}


