
public class Practice6 {

	public static void main(String[] args) {
		// 7. 1~100 ������ ���� ���Ͻÿ�
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum = sum + i;	
				
		}
		System.out.println(sum);
		
		// 8. 1~100 ���� ¦���� �� //�ٽ��ϱ�!!- ���� ;�� {}�� �� �� �־ ������ �ι��ȵ�
		
		int even = 0;
	
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
			even = even + i;
			}
			
		}System.out.println(even);
		
		
	}

}

