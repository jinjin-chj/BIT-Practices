package java_hello;

public class Method2 {

	public static void main(String[] args) {
		System.out.println("안녕하세요.");
		
		double myHeight = 175.9;
		
		hiEveryone(12, 12.5);
		hiEveryone(13, myHeight);
		byeEveryone();
	}
	
	public static void hiEveryone(int age, double height) {		//호출 시 , value 두개 넣어줘야 함
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("저의 키는 " + height + "cm 입니다.");
	}
	
	public static void byeEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}

}
