package java_12_23;

import java.util.HashMap;

class HashMapCollection {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

		// Key-Value ��� ������ ����
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		map.put(23, "Lee");	// �ߺ����� �־��� ��� Ű���� ���߹���� �����.

		// ������ Ž��
		System.out.println("23��: " + map.get(23));
		System.out.println("37��: " + map.get(37));
		System.out.println("45��: " + map.get(45));
		System.out.println();

		// ������ ����
		map.remove(37);

		// ������ ���� Ȯ�� - �����Ͱ� ������ null ��µ�.
		System.out.println("37��: " + map.get(37));

	}
}
