package Wed;

import java.util.Scanner;

public class WordCount_OnlyMain {

	public static void main(String[] args) {
		// ������ �������� �ܾ� ���� ���ϱ� (���ο����� ¥�� ����)

		Scanner sc = new Scanner(System.in);
		System.out.println(">> �ܾ� ���� Ȯ���ϱ� <<");

		while (true) { // �������� ���ƾ� �ϴϱ� ���Ϲ�
			System.out.print("�Է�: ");

			String sentence = sc.nextLine();
			// ������� ���� �ϱ� ������ .next�� �ƴ� .nextLine!

			if (sentence.compareToIgnoreCase("stop") == 0) {
				// if(sentence.equals("stop")) {
				System.out.println("���α׷� ����.");
				break;
			}

			String[] words = sentence.split(" "); // ������ �������� �ڸ���.
			System.out.println("�ܾ��� ������: " + words.length + "��");

			// �߰�>> �ܾ� ���ϱ�
			for (int i = 0; i < words.length; i++) {
				System.out.println("�ܾ��: " + words[i]);
				// �ش� ��Ʈ���� ��ü[i]�� ���� �Ǹ� toString(���� ������)�� �ڵ����� ȣ���..

			}

		}
		sc.close();

	}

}
