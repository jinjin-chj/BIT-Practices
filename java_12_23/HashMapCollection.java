package java_12_23;

import java.util.HashMap;

class HashMapCollection {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

		// Key-Value 기반 데이터 저장
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		map.put(23, "Lee");	// 중복값을 넣었을 경우 키값은 나중밸류로 변경됨.

		// 데이터 탐색
		System.out.println("23번: " + map.get(23));
		System.out.println("37번: " + map.get(37));
		System.out.println("45번: " + map.get(45));
		System.out.println();

		// 데이터 삭제
		map.remove(37);

		// 데이터 삭제 확인 - 데이터가 없으면 null 출력됨.
		System.out.println("37번: " + map.get(37));

	}
}
