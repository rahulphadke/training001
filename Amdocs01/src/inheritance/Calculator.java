package inheritance;

public class Calculator implements Machine, Solar{

	@Override
	public void switchOn() {
		if(isCharged())
			System.out.println("Calculator is on");
		else
			System.out.println("Calculator is not charged");
	}

	@Override
	public void switchOff() {
		System.out.println("Calculator is off");
	}
	
	@Override
	public boolean isCharged() {
		return false;
	}
	
	void add(int a,int b) {
		System.out.println("addition = "+(a+b));
	}
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.switchOn();
		c1.add(4, 5);
		c1.switchOff();
	}

	
}
