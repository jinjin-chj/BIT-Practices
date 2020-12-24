package java_12_23;

import java.util.LinkedList;
import java.util.Queue;

class LinkedListQueue {

	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();	// 링크드리스트 인스턴스 생성
		que.offer("Box");
		que.offer("Toy");
		que.offer("Robot");

		// 무엇이 다음에 나올지 확인
		System.out.println("next: " + que.peek());

		// 첫 번째, 두 번째 인스턴스 꺼내기
		System.out.println(que.poll());
		System.out.println(que.poll());

		// 무엇이 다음에 나올지 확인
		System.out.println("next: " + que.peek());

		// 마지막 인스턴스 꺼내기
		System.out.println(que.poll());

	}

}
