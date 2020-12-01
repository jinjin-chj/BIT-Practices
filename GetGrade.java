package java_hello;

public class GetGrade {	//쌤 버전, 친구 버전이랑 비교해보기!! 어떤걸 쭐였나 !!! 

	public static void main(String[] args) {
		
		int kor = 70;
		int math = 65;
		int eng = 80;
		
		int total = (kor + math + eng);
		double avg = total / 3.0;
	
		System.out.println("당신의 성적은 " + getGrade(avg) + "입니다.");
	}
	
	public static char getGrade(double avg) {
		char ch;	//char와 return사이 조건 넣기(순서)
		
		if(avg >= 90) {
			ch= '수';			
		} else if(avg>=80) {
			ch= '우';
		} else if(avg>=70) {
			ch= '미';
		} else if(avg>=60) {
			ch= '양';
		} else 
			ch= '가';
		
		return ch;
		
		
	}
}
