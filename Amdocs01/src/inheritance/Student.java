package inheritance;

public class Student extends Person { // Single
	int rollno = 1;
	int marks = 90;
//	public Student() {
//		System.out.println("Student()");
//	}

	
	public Student(int rollno, int marks) {
		// super(); // Constructor call must be the first statement in a constructor
		System.out.println("Student(int rollno, int marks)");

		this.rollno = rollno;
		this.marks = marks;
	}

	public void printStudent() {
		System.out.println(name + " " + getMobile());
		System.out.println(rollno + " " + marks);
	}

	@Override
	void showIdProof() {
		System.out.println("PAN ****");
	}
}

