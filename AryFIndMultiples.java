package Wed;

public class AryFIndMultiples {

	public static void main(String[] args) {
		// 7.양의 정수 10개를 랜덤 생성하여(랜덤함수), 배열에 저장하고[10], 배열에 있는 정수 중에서 3의 배수(%3)만 출력해보자.

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
