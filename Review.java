package java_hello;

public class Review {

	public static void main(String[] args) {
		/*
		// 1. 구구단 이중포문
		for(int i =2; i <10; i++) {
			for(int j =1; j<10; j++) {
				System.out.println(i + " x " + j +" = " + (i*j));
			}
		}
		
		// 2. 성적 프로그램
		 * 
		int kor = 90;
		int math = 70;
		int eng = 85;
		
		int sum = (kor + math + eng);
		double avg = sum / 3.0;
		System.out.println("총점: " +sum);
		System.out.println("평균: " +avg);
		
		if(avg >= 90) {
			System.out.println("성적: 수");
		} else if(avg>=80) {
			System.out.println("성적: 우");
		} else if(avg>=70) {
			System.out.println("성적: 미");
		} else if(avg>=60) {
			System.out.println("성적: 양");
		} else 
			System.out.println("성적: 가");
		
		
		//3. 5x5별찍기
		for(int i=1; i <=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//4.역삼각형 별찍기
		for(int i=1; i <=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//5.뭐 뒤집힌 삼각형
		for(int i=5; i >0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//6. 오른쪽정렬삼각형 (다시해보기, 다른 방법 확인해보기-면접족보에서)
		for(int i = 5; i > 0; i--) {
			for(int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			
			for(int j = 5; j >= i; j--) {
				System.out.print("*"); 
			}
			System.out.println();
		}
	}

}
