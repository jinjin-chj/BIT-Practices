/*
 * �ζ� ���α׷� �ۼ��ϱ�.
 * �迭�̿�. 6�� ����. 1~45�� ����.
 * �ߺ� ���� ����.
 */
package Wed;

public class Lotto {
	public static void main(String[] args) {

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1; // 1~45

			// �迭�� ���� ���� -> �ߺ� ���Ÿ� ���� ���ڸ� �濡 �����س��� �ϴϱ�.
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--; // i�� ���� �ִ� ���� ���ҽ��� �ְ� �������Ͷ�.
					break;
				}
			}
		}
		System.out.print("�ζ� ��ȣ: ");

		for (int i : lotto) {
			System.out.print(i + " ");
		}
	}
}