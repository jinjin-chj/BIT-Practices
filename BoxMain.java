package Wed;

public class BoxMain {

	public static void main(String[] args) {

		BoxTest[] ar = new BoxTest[3];

		// �迭�� �ν��Ͻ� ����
		ar[0] = new BoxTest("First");
		ar[1] = new BoxTest("Second");
		ar[2] = new BoxTest("Third");

		// ����� �ν��Ͻ��� ����
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);

	}

}
