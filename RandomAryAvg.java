/*12.������ 10�� �����ϴ� �迭�� ����� [10]
1���� 10���� ������ ������ �����ϰ�(�����Լ�) �����Ͽ� �迭�� �����϶�. 
�׸��� �迭�� �� ���ڵ�� 
����� ����϶�.(�ʼ�)

������ ������ : 3 6 3 6 1 3 8 9 6 9 // �ߺ� ����
����� 5.4
 */
package Wed;

public class RandomAryAvg {
	public static void main(String[] args) {
		int[] ary = new int[10];

		for (int i = 0; i < ary.length; i++) {
			ary[i] = (int) ((Math.random() * 10) + 1);

		}
		System.out.print("������ ������ : ");
		for (int i : ary) {
			System.out.print(i + " ");
		}
		System.out.println(); // ����

		int sum = 0;
		for (int e : ary) {
			sum += e;
		}
		double avg = 0;
		avg = sum / 10.0;

		System.out.print("����� " + avg);

	}

}
