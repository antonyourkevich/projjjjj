package Igor;

public class Person {
	
	public int id;
	public String name;
	public int age;
	
	public Person(int id)
	{
		this.id = id;
	}
	
	public Person(int id, String name)
	{
		//this.id = id;
		this(id);
		this.name = name;
	}
	
	public Person(int id, String name, int age)
	{
		//this.id = id;
		//this.name = name;
		this(id, name);
		this.age = age;
	}
	
	public void printAll()
	{
		System.out.println(this.id + " " + this.name + " " + this.age);
	}
	
	
	
}
