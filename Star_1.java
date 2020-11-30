package java_hello;

public class Star_1 {		//별찍기. 근데 무슨 모양인지 가시적으로 표현해놓기!!

	public static void main(String[] args) {
		// 1. 별찍기!! 5*5
		/*
		for(int i = 1; i<=5; i++) {		// 열(줄)
			for(int j = 1; j <=5; j++) {	// 행(옆으로)
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 2. 별찍기 삼각형 - 그냥 외워~!
		
		for(int i = 1; i <=5; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 3. 뒤집힌 삼각형
		
		for(int i = 5; i >0; i--) {
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 4. 뒤집힌 역삼각형
		
		for(int i = 1; i <=5; i++) {
			for(int j = 1; j <= i; j++) {
				if(i>j) {
				System.out.print(" ");
				} else 
					System.out.print("*"); 
			}
			System.out.println();
		}
		
		
		// 5. 그냥 역삼각형
		
		for(int i = 5; i > 0; i--) {
			for(int j = 1; j <= 5; j++) {
				if(i<j) {
				System.out.print(" ");
				} else 
					System.out.print("*"); 
			}
			System.out.println();
		}
			
		
		// 6. 뭐.. 삼각형오른쪽ㅂ정렬., 몰라 이건 집중 안 함
		
		for(int i = 5; i > 0; i--) {
			for(int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			
			for(int j = 5; j >= i; j--) {
					System.out.print("*"); 
			}
			System.out.println();
		}
		
		// 7. 역삼각형 뒤집힌거.. (내가 한 거)
		
		for(int i = 5; i >0; i--) {
			for(int j = 5; j > 0; j--) {
				if(i<j) {
				System.out.print(" ");
				} else
					System.out.print("*");
			}
			System.out.println();
		} 
		*/
		
		// 7-1. 쌤이 한거 
		
		for(int i=5; i>0; i--) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 피라미드 해보기 -> 깃허브
		
	}

}
