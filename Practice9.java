package java_hello;

public class Practice9 {

	public static void main(String[] args) {
		// 1. 짝수단 찍기 /continue사용 하면 좋음~! 
		/*
		for(int i = 2; i < 10; i++) {
			
			if (i % 2 != 0)
				continue;
			
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));				
			}
		}
		
		// 2. 결괏값이 홀수인 것
		
		for(int i = 3; i <10; i++) {
			for(int j = 1; j <10; j++) {
				if(i*j % 2 == 0)
					continue;	//아니면 continue없이 if(홀수)로 해도 됨! else없이.
				System.out.println(i + " x " + j + " = " + (i*j));
			}
		}
		
		// 3. 3단 구하기
		
		int i = 3;
		for(int j = 1; j <10; j++)
			System.out.println(i + " x " + j + " = " + (i*j));
		
		
		// 4. 구구단_ 결괏값이 2와 3의 배수
		
		for(int i = 2; i <10; i++) {
			for(int j = 1; j<10; j++) {
				if( ((i*j) % 2 == 0) && ((i*j) % 3 == 0) ) {
					System.out.println(i + " x " + j + " = " + (i*j));
				}
			}
			
		}
		*/
		
		// 5. 구구단_ 결괏값이 짝수인 것의 갯수
		
		int evenCount = 0;
		
		for(int i = 2; i <10; i++) {
			
			for(int j = 1; j <10; j++) {
				
				if((i*j) % 2 == 0) {
					evenCount++;	
					
					System.out.println(i + " x " + j + " = " + (i*j) + " / 카운트: " + evenCount);
				}
			}
		}
		System.out.println(evenCount);
		

	}

}
