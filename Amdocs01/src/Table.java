
public class Table {
	static int k;
	
	 static void generateTable(int n) { // method overloading
		for (int j = 1; j <= 10; j++) { // Generate the table of n
			System.out.println(n * j);
		}
		System.out.println();
	}

	static void generateTable() { // method overloading

		for (int j = 1; j <= 10; j++) { // Generate the table of 5
			System.out.println(5 * j);
		}
		System.out.println();
	}
}
