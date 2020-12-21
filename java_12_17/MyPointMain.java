package java_12_17;

/* Point(3,50)
 * �ٸ���
 */
class MyPoint {
	int num1, num2;

	public MyPoint(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public String toString() {
		return ("Point(" + num1 + "," + num2 + ")");
	}
}

public class MyPointMain {

	public static void main(String[] args) {

		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);

		System.out.println(p);

		if (p.equals(q))
			System.out.println("���� ��");
		else
			System.out.println("�ٸ� ��");

	}
}
