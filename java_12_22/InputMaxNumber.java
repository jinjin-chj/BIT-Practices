package java_12_22;

import java.util.ArrayList;

/*2.Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력받아 저장하고 
검색하여 가장 큰 수를 출력하는 프로그램을 작성하라
정수(-1이 입력될 때까지)>> 10 6 22 6 88 77 -1
가장 큰 수는 88
 */

import java.util.Scanner;

class InputMaxNumber {

	public static void main(String[] args) {
		int num = 0;
		ArrayList<Integer> list = new ArrayList<>(); // 컬렉션 인스턴스 생성
		Scanner sc = new Scanner(System.in);	
		// 스캐너 while문 안에 넣게 되면 다른 결과 나옴
		System.out.print("정수(-1이 입력될 때까지)>> ");
		
		while (num != -1) {
			// 숫자 입력받고 저장
			num = sc.nextInt();
			
			//if (num == -1) // 와일문 탈출 조건으로 넣으면 더 간편하네
				//break;
			
			list.add(num); // 사용자가 입력하는 숫자들 저장됨.
		}

			int maxNum = list.get(0); // 그 중 가장 큰 수
			for (int i = 1; i < list.size(); i++) {
				if (maxNum < list.get(i)) 
					maxNum = list.get(i);	
			}
			
			System.out.println("가장 큰 수는 " + maxNum);
		
	}
}
