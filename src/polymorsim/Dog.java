package polymorsim;

public class Dog extends Animal {
	public String show(Dog obj) {
		return ("Dog and Dog");
	}

	public String show(Animal obj) {
		return ("Dog and Animal");
	}
}
