package java_12_23;

import java.util.ArrayList;
import java.util.Scanner;

/*하나의 학생 정보를 나타내는 Student 클래스에는 
 이름, 학과, 학번, 학점 평균 을 저장하는 필드가 있다.
(1) 학생마다 Student 객체를 생성하고 4명의 학생 정보를 
ArrayList<Student> 컬렉션에 저장한 후에, 
ArrayList<Student>의 모든 학생(4명) 정보를 출력하고 
학생 이름을 입력받아 해당 학생의 학점 평균을 출력하는 프로그램을 작성하라.
 */

class Student {
	private String name, dep, idNum, avg;

	public String getName() {
		return name;
	}

	public String getDep() {
		return dep;
	}

	public String getIdNum() {
		return idNum;
	}

	public String getAvg() {
		return avg;
	}

	Student(String name, String dep, String idNum, String avg) {
		this.avg = avg;
		this.dep = dep;
		this.idNum = idNum;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "이름: " + getName() +'\r' +"학과: " + getDep()
		+'\r'+"학번: " + getIdNum()+'\r'+"학점평균: " + getAvg()+'\r';
	}
}

class StudentArrayList {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름 학과 학번 학점평균 입력하세요.");
		
		// 배열에 저장
		Student[] student = new Student[4];
		for (int i = 0; i < student.length; i++) {
			System.out.print(">> ");
			String name = sc.next();
			//System.out.print(", ");
			String dep = sc.next();
			//System.out.print(", ");
			String idNum = sc.next();
			//System.out.print(", ");
			String avg = sc.next();

			student[i] = new Student(name, dep, idNum, avg);
			list.add(student[i]); // 저장 완료!
		}
		System.out.println("-------------------------------");
		// 전체 출력 부분
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			System.out.println("-------------------------------");
		}
		// 이름 입력받고 평균 출력하는 부분
		while (true) {
			System.out.print("학생 이름 >> ");
			String name = sc.next();
			
			if (name.equals("그만"))
				break;

			for (int i = 0; i < list.size(); i++) {
				Student who = list.get(i);
				System.out.println(who.getAvg());
			}
		}
	}
}
