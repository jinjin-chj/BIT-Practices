package Tuesday_1208;

import java.util.Scanner;

class ReverseWords { // ��ü�����غ���
	private String words;

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public ReverseWords() { // ������ �Լ� ����
	}
	
	public ReverseWords(String words) { 
		this.words = words;

	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��� �ܾ ��������.");
		words = sc.next();
		sc.close();
	}

	public void reversePrint() {
		if (words == null) { // null üũ
			System.out.println("�ܾ� �Է��� �ȵǾ����ϴ�.");
			return;
		}
		for (int i = words.length() - 1; i >= 0; i--) {
			System.out.print(words.charAt(i));
		}
	}

	public void print() {

		input();
		reversePrint();
	}

}
