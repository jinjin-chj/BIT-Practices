package Fri;

class Employee {
	private String name;
	private int age;
	private String address;
	private String dep;
	int wage; // 필드 선언

	public Employee(String name, int age, String address, String dep) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.dep = dep;
	}
	
	public void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
		System.out.println("주소: " + address);
		System.out.println("부서: " + dep);
	}
}

class Regular extends Employee {

	public void setWage(int wage) {
		this.wage= wage;
	}

	public Regular(String name, int age, String address, String dep) {
		super(name, age, address, dep);
	}
	

	public void printInfo() {
		System.out.println();
		super.printInfo();
		System.out.println("정규직");
		System.out.println("월급: " + super.wage + "만원");
		System.out.println();
	}
}
