package oop;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	public Person() {
		System.out.println("Default constructor : Object is created without arguments");
		name="Anand";
		age=30;
	}
	public Person(String name,int a) {
		this.name=name;
		age=a;
	}
	void introduce() {
		// this refers to calling object of the method
		System.out.println("My name is "+name+ " , and age is "+age);
		// or System.out.println("My name is "+this.name+ " , and age is "+this.age);
	}
	void happyBirthDay(){
		// this should greet the user with Happy birth day message and print his age incremented by 1
		age++;
		System.out.println("Happy birth day dear "+name+". Your age is "+age);
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public static void main(String[] args) {
		Person p1=new Person(); // Anand, 30
//		p1.name="A";
//		p1.age=10;
		p1.introduce();
		Person p2=new Person("Prashant", 25); // 
//		p2.name="B";
//		p2.age=20;
		p2.introduce();
		System.out.println(" -------------------- ");
		p1.happyBirthDay();
		p1.introduce();
		System.out.println(" -------------------- ");
		System.out.println("p1's name is "+p1.getName());
		System.out.println("p1's age is "+p1.getAge());
		
		// Create an object of Person type, accept its data from user and print the object
		
		Person p3=new Person();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and age : ");
		String n=sc.next();
		int a=sc.nextInt();
		
		System.out.println("n="+n+" a="+a);
		p3.name=n;
		p3.setName(n);
		p3.setAge(a);
		System.out.println("p3's name is "+p3.getName());
		System.out.println("p3's age is "+p3.getAge());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
