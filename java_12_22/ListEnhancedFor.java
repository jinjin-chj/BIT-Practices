package java_12_22;

import java.util.List;
import java.util.LinkedList;

public class ListEnhancedFor {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();

		// 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");

		// 전체 인스턴스 참조
		for (String s : list)	// for-each문 (enhanced for)
			System.out.print(s + '\t');
	}

}
