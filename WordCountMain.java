package Wed;

import java.util.Scanner;

class WordCountMain {

	public static void main(String[] args) {
		// 클래스 이용ver._ 공백을 기준으로 단어 개수 구하기

		Scanner sc = new Scanner(System.in);
		System.out.println(">> 단어 개수 확인하기 <<");

		while (true) {
			System.out.print("입력: ");

			WordCount wordCount = new WordCount(sc.nextLine());
			wordCount.getResult();
		}
	}

}
