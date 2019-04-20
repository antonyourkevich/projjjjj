package Igor;

public class Example {

	public static void main(String[] args) {
		
		Person person1 = new Person(1);
		person1.printAll();
		
		Person person2 = new Person(2, "Sasha");
		person2.printAll();
		
		Person person3 = new Person(3, "Vasia", 20);
		person3.printAll();
	}

}
