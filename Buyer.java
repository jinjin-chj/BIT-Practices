package Fri;

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];	// ������ ��ǰ �����ϴ� �迭
	int i =0;	// �迭���� ����� �ε���
	
	void buy(Product p) {	// ��� �� ���� ���� ��
		
	}
	void add(Product p) {	// ��� ��ٱ��Ͽ� ��� ���� ��
		
	}
	
	
	void summary() { 	// �������̶�� ������.
		System.out.println("������ ����: "+ "add�Լ� �̿� ������ ��ǰ �迭 ����ϱ�" );
		System.out.println("����� �ݾ�: " + "��ٱ��� �迭�� �ִ� ��ǰ���� ������ ��");
		System.out.println("���� �ݾ�: " + "ó�� 1000���� ��� �ݾ� ����");
	}	
}

class Product {	// ��ǰ�� �θ� Ŭ����
	int price;
	Product(int price) {
		this.price= price;
	}
}
class Tv extends Product {
	Tv() {super(100);}
	
	public String toString() {
		return "Tv";
	}
	
}
class Computer extends Product {
	Computer() {super(200);}
	
	public String toString() {
		return "Computer";
	}
	
}
class Audio extends Product {
	Audio() {super(50);}
	
	public String toString() {
		return "Audio";
	}
	
}

