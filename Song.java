
public class Song {

	String title;
	String artist;
	int year;
	String country;

	Song() {
	} // 생성자2개 중 기본 생성자. 만들으라고 했으니 만든거

	// 생성자 .매개변수로 모든 필드 초기화하는 생성자 만듦.
	Song(int year, String country, String artist, String title) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country; // 이 과정을 초기화 라고 함.
	}

	public void show() {
		System.out.println(year + "년 " + country + " 국적의 " + artist + "가 부른 " + title);
	}

} // "1978년 스웨덴 국적의 ABBA가 부른 Dancing Queen" 을 출력.
