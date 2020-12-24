package java_12_22;

import java.util.ArrayList;
import java.util.Scanner;

/*
6.Scanner 클래스를 사용하여 6개 학점('A','B','C','D','F')을 문자로 입력받아 
ArrayList에 저장하고, ArrayList를 검색하여 
학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여 "평균" 출력.
6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> A C A B F D
	2.3333333333333335
 */
class GradeArrayList {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");

		for (int i = 0; i < 6; i++) { // 몇 개를 입력하든 앞 6개만 받겠다.
			char ch = sc.next().charAt(0);
			list.add(ch); // 사용자가 입력한 문자 6개 담음.
		}

		double sum = 0;

		for (int i = 0; i < list.size(); i++) {
			char ch = list.get(i);

			switch (ch) {
			case 'A':
				sum += 4.0;
				break;
			case 'B':
				sum += 3.0;
				break;
			case 'C':
				sum += 2.0;
				break;
			case 'D':
				sum += 1.0;
				break;
			case 'F':
				sum += 0;
				break;
			}
		}

		double avg = sum / list.size();
		System.out.println(avg);
	}
}
