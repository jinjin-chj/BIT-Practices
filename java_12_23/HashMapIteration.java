package java_12_23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
//import java.util.TreeMap;

class HashMapIteration {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		// TreeMap으로 하면 순서를 오름차순으로 유지시키면서 출력함.
		//TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");

		// Key만 담고 있는 컬렉션 인스턴스 생성
		Set<Integer> ks = map.keySet();

		// 전체 Key 출력 (for-each 기반)
		for (Integer n : ks)
			System.out.print(n.toString() + '\t');
		System.out.println();

		// 전체 Value 출력(for-each 기반)
		for (Integer n : ks)
			System.out.print(map.get(n).toString() + '\t');
		System.out.println();

		// 전체 Value 출력(반복자 기반)
		for (Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.print(map.get(itr.next()) + '\t');
		System.out.println();
	}

}
