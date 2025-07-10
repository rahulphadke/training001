//Print multiplication tables from 1 to 10
// Expected Output :
//	1	2	3
//	2	4	6
//	3	6	9
//	4	8	12
//	5	10	15
//	6	12	18
//	7	14	21
//	8	16	24
//	9	18	27
//	10	20	30

public class Loop1 {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
//			System.out.println("i="+i);
			
			for(int j=1;j<=10;j++) { 	// Generate the table of i
				System.out.printf(" %5d",i*j);
			}
			System.out.println();
			i++;
		}
		System.out.println("Thanks");
	}

}
