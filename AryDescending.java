/*9.�Ʒ��� ���α׷��� ¥�ÿ�.
-5���� ���ڸ� �������� �޾� �迭�� ����
-5���� ���ڸ� ������������ �����Ͽ� ���
 */
package Wed;

public class AryDescending {
	public static void main(String[] args) {
		int[] num = new int[5];

		for (int i = 0; i < num.length; i++) {
			num[i] = ((int) (Math.random() * 1000));
			
			for (int j = i + 1; j < num.length; j++) {
				
				if (num[i] < num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
				/*
				if (num[i] == num[j]) {
					i--;
					break;
				}
				*/
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+ " ");
			
		}

	}

}
