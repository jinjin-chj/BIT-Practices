
public class ContinueBasic {

	public static void main(String[] args) {
		
		int num = 0;
		int count = 0;
		
		while(num++ < 100) {	// 후위증가연산자-> 100)여기가 하나의 실행단위 { !!
			if((num % 5 != 0) || (num % 7 != 0))
				continue;
			count++;
			System.out.println(num);
		}
		System.out.println("count: " + count);
	}

}
