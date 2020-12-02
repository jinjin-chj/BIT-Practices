
public class TV {
	
	String brand;
	int year;
	int inch;
	
	public TV(String brand, int year, int inch) {	
		this.brand = brand;
		this.year = year;
		this.inch = inch;	
	//파라미터랑 이름이 똑같아서 this붙인거. 다르면 안붙여도 됨
			
	}
	
	public void show() {
		System.out.println(brand + "에서 만든 " 
				+ year + "년형 " + inch + "인치 TV.");
		
	}
}
