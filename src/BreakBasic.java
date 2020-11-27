
public class BreakBasic {		// 이해 못함 한 40퍼

	public static void main(String[] args) {
		int num = 1
		boolean search = false; //뭔 말이고
		
		// 5와 7의 최소 공배수 찾는 반복문
		while(num < 100) {
			if ((num % 5 ==0) && (num % 7 ==0)) {
				search = true;
				break;		//while문 탈출 와장창
			}
			num++;	
		}
		
		if (search)		//왜 search???
			System.out.println("찾는 정수 : " + num);
		else
			System.out.println("5의 배수이자 7의 배수인 수를 찾지 못했습니다.");

	}

}
