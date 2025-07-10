package oop;

import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.introduce();
		
		Person p2=new Person("Harish",5);
		p2.introduce();
		
		Person p3=p1;
		p3.introduce();
		
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		
		Person temp=p3;
		temp.setName("Kedar");
		
		temp=p2;
		temp.setName("Govind");
		
		p1.introduce();
		p2.introduce();

		p2=null;
		temp=null;
		System.gc();
		
		
		System.out.println("extra line 1");
		// 100 lines
		
		{
			Person temp2=new Person();
			//....
			
		}
		
		System.out.println("extra line 100");
		
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter name and age : ");
//		p2.setName(sc.next());
//		p2.setAge(sc.nextInt());
//		System.out.println("p3's name is "+p2.getName());
//		System.out.println("p3's age is "+p2.getAge());
	
	}
}

