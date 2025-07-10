import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
		Table.generateTable();

		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n = sc.nextInt();

		System.out.println("Let's generate table of " + n);
		Table.generateTable(n);
		System.out.println("k="+Table.k);
		System.out.println("Thanks");
	}

	

}
