
public class RE_Grade {
	int kor;
	int eng;
	int math;

	public RE_Grade(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public double avg() {
		return (kor + eng + math) / 3.0;
	}

}
