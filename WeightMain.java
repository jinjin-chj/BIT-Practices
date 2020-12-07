import java.util.Scanner;

public class WeightMain {

	public static void main(String[] args) {
		// 표준몸무게 체크 프로그램
		Scanner scanner = null;
		System.out.println("< 프로그램 시작 >");
		while (true) {

			scanner = new Scanner(System.in);

			System.out.println("키, 몸무게를 입력하세요. (숫자만)");
			double myHeight = scanner.nextDouble();
			double myWeight = scanner.nextDouble();

			Practice2_Weight weight = new Practice2_Weight(myHeight, myWeight);

			System.out.println("표준 체중은 " + ((myHeight - 100) * 0.9) + "kg");
			weight.Standard();

			System.out.println(">> 계속 하시겠습니까? (Y / N)");

			char anwser = scanner.next().charAt(0);
			if (anwser == 'Y' || anwser == 'y')
				continue;
			else
				break;

		}
		scanner.close();
		System.out.println("< 프로그램 종료 >");
	}

}
