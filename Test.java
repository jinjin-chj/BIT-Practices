import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// 가위 바위 보 게임
		Scanner scanner = null;
		System.out.println("~ 게임을 시작하지 ~");

		while (true) {
			scanner = new Scanner(System.in);
			System.out.println();
			System.out.println("1.가위 / 2.바위 /3.보 입력하세요.");

			int comNum = (int) (Math.random() * 3) + 1;
			int myNum = scanner.nextInt();
			
			System.out.print("컴퓨터가 ");
			if(comNum == 1) {
				System.out.print("가위");
			} else if(comNum == 2) {
				System.out.print("바위");
			} else {
				System.out.print("보");
			}
			System.out.println("를 냈습니다.");
			
			System.out.print("사용자가 ");
			if(myNum == 1) {
				System.out.print("가위");
			} else if(myNum == 2) {
				System.out.print("바위");
			} else {
				System.out.print("보");
				
			}
			System.out.println("를 냈습니다.");
			System.out.println();
			
			if((comNum==1 && myNum ==2) ||(comNum==2 && myNum ==3)||(comNum==3 && myNum ==1)) {
				System.out.println("이겼습니다.");
			} else if (comNum==myNum) {
				System.out.println("비겼습니다.");
			} else {
				System.out.println("졌습니다.");
			}
			
			System.out.println(">> 계속 하시겠습니까? (Y / N)");
			char anwser = scanner.next().charAt(0);
			if(anwser=='y' || anwser=='Y')
				continue;
			else
				break;
		}
		scanner.close();
		System.out.println("~ 게임 종료 ~");
	}

}
