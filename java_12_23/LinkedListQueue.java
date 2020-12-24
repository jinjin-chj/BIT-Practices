package java_12_23;

import java.util.LinkedList;
import java.util.Queue;

class LinkedListQueue {

	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();	// ��ũ�帮��Ʈ �ν��Ͻ� ����
		que.offer("Box");
		que.offer("Toy");
		que.offer("Robot");

		// ������ ������ ������ Ȯ��
		System.out.println("next: " + que.peek());

		// ù ��°, �� ��° �ν��Ͻ� ������
		System.out.println(que.poll());
		System.out.println(que.poll());

		// ������ ������ ������ Ȯ��
		System.out.println("next: " + que.peek());

		// ������ �ν��Ͻ� ������
		System.out.println(que.poll());

	}

}
