package Tuesday_1208;

//import java.util.Scanner;

public class ReverseWordsMain {
	
	public static void main(String[] args) {
		/* 메인으로만 돌릴 경우
		 * 
		// 문자열 역순으로 출력하는 프로그램 abcde -> edcba
		String words;

		Scanner sc = new Scanner(System.in); // scanner 넘 길어서 sc
		words = sc.nextLine(); // 한 줄을 입력받겠다! 그냥 .next는 공백하나에도 넘어가버림.

		for (int i = words.length() - 1; i >= 0; i--) { // length()-1은 역순이니까,,
			System.out.print(words.charAt(i));
		}
*/
		// .class 객체생성해서 고객님 드릴 경우
		ReverseWords reverseWords = new ReverseWords();
		//reverseWords.input();
		reverseWords.print();
		
	}
	

}
