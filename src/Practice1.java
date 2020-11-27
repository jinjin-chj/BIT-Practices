
public class Practice1 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		//double result = a/b;	 //이 경우, 값이 0.75가 아닌 0.0가 나옴.	
		//이유: int끼리 연산했으니까 결과값도 int라서 소숫점 이하는 잘라버림. 근데 그 result값을 돌리니까 당연히 0만남음.
		
		double result = (double)a/b; // 1)명시적 형 변환, 2)int a, b 중 1개 이상의 자료형을 double로 수정, 3)int a = 3.0;으로 수정
		
		System.out.println(result);

	}

}

