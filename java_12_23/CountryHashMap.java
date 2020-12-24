package java_12_23;

import java.util.HashMap;
import java.util.Scanner;

/*1. "�׸�"�� �Էµ� ������ ���� �̸��� �α��� �Է¹޾� �����ϰ�, 
�ٽ� ���� �̸��� �Է¹޾� �α��� ����ϴ� ���α׷��� �ۼ��϶�. ���� �ؽø��� �̿��϶�.
���� �̸��� �α��� �Է��ϼ���.(��: Korea 5000)
 */
class CountryHashMap {
	public static void main(String[] args) {
		String country;
		Integer population;

		HashMap<String, Integer> map = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �̸��� �α��� �Է��ϼ���.(��: Korea 5000)");

		while (true) {
			System.out.print("���� �̸�, �α� >> ");
			country = sc.next();

			if (country.equals("�׸�"))
				break;
			// �긦 ������ ���� �׸� ���Ŀ��� ��� �Է°��� ����ϰ� �����ϱ� ���� ���Ϲ��� �ȳ�����.
			population = sc.nextInt();	
			map.put(country, population);
		}
		while (true) {
			System.out.print("�α� �˻� >> ");
			country = sc.next();
			if (country.equals("�׸�"))
				break;
			Integer num = map.get(country);

			if (num == null)
				System.out.println(country + " ����� �����ϴ�.");
			else
				System.out.println(country + "�� �α��� " + num);
		}
		sc.close();
		System.out.println("���α׷� ����.");
	}

}
