
public class Song {

	String title;
	String artist;
	int year;
	String country;

	Song() {
	} // ������2�� �� �⺻ ������. ��������� ������ �����

	// ������ .�Ű������� ��� �ʵ� �ʱ�ȭ�ϴ� ������ ����.
	Song(int year, String country, String artist, String title) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country; // �� ������ �ʱ�ȭ ��� ��.
	}

	public void show() {
		System.out.println(year + "�� " + country + " ������ " + artist + "�� �θ� " + title);
	}

} // "1978�� ������ ������ ABBA�� �θ� Dancing Queen" �� ���.
