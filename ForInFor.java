package java_hello;

public class ForInFor {

	public static void main(String[] args) {
		// 이중포문	println 과 print 구분 잘 하기
		
		for(int i = 0; i <3; i++) {
			System.out.println("-------------------");
			for(int j = 0; j <3; j++) {
				System.out.print("[" + i + ", " + j + "] ");
			}
			System.out.print('\n');
		}
	}

}
