
public class CompAssignOp {

	public static void main(String[] args) {
		
		short num = 10;
		num = (short)(num + 77L);	// 형 변환 안하면 컴파일 오류 발생/ Why? num은 long형이 됐는데 short에 넣으려고 하니까 오류.
		int rate = 3;
		rate = (int)(rate * 3.5);	// 형 변환 안하면 컴파일 오류 발생/ Why? num은 double형이 됐는데~ / 여기서 3.5는 리터럴
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77L;		//형 변환 필요 없음 /Why? 복합 대입 연산자!!!는 형 변환 필요
		rate = 3;
		rate *= 3.5;	//형 변환 필요 없음
		System.out.println(num);
		System.out.println(rate);
		
	}

}
