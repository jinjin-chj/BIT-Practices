package java_12_23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Student2 {
	private String name, major, sNumber;
	private double grade;

	Student2(String name, String major, String sNumber, double grade) {
		this.grade = grade;
		this.major = major;
		this.name = name;
		this.sNumber = sNumber;
	}

	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}

	public String getsNumber() {
		return sNumber;
	}

	public double getGrade() {
		return grade;
	}
}

public class StudentHashMapWithT {
	final static int STUDENT_NUM = 4;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			HashMap<String, Student2> map = new HashMap<>();
			System.out.println("�л� �̸� �а� �й� ������� �Է��ϼ���.");

			for (int i = 0; i < STUDENT_NUM; i++) {

				System.out.print(">> ");
				String text = sc.nextLine(); // �� �� ��ü �ޱ�
				StringTokenizer st = new StringTokenizer(text, ",");
				String name = st.nextToken().trim(); // trim�� �� �� ������ �����Ѵ�.
				String major = st.nextToken().trim();
				String sNumber = st.nextToken().trim();
				double grade = Double.parseDouble(st.nextToken().trim());
				// parseDouble: �Է¹��� String ���� double�� ��ȯ�����ִ� �޼ҵ�
				// ó���� text�� nextLine���� �޾Ƽ� ���� ��ü�� ��Ʈ������ ��. �׷��� �� ��ȯ�� �ʿ�����.

				Student2 student = new Student2(name, major, sNumber, grade); // ������� ��ü����
				map.put(name, student); // �����Ѱ� ����Ʈ�� ����(����)

			}
			Set<String> key = map.keySet(); // �ؽø� info�� �ִ� ��� Ű Set �÷������� ����
			Iterator<String> it = key.iterator(); // Set�� �����˻��ϴ� ���ͷ����� ����

			while (it.hasNext()) {
				String name = it.next();
				Student2 student = map.get(name); // �̸��� Ű�� �Ͽ� ��ü�� ��´�.
				System.out.println("-------------------------------");
				System.out.println("�̸�: " + student.getName());
				System.out.println("�а�: " + student.getMajor());
				System.out.println("�й�: " + student.getsNumber());
				System.out.println("���� ���: " + student.getGrade());

			}
			System.out.println("-------------------------------");

			while (true) {
				System.out.print("�л� �̸� >> ");
				String name = sc.nextLine();

				if (name.equals("�׸�"))
					break;
				Student2 student = map.get(name);

				if (student == null) {
					System.out.println("�ش� �л��� ����");
				} else {
					System.out.print(student.getName() + ", ");
					System.out.print(student.getMajor() + ", ");
					System.out.print(student.getsNumber() + ", ");
					System.out.println(student.getGrade());
					break;

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
