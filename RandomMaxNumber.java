/*8.�Ʒ��� ���α׷��� ¥�ÿ�.(�ʼ�)
	5���� ���ڸ� ����(�����Լ����*5)���� �޾� �迭[]�� ����
	5���� ������ ���� ū���� ���
 */

package Wed;

public class RandomMaxNumber {
	public static void main(String[] args) {

		int[] num = new int[5];

		int max = num[0];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 101); 
							// ���� �� �緮���� ����.

			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}

			if (num[i] >= max) {
				max = num[i];
			}

		}

		System.out.println("���� ū ���ڴ� " + max);

	}

}
