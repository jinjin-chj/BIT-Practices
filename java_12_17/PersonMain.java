package java_12_17;

/*9. ���� ������ �����ϴ� Ŭ���� Person�� �����Ͽ� �׽�Ʈ�ϴ� ���α׷��� �ۼ��Ͻÿ�.(�ʼ�)
- Ŭ���� Person�� �̸��� �����ϴ� �ʵ� ����
- Ŭ���� Person�� ���� Ŭ���� Object�� �޼ҵ� equals()�� �������̵��Ͽ� 
  �̸��� ������ true�� ��ȯ�ϴ� �޼ҵ� ����
- ������ ���� �ҽ��� Ŭ���� Person�� ����
 */
class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.name == ((Person) obj).name)
			return true;
		else
			return false;
	}
}

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("ȫ�浿");
		System.out.println(p1.equals(new Person("ȫ�浿")));
		System.out.println(p1.equals(new Person("�ָ���")));
	}
}
