package Wed;

public class BoxMain {

	public static void main(String[] args) {

		BoxTest[] ar = new BoxTest[3];

		// 배열에 인스턴스 저장
		ar[0] = new BoxTest("First");
		ar[1] = new BoxTest("Second");
		ar[2] = new BoxTest("Third");

		// 저장된 인스턴스의 참조
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);

	}

}
