package Fri;

class EmployeeMain {

	public static void main(String[] args) {
		Employee person = new Employee("������", 5, "����", "�ڹ�Ŭ����");
		Regular regular = new Regular("������", 5, "����", "�ڹ�Ŭ����");
		
		person.printInfo();
		regular.setWage(500);	
		// ������ �� �ؿ� ������ �޸𸮿� �� �ö� ��� 0���� ���Դ� ��.
		regular.printInfo();
	}

}
