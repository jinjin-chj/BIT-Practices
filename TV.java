
public class TV {
	
	String brand;
	int year;
	int inch;
	
	public TV(String brand, int year, int inch) {	
		this.brand = brand;
		this.year = year;
		this.inch = inch;	
	//�Ķ���Ͷ� �̸��� �Ȱ��Ƽ� this���ΰ�. �ٸ��� �Ⱥٿ��� ��
			
	}
	
	public void show() {
		System.out.println(brand + "���� ���� " 
				+ year + "���� " + inch + "��ġ TV.");
		
	}
}
