package Wed;

import java.util.Scanner;

class WordCountMain {

	public static void main(String[] args) {
		// Ŭ���� �̿�ver._ ������ �������� �ܾ� ���� ���ϱ�

		Scanner sc = new Scanner(System.in);
		System.out.println(">> �ܾ� ���� Ȯ���ϱ� <<");

		while (true) {
			System.out.print("�Է�: ");

			WordCount wordCount = new WordCount(sc.nextLine());
			wordCount.getResult();
		}
	}

}
