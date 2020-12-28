package java_12_23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ScholarshipHashMap {
	final static int INPUT_NUM = 5;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		HashMap<String, Double> map = new HashMap<>();
		System.out.println("미래 장학금 관리시스템입니다.");

		for (int i = 0; i < INPUT_NUM; i++) {
			System.out.print("이름과 학점 >> ");
			String name = sc.next();
			double grade = sc.nextDouble();
			map.put(name, grade);
		}
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		double cutline = sc.nextDouble();
		System.out.print("장학생 명단: ");
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String name = it.next();
			double grade = map.get(name);
			if (grade > cutline) {
				System.out.print(name + " ");
			}
		}
		System.out.println();
		sc.close();
	}
}
