import java.time.LocalDate;

public class DateOfExeution {
	static String date;
	
	static {								// �̰��� ����ƽ �ʱ�ȭ ���/ ����ƽ ������ �޸𸮰����� �Ҵ�� �� �����. 
		LocalDate nDate = LocalDate.now();	
		date = nDate.toString();
		
	}
	
	public static void main(String[] args) {
		System.out.println(date);
		
	}
}
