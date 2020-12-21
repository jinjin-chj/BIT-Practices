package java_12_17;

/* Point(3,50)
 * 다른점
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
			System.out.println("같은 점");
		else
			System.out.println("다른 점");

	}
}
