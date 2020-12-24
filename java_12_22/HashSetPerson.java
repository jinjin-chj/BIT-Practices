package java_12_22;

/*����� ������ ��: 2
[LEE(10��), PARK(35��)]
 */
import java.util.HashSet;

class HashSetPerson {

	public static void main(String[] args) {
		HashSet<Person> hSet = new HashSet<Person>();
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("PARK", 35));
		hSet.add(new Person("PARK", 35));

		System.out.println("����� ������ ��: " + hSet.size());
		System.out.println(hSet);
	}
}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "(" + age + "��)";
	}

	@Override
	public int hashCode() {
		return age;	// �������� �𸣰ڴµ� �׳� age�� �ϸ� ��°� ������ �ٸ�..
	}

	@Override
	public boolean equals(Object obj) {
		if ((this.age == ((Person) obj).age)&&(this.name == ((Person) obj).name))
			return true;
		else
			return false;
	}

}
