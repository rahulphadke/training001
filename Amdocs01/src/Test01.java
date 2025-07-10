//import java.lang.System;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc;

		System.out.println("Byte demo");
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE + " -------- \n");

		byte b = 125;
//		System.out.println(b++); //125
//		System.out.println(b++); //126
//		System.out.println(b++); //-127
//		System.out.println(b++); //-128

		int x = (byte) (b + 3); //
		System.out.println("b+3=" + (b + 3));
		System.out.println("x=" + x);

//		boolean flag=1;

		short sh = 130;
		System.out.println(sh);
		System.out.printf("\n\n\n %d %20s %10.2f", 4, "Rahul", 3.14);
		System.out.printf("\n%s %s", "\\", "/");

	}

}
