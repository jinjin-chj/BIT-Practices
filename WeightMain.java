import java.util.Scanner;

public class WeightMain {

	public static void main(String[] args) {
		// ǥ�ظ����� üũ ���α׷�
		Scanner scanner = null;
		System.out.println("< ���α׷� ���� >");
		while (true) {

			scanner = new Scanner(System.in);

			System.out.println("Ű, �����Ը� �Է��ϼ���. (���ڸ�)");
			double myHeight = scanner.nextDouble();
			double myWeight = scanner.nextDouble();

			Practice2_Weight weight = new Practice2_Weight(myHeight, myWeight);

			System.out.println("ǥ�� ü���� " + ((myHeight - 100) * 0.9) + "kg");
			weight.Standard();

			System.out.println(">> ��� �Ͻðڽ��ϱ�? (Y / N)");

			char anwser = scanner.next().charAt(0);
			if (anwser == 'Y' || anwser == 'y')
				continue;
			else
				break;

		}
		scanner.close();
		System.out.println("< ���α׷� ���� >");
	}

}
