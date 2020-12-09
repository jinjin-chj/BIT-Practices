package Wed;

public class PartiallyFilledArray {

	public static void main(String[] args) {
		// 2차원 배열의 초기화
		
		int[][] arr = { 	
				{ 11 }, 
				{ 22, 33 }, 
				{ 44, 55, 66 } 
		};

		// 배열의 구조대로 내용 출력
		for (int i = 0; i < arr.length; i++) {	// 행 빼내기
			for (int j = 0; j < arr[i].length; j++) {	// 열 빼내기
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	} //몰라 모르겠어 

}
