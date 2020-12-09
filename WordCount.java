package Wed;

public class WordCount {
	private String sentence;
	private String[] words;

	WordCount(String sentence) { // ������ �����
		this.sentence = sentence;
	}

	private void wordSplit() {
		// private���� �ٲ� ������ �Ʒ� ĸ��ȭ �� public�� ���� ���ϰ� ���ö��.

		if (sentence == null) { // nullüũ
			System.out.println("�Է°��� �����ϴ�.");
			return;
		}

		this.words = sentence.split(" ");
		// ������ �������� ��(this.words)�� ������ �߶��

	}

	private void wordPrint() {

		if (words == null) { // nullüũ22
			System.out.println("�Է°��� �����ϴ�.");
			return;
		}
		System.out.println("�ܾ��� ������: " + words.length + "��");

		for (int i = 0; i < words.length; i++) {
			System.out.println("�ܾ��: " + words[i]);
		}

	}

	public void getResult() { // ���� ���� ���ϰ�..ĸ��ȭ<<
		wordSplit();
		wordPrint();

	}
}
