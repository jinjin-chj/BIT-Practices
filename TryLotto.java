package Wed;

public class TryLotto {

	public static void main(String[] args) {
		// �ζ� ���α׷� �� �� �� ������
		// 1~45��. 6�� ����. ����. �ߺ� �� ��.
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
		System.out.print("�ζ� ��ȣ: ");
		for (int num : lotto) {
			System.out.print(num + " ");
		}
	}
}
