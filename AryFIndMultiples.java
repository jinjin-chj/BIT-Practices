package Wed;

public class AryFIndMultiples {

	public static void main(String[] args) {
		// 7.���� ���� 10���� ���� �����Ͽ�(�����Լ�), �迭�� �����ϰ�[10], �迭�� �ִ� ���� �߿��� 3�� ���(%3)�� ����غ���.

		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) ((Math.random() * 1000) + 1);

		}
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 3 == 0) {
				System.out.print(num[i] + " ");
			}

		}

	}

}
