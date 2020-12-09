/*9.아래의 프로그램을 짜시오.
-5개의 숫자를 랜덤으로 받아 배열로 저장
-5개의 숫자를 내림차순으로 정렬하여 출력
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
