package java_12_16;

import java.util.Scanner;

interface Stack {
	int length();

	// int capacity();

	String pop();

	boolean push(String val);
}

class StringStack implements Stack {
	private String stack[];
	private int top;

	StringStack(int length) {
		stack = new String[length];
		top = -1; // index ��ȣ�ϱ�!!
	}

	@Override
	public int length() {

		return stack.length;
	}

	/*
	 * @Override public int capacity() {
	 * 
	 * return stack.length; }
	 */
	
	@Override
	public String pop() {
		if (top == -1) // �� ���� ���ٴ� �� �� �ܿ�
			return "������ ����ֽ��ϴ�.";

		return stack[top--]; 
		// �̷��� ���ϰ��� �ΰ� ���ٴ°�, �Ʒ� ������ else�϶� ���ϰ�����!!

	}

	@Override
	public boolean push(String val) {
		if (top == stack.length-1) // �� á�ٴ� ��(�ε����� -1����)
			return false;

		stack[++top] = val;
		return true;
	}

}

public class StackApp {
	public static void main(String[] args) {
		/*
		 * StringStack stack = new StringStack(3); 
		 * stack.push("A"); 
		 * stack.push("B");
		 * stack.push("C"); 

		 * System.out.println(stack.pop()); // ���� ���߿� ���� C�� ���� ���� ��µ�.
		 * System.out.println(stack.pop()); 
		 * System.out.println(stack.pop());
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		int num = sc.nextInt();
		StringStack stack = new StringStack(num);

		while (true) {
			System.out.print("���ڿ� �Է� >> ");
			String word = sc.next();

			if (word.equals("�׸�"))
				break;

			if (!stack.push(word)) {
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");
				break;
			}
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		int len = stack.length();
		for (int i = 0; i < len; i++) {
			String s = stack.pop();
			System.out.print(s + " ");
		}
		sc.close();
	}

}
