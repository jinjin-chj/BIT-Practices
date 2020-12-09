package Tuesday_1208;

import java.util.Scanner;

class ReverseWords { // 객체생성해보자
	private String words;

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public ReverseWords() { // 생성자 함수 생성
	}
	
	public ReverseWords(String words) { 
		this.words = words;

	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 단어를 넣으세요.");
		words = sc.next();
		sc.close();
	}

	public void reversePrint() {
		if (words == null) { // null 체크
			System.out.println("단어 입력이 안되었습니다.");
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
