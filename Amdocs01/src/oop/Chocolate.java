package oop;

public class Chocolate {
	static String company="Cadburry";
	String brand="Dairy milk";
	
	public static void main(String[] args) {
		System.out.println(Chocolate.company);
		
		Chocolate c1=new Chocolate();
		c1.brand="5 star";
		System.out.println(c1.brand);
		
		Chocolate c2=new Chocolate();
		c2.brand="10 star";
		System.out.println(c2.brand);
	}
}
