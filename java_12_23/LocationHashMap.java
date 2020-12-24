package java_12_23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

/*4. ���� �̸�, ����, �浵 ������ ���� Location Ŭ������ �ۼ��ϰ�, 
���� �̸��� 'Ű'�� �ϴ� HashMap<String, Location> �÷����� �����, 
����ڷκ��� �Է� �޾� 4���� ���ø� �����϶�. 
�׸��� ���� �̸����� �˻��ϴ� ���α׷��� �ۼ��϶�.

����, �浵, ������ �Է��ϼ���.
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

		System.out.println("����, �浵, ������ �Է��ϼ���.");

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
				System.out.print("���� �̸� >> ");
				String city = sc.nextLine();

				if (city.equals("�׸�"))
					break;
				Location loc = map.get(city);

				if (loc == null) {
					System.out.println(city + "�� �����ϴ�.");
				} else {
					System.out.println(loc.getCity() + " " + loc.getLat() + " " + loc.getLng());

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���α׷� �����Դϴ�.");
		}
		System.out.println("���α׷� ����.");
		sc.close();
	}
}
