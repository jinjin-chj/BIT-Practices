/*
 * 로또 프로그램 작성하기.
 * 배열이용. 6개 추출. 1~45번 사이.
 * 중복 없이 추출.
 */
package Wed;

public class Lotto {
	public static void main(String[] args) {

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1; // 1~45

			// 배열을 쓰는 이유 -> 중복 제거를 위해 숫자를 방에 저장해놔야 하니까.
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--; // i를 원래 있던 데로 감소시켜 주고 빠져나와라.
					break;
				}
			}
		}
		System.out.print("로또 번호: ");

		for (int i : lotto) {
			System.out.print(i + " ");
		}
	}
}