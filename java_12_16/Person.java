package java_12_16;

import java.util.Scanner;

public class Person {
	String name;
	int age;
	String address;

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
}

class Student extends Person {
	String univ;
	String major;
	int id;
	double[] score; // �й� ���� ����� ����

	public Student(String name, int age, String address, String univ, String major, int id) {

		super(name, age, address);
		this.univ = univ;
		this.major = major;
		this.id = id;
		score = new double[8]; // 8�� �б�
	}

	public double average() {

		double sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		return sum / score.length;
	}

	public void print() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println();
		System.out.println("�ּ� : " + address);
		System.out.println("�б� : " + univ);
		System.out.println("�а� : " + major);
		System.out.println("�й� : " + id);

		System.out.println('\n' + "----------------------------------------" + '\n');
		System.out.println("8�б� ������ ������� �Է��ϼ���.");
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			// �� double�ƴϰ� i�� int�� �ٲ�� �ϴ���? �ȹٲٸ� �ؿ��� ������.
			System.out.print((i + 1) + "�б� ���� �� ");
			score[i] = sc.nextDouble();
		}
		System.out.println('\n' + "----------------------------------------" + '\n');
		System.out.println("8�б� �� ��� ������ "+ average() + "�� �Դϴ�.");
		
		sc.close();
	} 
}


