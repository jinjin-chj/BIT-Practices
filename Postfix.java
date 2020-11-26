
public class Postfix {

	public static void main(String[] args) {
		// 문제1
		int num = 5;
		System.out.print((num++) + " ");
		System.out.print((num++) + " ");
		
		System.out.print(num + "\n");
		
		System.out.print(num + (int)'\n');		
		
		/* 차이점? 
		 * 1. 일단 "\n" = '\n'
		 * 2. 그냥 sysout('\n'); 하면 개행 됨
		 * 3. 근데 sysout(num + '\n'); 하면 에러가 남.
		 * 		이유:  num은 int형이라서 char형인 '\n'가 int로 자동 형 변환이 돼서 아스키코드값으로 자동 변환됨.  
		 */
		
		
		System.out.print((num--) + " ");
		System.out.print((num--) + " ");
		System.out.println(num);
		
		
		// 문제2
		int num1 = 7;
		num1--;
		System.out.println("\n" + num1);
		
		
		// 문제3
		int num2 = 7;
	
		int result;
		
		result = (++num2) - 5;
		System.out.println("\n" + result);
		
		result = (num2++) - 5;
		System.out.println(result);
		System.out.println(num2);
		
		
		// 문제4
		int x = 10;
		int y = x-- + 5 + --x;		// 연산이 3개 이상이면 실행단위 2개. 앞에 먼저 하고 후위 적용하고 뒤에 연산함.
		System.out.println("\n" + y);
		
	}

}
