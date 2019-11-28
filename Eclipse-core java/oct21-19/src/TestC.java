
public class TestC {
	public static void main(String[] args) {

		Person.color = "wheatish";

		Person p = new Person();

		p.name = "Kim Woo Bin";
		p.age = 25;

		System.out.println("Name is "+p.name);
		System.out.println("Complexion is "+Person.color);
		System.out.println("Age is "+p.age);
		Person.sleep();
		p.eat();
		p.dance();

		System.out.println("**********************");

		Person p1 = new Person();

		p1.name = "Song Joong Ki";
		p1.age = 26;
		Person.color = "fair";

		System.out.println("Name is "+p1.name);
		System.out.println("Age is "+p1.age);
		System.out.println("Complexion is "+Person.color);
		p1.eat();
		p1.dance();
		Person.sleep();
	}
}
