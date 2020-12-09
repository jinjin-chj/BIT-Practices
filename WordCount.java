package Wed;

public class WordCount {
	private String sentence;
	private String[] words;

	WordCount(String sentence) { // 생성자 만들기
		this.sentence = sentence;
	}

	private void wordSplit() {
		// private으로 바꾼 이유는 아래 캡슐화 한 public만 고객님 편하게 쓰시라고.

		if (sentence == null) { // null체크
			System.out.println("입력값이 없습니다.");
			return;
		}

		this.words = sentence.split(" ");
		// 공백을 기준으로 니(this.words)가 가진걸 잘라라

	}

	private void wordPrint() {

		if (words == null) { // null체크22
			System.out.println("입력값이 없습니다.");
			return;
		}
		System.out.println("단어의 개수는: " + words.length + "개");

		for (int i = 0; i < words.length; i++) {
			System.out.println("단어는: " + words[i]);
		}

	}

	public void getResult() { // 고객님 보기 편하게..캡슐화<<
		wordSplit();
		wordPrint();

	}
}
