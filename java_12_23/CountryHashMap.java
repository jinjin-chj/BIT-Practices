package java_12_23;

import java.util.HashMap;
import java.util.Scanner;

/*1. "그만"이 입력될 때까지 나라 이름과 인구를 입력받아 저장하고, 
다시 나라 이름을 입력받아 인구를 출력하는 프로그램을 작성하라. 다음 해시맵을 이용하라.
나라 이름과 인구를 입력하세요.(예: Korea 5000)
 */
class CountryHashMap {
	public static void main(String[] args) {
		String country;
		Integer population;

		HashMap<String, Integer> map = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");

		while (true) {
			System.out.print("나라 이름, 인구 >> ");
			country = sc.next();

			if (country.equals("그만"))
				break;
			// 얘를 위에다 쓰면 그만 이후에도 계속 입력값을 대기하고 있으니까 다음 와일문이 안나오지.
			population = sc.nextInt();	
			map.put(country, population);
		}
		while (true) {
			System.out.print("인구 검색 >> ");
			country = sc.next();
			if (country.equals("그만"))
				break;
			Integer num = map.get(country);

			if (num == null)
				System.out.println(country + " 나라는 없습니다.");
			else
				System.out.println(country + "의 인구는 " + num);
		}
		sc.close();
		System.out.println("프로그램 종료.");
	}

}
