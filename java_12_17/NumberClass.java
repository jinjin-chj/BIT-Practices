package java_12_17;

class NumberClass {

	public static void main(String[] args) {

		Integer num1 = new Integer(29);
		System.out.println(num1.intValue());
		System.out.println(num1.doubleValue());

		Double num2 = new Double(3.14);
		System.out.println(num2.intValue());
		System.out.println(num2.doubleValue());

		System.out.println();

		Integer n1 = Integer.valueOf(5);
		int n2 = Integer.valueOf("1024");

		System.out.println("ū ��: " + Integer.max(n1, n2));
		System.out.println("���� ��: " + Integer.min(n1, n2));
		System.out.println("��: " + Integer.sum(n1, n2));
		System.out.println();

		System.out.println("12�� 2�� ǥ��: " + Integer.toBinaryString(12));
		System.out.println("12�� 8�� ǥ��: " + Integer.toOctalString(12));
		System.out.println("12�� 16�� ǥ��: " + Integer.toHexString(12));

	}

}
