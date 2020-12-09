package Wed;

public class LottoClass {

	// private int[] lotto = new int[6]; // ���⼭ �ζǴ� �ν��Ͻ� ����
	private int[] lotto; // �̷��� �� ��� �Ʒ� lotto = getLotto(); �� �ʿ�.

	public LottoClass() {
		lotto = getLotto();
	}

	public int[] getLotto() {
		int[] lotto = new int[6]; // ���⼭ �ζǴ� ���� ����

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		return lotto;
	}

	public void printLottoNum() {
		if (lotto == null)
			System.out.println("��ȣ�� ����");

		System.out.print("�ζ� ��ȣ: ");
		for (int i : lotto) {
			System.out.print(i + " ");
		}
	}

}
