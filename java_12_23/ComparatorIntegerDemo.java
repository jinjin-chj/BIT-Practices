package java_12_23;

import java.util.Comparator;
import java.util.TreeSet;

// 문제. IntegerComparator를 내림차순 정렬이 되게끔 구현하라.

class ComparatorIntegerDemo {
	public static void main(String[] args) {
		
		TreeSet<Integer> tr = new TreeSet<>(new IntegerComparator());
		tr.add(30);
		tr.add(10);
		tr.add(20);
		System.out.println(tr);
	}
}

class IntegerComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.intValue() - o1.intValue();
	}
}
