package reflection;

public class Person {
	private String name;
	public int age;

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
		super();
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println("show");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
