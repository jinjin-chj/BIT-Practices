package Thurs;

class SuperC {
	static int count = 0;

	public SuperC() {
		count++;
	}
}

class SubC extends SuperC {
	public void showCount() {
		System.out.println(count);
	}
}

public class Super {	// 메인 가진 클래스는 파일명과 동일하게.
	public static void main(String[] args) {
		SuperC obj1 = new SuperC();
		SuperC obj2 = new SuperC();

		SubC obj3 = new SubC();
		obj3.showCount();

	}
}