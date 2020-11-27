
public class Practice5 {

	public static void main(String[] args) {
		/*
		 * 1. int num = 33 할당 후, 해당 숫자 짝수, 홀수 출력
		 * 2. int num = 66 할당 후, 2의 배수이고 3의 배수이면 해당 수 출력, 아니면 2의 배수이고 3의 배수가 아닙니다. 출력
		 * 3. 삼항연산자 연습
		 * 4. '80, 33, 55' 중 최대값 출력
		 * 
		 * */
		
		//1.
		
		int num = 33;
		
		if ((num % 2) != 0) {
			System.out.println(num + "은 홀수입니다.");
			
		} else
			System.out.println(num + "은 짝수입니다.");
		
		System.out.println('\n');
		
		//2.
		
		int num2 = 66;
		
		if ((num2 % 2 == 0) && (num2 % 3 == 0)) {
			System.out.println(num2 + "은 2와 3의 배수입니다.");
	
		} else
			System.out.println(num2 + "은 2와 3의 배수가 아닙니다.");
		
		System.out.println('\n');
		
		// 3-1.
		int num3 = (5 < 4) ? 50 : 40;
			System.out.println(num3);
			
		/* 3-2.====================================================
		 * int num3 = 0;		//위와 같은 결괏값
		 * if(5 < 4) {
		 * 		num3 = 50;
		 * }else{
		 * 		num3 = 40;
		 * }
		 * 
		 */
			
		System.out.println('\n');
			
		// 4-1.
			
		int n1 = 80;
		int n2 = 33;
		int n3 = 55;
		int max = 0;
		
		if (n1 > n2) {
			if (n1 > n3) {
				max = n1;
			} else {
				max = n3;
			}
		} else {
			if(n2 > n3) {
				max = n2;
			} else {
				max = n3;
			}
		}
		
		System.out.println(max);
		
		/* 4-2.=================================================
		 * 
		 * int n1 = 80;
		 * int n2 = 33;
		 * int n3 = 55;
		 * int max = 0;
		 * 
		 * if((n1 > n2) && (n1 > n3)) {
		 * max = n1;
		 * 
		 * } else if((n2 > n3) && (n2 > n3)) {
		 * max = n2;
		 * 
		 * } else {
		 * max = n3;
		 * }
		 * sysout(max);
		 * 
		 * 
		 * 4-3.==================================================
		 * 
		 * int n1 = 80;
		 * int n2 = 33;
		 * int n3 = 55;

		 * int max = n1;
		 * 
		 * if(n2 > max)
		 * max = n2;
		 * 
		 * if(n3 > max)
		 * max = n2;
		 * 
		 * sysout(max);
		 * 
		 * 4-4.====================================================
		 * 
		 * int max;
		 * max = n1>n2 ? (n1>n3 ? n1 : (n3>n2 ? n3 : n2)) : n2;
		 * 
		 * 
		 * */
		
		
	}

}
