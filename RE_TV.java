
public class RE_TV {
	String brand;
	int year;
	int inch;

	public RE_TV(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}

	public void show() {
		System.out.println(brand + "���� ���� " + year + "���� " + inch + "��ġ TV");
	}

}
