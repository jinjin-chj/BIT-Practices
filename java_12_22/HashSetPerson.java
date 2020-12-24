package java_12_22;

/*저장된 데이터 수: 2
[LEE(10세), PARK(35세)]
 */
import java.util.HashSet;

class HashSetPerson {

	public static void main(String[] args) {
		HashSet<Person> hSet = new HashSet<Person>();
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("PARK", 35));
		hSet.add(new Person("PARK", 35));

		System.out.println("저장된 데이터 수: " + hSet.size());
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
		return name + "(" + age + "세)";
	}

	@Override
	public int hashCode() {
		return age;	// 왜인지는 모르겠는데 그냥 age로 하면 출력값 순서가 다름..
	}

	@Override
	public boolean equals(Object obj) {
		if ((this.age == ((Person) obj).age)&&(this.name == ((Person) obj).name))
			return true;
		else
			return false;
	}

}
