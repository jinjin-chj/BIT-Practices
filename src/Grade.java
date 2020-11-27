
public class Grade {

	public static void main(String[] args) {
		/*
		 * 국어: 80, 수학: 80, 영어: 60
		 * 총점과 평균 출력, 평균에 따른 수우미양가 출력
		 */
		
		int kor = 80;
		int math = 80;
		int eng = 60;
		
		
		int sum = (kor + math + eng);
		double avg = ((double)sum / 3);		// ★ 또 까먹고 틀림!!!!!!!!!!!! 그냥 연산하면 소수점 이하 안 나옴!!!
		//double avg = (sum / 3.0);  // 방법2
			System.out.println("총점: " + sum);
			System.out.println("평균: " + avg);
				
		if (avg >= 90) {
			System.out.println("성적: 수");
			
		} else if ((avg < 90) && (avg >= 80)) {		// && 없이 80이상, 70이상, 60이상 이렇게 해도 됨!!
			System.out.println("성적: 우");
			
		} else if ((avg < 80) && (avg >= 70)) {
			System.out.println("성적: 미");
			
		} else if ((avg < 70) && (avg >= 60)) {
			System.out.println("성적: 양");
			
		} else  		// 마지막은 else if 아닌, else!!넣고 조건 없애기!!!
			System.out.println("성적: 가");
			
			
	}

}
