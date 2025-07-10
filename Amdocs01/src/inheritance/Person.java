package inheritance;

public abstract class Person {
	protected String name = "Abc";
	private String mobile = "123456";
	public Person() {
		System.out.println("Person()");
	}
	public Person(String name, String mobile) {
		System.out.println("Person(String name, String mobile)");
		this.name = name;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	final public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	void printPerson() {
		System.out.println(name + " " + mobile);
	}
	
	abstract void showIdProof() ;
}
