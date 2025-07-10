package inheritance;

public class InterfaceMain {

	public static void main(String[] args) {
		Machine m=new CcdMac();
		m.switchOn();
		m.switchOn();
		
		m=new Calculator();
		m.switchOn();
		m.switchOff();
		
		
	}

}
