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
		top = -1; // index 번호니까!!
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
		if (top == -1) // 한 개도 없다는 뜻 걍 외워
			return "스택이 비어있습니다.";

		return stack[top--]; 
		// 이렇게 리턴값을 두개 쓴다는건, 아래 리턴은 else일때 리턴값ㅇㅇ!!

	}

	@Override
	public boolean push(String val) {
		if (top == stack.length-1) // 꽉 찼다는 뜻(인덱스라서 -1해줌)
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

		 * System.out.println(stack.pop()); // 제일 나중에 넣은 C가 제일 먼저 출력됨.
		 * System.out.println(stack.pop()); 
		 * System.out.println(stack.pop());
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int num = sc.nextInt();
		StringStack stack = new StringStack(num);

		while (true) {
			System.out.print("문자열 입력 >> ");
			String word = sc.next();

			if (word.equals("그만"))
				break;

			if (!stack.push(word)) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
				break;
			}
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		int len = stack.length();
		for (int i = 0; i < len; i++) {
			String s = stack.pop();
			System.out.print(s + " ");
		}
		sc.close();
	}

}
