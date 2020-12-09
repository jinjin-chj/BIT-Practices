package Wed;

import java.util.Scanner;

public class WordCount_OnlyMain {

	public static void main(String[] args) {
		// 공백을 기준으로 단어 개수 구하기 (메인에서만 짜는 버전)

		Scanner sc = new Scanner(System.in);
		System.out.println(">> 단어 개수 확인하기 <<");

		while (true) { // 연속으로 돌아야 하니까 와일문
			System.out.print("입력: ");

			String sentence = sc.nextLine();
			// 공백까지 들어가야 하기 때문에 .next가 아닌 .nextLine!

			if (sentence.compareToIgnoreCase("stop") == 0) {
				// if(sentence.equals("stop")) {
				System.out.println("프로그램 종료.");
				break;
			}

			String[] words = sentence.split(" "); // 공백을 기준으로 자른다.
			System.out.println("단어의 개수는: " + words.length + "개");

			// 추가>> 단어 구하기
			for (int i = 0; i < words.length; i++) {
				System.out.println("단어는: " + words[i]);
				// 해당 스트링에 객체[i]가 들어가게 되면 toString(글자 빼오기)이 자동으로 호출됨..

			}

		}
		sc.close();

	}

}
