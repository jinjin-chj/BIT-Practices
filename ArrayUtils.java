package Wed;
import java.util.Arrays;
class ArrayUtils {
	public static void main(String[] args) {
		// 배열 초기화와 복사의 예
		
		int[] ar1 = new int[10];
		int[] ar2 = new int[10];

		Arrays.fill(ar1, 7); // 배열 ar1을 7로 초기화
		
		System.arraycopy(ar1, 0, ar2, 3, 4);	
		// ㄴ 배열 ar1을 ar2로 부분 복사
		// (복사할 원본 배열, 원본 배열의 0번째부터 읽어들여라, 
		// 어디로 복사하냐, 복사본의 인덱스 3 자리부터, 4개를)
		
		for (int i = 0; i < ar1.length; i++)
			System.out.print(ar1[i] + " ");
		System.out.println();	// 개행

		for (int i = 0; i < ar2.length; i++)
			System.out.print(ar2[i] + " ");

	}

}
