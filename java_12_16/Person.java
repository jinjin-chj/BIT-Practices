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
	double[] score; // 학번 길까봐 더블로 잡음

	public Student(String name, int age, String address, String univ, String major, int id) {

		super(name, age, address);
		this.univ = univ;
		this.major = major;
		this.id = id;
		score = new double[8]; // 8개 학기
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
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println();
		System.out.println("주소 : " + address);
		System.out.println("학교 : " + univ);
		System.out.println("학과 : " + major);
		System.out.println("학번 : " + id);

		System.out.println('\n' + "----------------------------------------" + '\n');
		System.out.println("8학기 학점을 순서대로 입력하세요.");
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			// 왜 double아니고 i를 int로 바꿔야 하는지? 안바꾸면 밑에서 에러남.
			System.out.print((i + 1) + "학기 학점 → ");
			score[i] = sc.nextDouble();
		}
		System.out.println('\n' + "----------------------------------------" + '\n');
		System.out.println("8학기 총 평균 평점은 "+ average() + "점 입니다.");
		
		sc.close();
	} 
}


