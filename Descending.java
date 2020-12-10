/*9.아래의 프로그램을 짜시오.
-5개의 숫자를 랜덤으로 받아 배열로 저장
-5개의 숫자를 내림차순으로 정렬하여 출력
 */
package Thurs;

public class Descending {
	public static void main(String[] args) {
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ((int) (Math.random() * 10)+1);
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}
				/*
				 * if (num[i] == num[j]) { 
				 * i--; 
				 * break; 
				 * }
				 * 
				 * arr[i] = ((int) (Math.random() * 10)+1);
				 * for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

				 */
			}
		}

		
	}

}
