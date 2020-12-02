
public class Person {
	
	String name;
	int age;	// 데이터 명부 - 맨 앞에 써준다!!
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printPerson() {
		System.out.println("이름: " + name + "\n" +
				"나이: " + age);

	}
}