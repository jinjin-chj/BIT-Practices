
public class Practice6 {

	public static void main(String[] args) {
		// 7. 1~100 까지의 합을 구하시오
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum = sum + i;	
				
		}
		System.out.println(sum);
		
		// 8. 1~100 에서 짝수의 합 //다시하기!!- 했음 ;랑 {}가 둘 다 있어서 실행이 두번된듯
		
		int even = 0;
	
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
			even = even + i;
			}
			
		}System.out.println(even);
		
		
	}

}

