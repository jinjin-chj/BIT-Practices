package Wed;

public class TryLotto {

	public static void main(String[] args) {
		// 로또 프로그램 한 번 더 만들어보자
		// 1~45번. 6개 추출. 랜덤. 중복 안 됨.
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) ((Math.random() * 45) + 1);

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("로또 번호: ");
		for (int num : lotto) {
			System.out.print(num + " ");
		}
	}
}
