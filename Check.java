package java_hello;

public class Check {

	public static void main(String[] args) {
		int money = 126500;
		int m500, m100, m50, m10, m5, m1;
		int temp;  
		
		m500 = money/50000;
		temp = money - (m500*50000);
		
		m100 = temp/10000;
		temp = temp - (m100 *10000);
		
		m50 = temp/5000;
		temp = temp - (m50 *5000);
		
		m10 = temp/1000;
		temp = temp - (m10*1000);
		
		m5 = temp/500;
		temp = temp - (m5 *500);
		
		m1 = temp/100;
		
		System.out.println("50,000��: " + m500 + "��");
		System.out.println("10,000��: " + m100 + "��");
		System.out.println("5,000��: " + m50 + "��");
		System.out.println("1,000��: " + m10 + "��");
		System.out.println("500��: " + m5 + "��");
		System.out.println("100��: " + m1 + "��");	
	}
}
