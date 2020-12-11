package Fri;

class Employee {
	private String name;
	private int age;
	private String address;
	private String dep;
	int wage; // �ʵ� ����

	public Employee(String name, int age, String address, String dep) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.dep = dep;
	}
	
	public void printInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age + "��");
		System.out.println("�ּ�: " + address);
		System.out.println("�μ�: " + dep);
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
		System.out.println("������");
		System.out.println("����: " + super.wage + "����");
		System.out.println();
	}
}
