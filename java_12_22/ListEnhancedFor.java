package java_12_22;

import java.util.List;
import java.util.LinkedList;

public class ListEnhancedFor {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();

		// �ν��Ͻ� ����
		list.add("Toy");
		list.add("Box");
		list.add("Robot");

		// ��ü �ν��Ͻ� ����
		for (String s : list)	// for-each�� (enhanced for)
			System.out.print(s + '\t');
	}

}
