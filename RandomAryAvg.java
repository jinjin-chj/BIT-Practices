/*12.정수를 10개 저장하는 배열을 만들고 [10]
1에서 10까지 범위의 정수를 랜덤하게(랜덤함수) 생성하여 배열에 저장하라. 
그리고 배열에 든 숫자들과 
평균을 출력하라.(필수)

랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9 // 중복 가능
평균은 5.4
 */
package Wed;

public class RandomAryAvg {
	public static void main(String[] args) {
		int[] ary = new int[10];

		for (int i = 0; i < ary.length; i++) {
			ary[i] = (int) ((Math.random() * 10) + 1);

		}
		System.out.print("랜덤한 정수들 : ");
		for (int i : ary) {
			System.out.print(i + " ");
		}
		System.out.println(); // 개행

		int sum = 0;
		for (int e : ary) {
			sum += e;
		}
		double avg = 0;
		avg = sum / 10.0;

		System.out.print("평균은 " + avg);

	}

}
