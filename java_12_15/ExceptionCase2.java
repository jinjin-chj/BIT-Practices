package java_12_15;

import java.util.Scanner;

class ExceptionCase2 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);

		try {
			System.out.print("a/b...a? ");
			int n1 = kb.nextInt();
			System.out.print("a/b...b? ");
			int n2 = kb.nextInt();
			System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2);
		} 
		/*
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}*/
		catch (Exception e) {
			e.printStackTrace();	// �̷��� ���� �ٸ� ���ܵ� ���� ����. JVM�� ��ü�� �Ѹ�. ���� �ƴ�.
		}

		System.out.println("Good Bye~!");

	}

}
