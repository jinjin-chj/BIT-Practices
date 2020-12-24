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
			System.out.println("학생 이름 학과 학번 학점평균 입력하세요.");

			for (int i = 0; i < STUDENT_NUM; i++) {
				System.out.print(">> ");
				String text = sc.nextLine(); // 한 줄 전체 받기

				StringTokenizer st = new StringTokenizer(text, ",");
				String name = st.nextToken().trim(); // trim은 양 옆 공백을 제거한다.
				String major = st.nextToken().trim();
				String sNumber = st.nextToken().trim();
				double grade = Double.parseDouble(st.nextToken().trim()); // parseDouble 뭔지...

				Student1 student = new Student1(name, major, sNumber, grade); // 여기까지 객체생성
				list.add(student); // 생성한거 리스트에 넣음(저장)

			}

			Iterator<Student1> it = list.iterator();

			while (it.hasNext()) {
				Student1 student = it.next();
				System.out.println("-------------------------------");
				System.out.println("이름: " + student.getName());
				System.out.println("학과: " + student.getMajor());
				System.out.println("학번: " + student.getsNumber());
				System.out.println("학점 평균: " + student.getGrade());

			}
			System.out.println("-------------------------------");

			while (true) {
				System.out.print("학생 이름 >> ");
				String name = sc.nextLine();

				if (name.equals("그만"))
					break;

				for (int i = 0; i < list.size(); i++) {
					Student1 student = list.get(i);

					if (student.getName().trim().equals(name.trim())) { // trim 넣는건 혹시 유저가 공백 입력하면 공백은 짤라라.
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
			System.out.println("프로그램 오류입니다.");
		}

		System.out.println("프로그램 종료.");
		sc.close();
	}
}
