/*8.아래의 프로그램을 짜시오.(필수)
	5개의 숫자를 랜덤(랜덤함수사용*5)으로 받아 배열[]로 저장
	5개의 숫자중 가장 큰값을 출력
 */

package Wed;

public class RandomMaxNumber {
	public static void main(String[] args) {

		int[] num = new int[5];

		int max = num[0];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 101); 
							// 범위 걍 재량으로 정함.

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

		System.out.println("가장 큰 숫자는 " + max);

	}

}
