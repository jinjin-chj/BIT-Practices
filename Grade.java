
public class Grade {
	/*
	 * int math; int science; int english;
	 * 
	 * public Grade(int math, int science, int english) { this.math = math;
	 * this.science = science; this.english = english;
	 * 
	 * }
	 * 
	 * public double avg() { return (math + science + english) / 3.0; }
	 */

	int kor;
	int eng;
	int math;

	public Grade(int kor, int eng, int math) {
		this.math = math;
		this.eng = eng;
		this.kor = kor;

	}

	public double avg() {
		return (math + eng + kor) / 3.0;
	}
}
