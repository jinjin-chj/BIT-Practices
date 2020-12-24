package java_12_23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

/*4. 도시 이름, 위도, 경도 정보를 가진 Location 클래스를 작성하고, 
도시 이름을 '키'로 하는 HashMap<String, Location> 컬렉션을 만들고, 
사용자로부터 입력 받아 4개의 도시를 저장하라. 
그리고 도시 이름으로 검색하는 프로그램을 작성하라.

도시, 경도, 위도를 입력하세요.
 */
class Location {
	private String city, lat, lng;

	public String getCity() {
		return city;
	}

	public String getLat() {
		return lat;
	}

	public String getLng() {
		return lng;
	}

	Location(String city, String lat, String lng) {
		this.city = city;
		this.lat = lat;
		this.lng = lng;
	}
}

class LocationHashMap {
	final static int INPUT_NUM = 4;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<String, Location> map = new HashMap<>();

		System.out.println("도시, 경도, 위도를 입력하세요.");

		try {
			for (int i = 0; i < INPUT_NUM; i++) {
				System.out.print(">> ");
				String text = sc.nextLine();

				StringTokenizer st = new StringTokenizer(text, ",");
				String city = st.nextToken().trim();
				String lat = st.nextToken().trim();
				String lng = st.nextToken().trim();

				Location loc = new Location(city, lat, lng);
				map.put(city, loc);
			}

			Set<String> key = map.keySet();
			Iterator<String> it = key.iterator();

			System.out.println("-------------------------------");
			while (it.hasNext()) {
				String city = it.next();
				Location loc = map.get(city);
				System.out.println(loc.getCity() + " " + loc.getLat() + " " + loc.getLng());
			}
			System.out.println("-------------------------------");

			while (true) {
				System.out.print("도시 이름 >> ");
				String city = sc.nextLine();

				if (city.equals("그만"))
					break;
				Location loc = map.get(city);

				if (loc == null) {
					System.out.println(city + "는 없습니다.");
				} else {
					System.out.println(loc.getCity() + " " + loc.getLat() + " " + loc.getLng());

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("프로그램 오류입니다.");
		}
		System.out.println("프로그램 종료.");
		sc.close();
	}
}
