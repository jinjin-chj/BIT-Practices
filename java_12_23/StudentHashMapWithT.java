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
			System.out.println("학생 이름 학과 학번 학점평균 입력하세요.");

			for (int i = 0; i < STUDENT_NUM; i++) {

				System.out.print(">> ");
				String text = sc.nextLine(); // 한 줄 전체 받기
				StringTokenizer st = new StringTokenizer(text, ",");
				String name = st.nextToken().trim(); // trim은 양 옆 공백을 제거한다.
				String major = st.nextToken().trim();
				String sNumber = st.nextToken().trim();
				double grade = Double.parseDouble(st.nextToken().trim());
				// parseDouble: 입력받은 String 값을 double로 변환시켜주는 메소드
				// 처음에 text를 nextLine으로 받아서 라인 전체가 스트링으로 들어감. 그래서 후 변환이 필요했음.

				Student2 student = new Student2(name, major, sNumber, grade); // 여기까지 객체생성
				map.put(name, student); // 생성한거 리스트에 넣음(저장)

			}
			Set<String> key = map.keySet(); // 해시맵 info에 있는 모든 키 Set 컬렉션으로 리턴
			Iterator<String> it = key.iterator(); // Set을 순차검색하는 이터레이터 리턴

			while (it.hasNext()) {
				String name = it.next();
				Student2 student = map.get(name); // 이름을 키로 하여 객체를 얻는다.
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
				Student2 student = map.get(name);

				if (student == null) {
					System.out.println("해당 학생은 없음");
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
			System.out.println("프로그램 오류입니다.");
		}

		System.out.println("프로그램 종료.");
		sc.close();
	}
}
