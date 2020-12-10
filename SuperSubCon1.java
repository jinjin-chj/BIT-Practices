package Thurs;

class SuperCLS {
	public SuperCLS() {
		System.out.println("I'm Super Class");
	}
}

class SubCLS extends SuperCLS {
	public SubCLS() {
		System.out.println("I'm Sub Class");
	}
}

public class SuperSubCon1 {
	public static void main(String[] args) {
		new SubCLS();	// 객체 생성(메모리에 올리는 것)

	}
}
