package java_12_23;

import java.util.ArrayList;
import java.util.Scanner;

/*�ϳ��� �л� ������ ��Ÿ���� Student Ŭ�������� 
 �̸�, �а�, �й�, ���� ��� �� �����ϴ� �ʵ尡 �ִ�.
(1) �л����� Student ��ü�� �����ϰ� 4���� �л� ������ 
ArrayList<Student> �÷��ǿ� ������ �Ŀ�, 
ArrayList<Student>�� ��� �л�(4��) ������ ����ϰ� 
�л� �̸��� �Է¹޾� �ش� �л��� ���� ����� ����ϴ� ���α׷��� �ۼ��϶�.
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
		return "�̸�: " + getName() +'\r' +"�а�: " + getDep()
		+'\r'+"�й�: " + getIdNum()+'\r'+"�������: " + getAvg()+'\r';
	}
}

class StudentArrayList {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("�л� �̸� �а� �й� ������� �Է��ϼ���.");
		
		// �迭�� ����
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
			list.add(student[i]); // ���� �Ϸ�!
		}
		System.out.println("-------------------------------");
		// ��ü ��� �κ�
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			System.out.println("-------------------------------");
		}
		// �̸� �Է¹ް� ��� ����ϴ� �κ�
		while (true) {
			System.out.print("�л� �̸� >> ");
			String name = sc.next();
			
			if (name.equals("�׸�"))
				break;

			for (int i = 0; i < list.size(); i++) {
				Student who = list.get(i);
				System.out.println(who.getAvg());
			}
		}
	}
}
