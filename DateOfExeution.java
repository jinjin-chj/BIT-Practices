import java.time.LocalDate;

public class DateOfExeution {
	static String date;
	
	static {								// 이것이 스테틱 초기화 블록/ 스테틱 변수가 메모리공간에 할당될 때 실행됨. 
		LocalDate nDate = LocalDate.now();	
		date = nDate.toString();
		
	}
	
	public static void main(String[] args) {
		System.out.println(date);
		
	}
}
