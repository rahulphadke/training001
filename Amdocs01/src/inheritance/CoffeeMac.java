package inheritance;

public abstract class CoffeeMac implements Machine {
	private int qtyCofee;
	private int qtyMilk;
	public CoffeeMac(){
		System.out.println("CoffeeMac()");
	}
	public CoffeeMac(int qtyCofee, int qtyMilk) {
		this.qtyCofee = qtyCofee;
		this.qtyMilk = qtyMilk;
	}


	abstract void giveCoffee();

	/*
	 * { System.out.println("Here is standard coffee"); }
	 */

	boolean isReady() {
		System.out.println("Yes its ready with "+qtyCofee+"kg coffee and "+qtyMilk+"L milk");
		return true;
	}
	
	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		
	}
}
