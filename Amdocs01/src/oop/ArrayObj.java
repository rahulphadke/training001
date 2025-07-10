package oop;

public class ArrayObj {

	public static void main(String[] args) {
		
//		System.out.println(args.length);
//		for(int i=0;i<args.length;i++) {
//			System.out.println(args[i]);
//		}
		
		Person ary[]=new Person[3];
		for(int i=0; i<ary.length; i++) {
			ary[i]=new Person();
			System.out.println(ary[i].getName()); 
		}
		
	}

}
