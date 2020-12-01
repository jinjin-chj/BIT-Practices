package java_hello;

public class Sum {		
		// 1~num까지 합을 구하는 클래스 작성.
	
	int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int getSum() {
		int sum = 0;
		for(int i=1; i<=100; i++) {

			sum = sum + i;
		}
		return sum;
	}	

}
