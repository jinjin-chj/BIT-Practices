
public class IEIE {

	public static void main(String[] args) {
		int num = 120;
		
		if(num < 0) {
			System.out.println("0 �̸�");
		}
		else if(num < 50) {
			System.out.println("0 �̻� 50 �̸�");
		}
		else if((num >= 50) && (num < 100)) {		
			System.out.println("50 �̻� 100 �̸�");
		}
		else {
			System.out.println("100 �̻�");
		}
	}

}
