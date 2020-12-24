package java_12_23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student1 {
	private String name, major, sNumber;
	private double grade;

	Student1(String name, String major, String sNumber, double grade) {
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

public class StudentWithT {
	final static int STUDENT_NUM = 4;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			ArrayList<Student1> list = new ArrayList<>();
			System.out.println("�л� �̸� �а� �й� ������� �Է��ϼ���.");

			for (int i = 0; i < STUDENT_NUM; i++) {
				System.out.print(">> ");
				String text = sc.nextLine(); // �� �� ��ü �ޱ�

				StringTokenizer st = new StringTokenizer(text, ",");
				String name = st.nextToken().trim(); // trim�� �� �� ������ �����Ѵ�.
				String major = st.nextToken().trim();
				String sNumber = st.nextToken().trim();
				double grade = Double.parseDouble(st.nextToken().trim()); // parseDouble ����...

				Student1 student = new Student1(name, major, sNumber, grade); // ������� ��ü����
				list.add(student); // �����Ѱ� ����Ʈ�� ����(����)

			}

			Iterator<Student1> it = list.iterator();

			while (it.hasNext()) {
				Student1 student = it.next();
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

				for (int i = 0; i < list.size(); i++) {
					Student1 student = list.get(i);

					if (student.getName().trim().equals(name.trim())) { // trim �ִ°� Ȥ�� ������ ���� �Է��ϸ� ������ ©���.
						System.out.print(student.getName() + ", ");
						System.out.print(student.getMajor() + ", ");
						System.out.print(student.getsNumber() + ", ");
						System.out.println(student.getGrade());
						break;

					}
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
