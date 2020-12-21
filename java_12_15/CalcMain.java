package java_12_15; //12-16 수정함 _ 쌤버전

import java.util.Scanner;

/*
9.철수 학생은 다음 3개의 필드와 메소드를 가진 4개의 클래스 Add, Sub, Mul, Div를 작성하려고 한다.
- int 타입의 a, b 필드: 2개의 피연산자
- void setValue(int a, int b): 피연산자 값을 객체 내에 저장한다.
- int calculate(): 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다.

생각해보니, Add, Sub, Mul, Div 클래스에 공통된 필드와 메소드가 존재하므로 
새로운 추상 클래스 Calc를 작성하고 Calc를 상속받아 만들면 되겠다고 생각했다.
 
그리고 main() 메소드에서 다음 실행 사례와 같이 2개의 정수와 연산자를 입력받은 후,(Scanner)
Add, Sub, Mul, Div 중에서 이 연산을 처리할 수 있는 객체를 생성하고 (new~)
setValue() 와 calculate()를 호출하여(객체.set~) 그 결과 값을 화면에 출력하면 된다고 생각하였다. 
철수처럼 프로그램을 작성하라.

두 정수와 연산자를 입력하시오 >> 5 7 +
 */
class CalcMain {
	public static void main(String[] args) {
		Scanner sc = null;

		while (true) {
			System.out.print("두 정수와 연산자를 입력하시오 >> ");
			sc = new Scanner(System.in);

			try {
				int a = sc.nextInt();
				int b = sc.nextInt();
				char op = sc.next().charAt(0);

				Calc cal = null;

				switch (op) {
				case '+':
					cal = new Add();

					break;

				case '-':
					cal = new Sub();
					break;

				case '*':
					cal = new Mul();
					break;

				case '/':
					cal = new Div();
					break;

				default:
					System.out.println("잘못된 연산입니다.");

				}
				cal.setValue(a, b);
				System.out.println(a + " " + op + " " + b + " = " + cal.calculate());

			} catch (Exception e) {
				System.out.println("에러가 발생했습니다.");

				System.out.print("계속 하시겠습니까? (y/n) >> ");

				sc = new Scanner(System.in);

				char anwser = sc.next().charAt(0);

				if (anwser == 'Y' || anwser == 'y')
					continue;
				else
					break;

			}

			System.out.print("계속 하시겠습니까? (y/n) >> ");
			char anwser = sc.next().charAt(0);

			if (anwser == 'Y' || anwser == 'y')
				continue;
			else
				break;

		}

		sc.close();
		System.out.println("프로그램 종료.");
	}

}
