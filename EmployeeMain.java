package Fri;

class EmployeeMain {

	public static void main(String[] args) {
		Employee person = new Employee("최현진", 5, "서울", "자바클래스");
		Regular regular = new Regular("최현진", 5, "서울", "자바클래스");
		
		person.printInfo();
		regular.setWage(500);	
		// 순서를 맨 밑에 놨더니 메모리에 안 올라서 계속 0원이 나왔던 것.
		regular.printInfo();
	}

}
