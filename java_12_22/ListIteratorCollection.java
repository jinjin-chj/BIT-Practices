package java_12_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class ListIteratorCollection {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>(list);

		ListIterator<String> litr = list.listIterator(); // ����� �ݺ��� ȹ��

		String str;
		while (litr.hasNext()) { // ���ʿ��� ���������� �̵��� ���� �ݺ���
			str = litr.next();
			System.out.print(str + '\t');
			if (str.equals("Toy")) // Toy ������ Toy2 ����
				litr.add("Toy2");
		}
		System.out.println();

		while (litr.hasPrevious()) { // �����ʿ��� �������� �̵��� ���� �ݺ���
			str = litr.previous();
			System.out.print(str + '\t');
			if (str.equals("Robot")) // Robot ������ Robot2 ����
				litr.add("Robot2");
		}
		System.out.println();

		// �ٽ� ���ʿ��� ����������
		for (Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + '\t');
		System.out.println();
	}

}
