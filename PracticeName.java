package Tuesday_1208;

import java.util.Scanner;

class PracticeName {
	private String name;
	public String firstName, secondName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���. (�� �̸�)");
		name = sc.nextLine();

		int firstSpace = name.indexOf(" ");
		firstName = name.substring(0, firstSpace);
		secondName = name.substring(firstSpace + 1);
		System.out.println("First name: " + firstName + ", Second name: " + secondName);
		sc.close();
	}

}
