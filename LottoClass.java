package Wed;

public class LottoClass {

	// private int[] lotto = new int[6]; // 여기서 로또는 인스턴스 변수
	private int[] lotto; // 이렇게 할 경우 아래 lotto = getLotto(); 가 필요.

	public LottoClass() {
		lotto = getLotto();
	}

	public int[] getLotto() {
		int[] lotto = new int[6]; // 여기서 로또는 지역 변수

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
			System.out.println("번호가 없음");

		System.out.print("로또 번호: ");
		for (int i : lotto) {
			System.out.print(i + " ");
		}
	}

}
