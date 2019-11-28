
public class TestB {
	public static void main(String[] args) {
		
		Cow c = new Cow();
		
		c.name = "mangya";
		c.color = "black";
		System.out.println("Cow name  is "+c.name);
		System.out.println("Cow color is "+c.color);
		c.eat();
		c.sleep();
		
		System.out.println("*******************************");
		
		 Cow c1 = new Cow();
		 
		 c1.name = "changya";
		 c1.color = "red";
		 System.out.println("Cow name is "+c1.name);
		 System.out.println("Cow color is "+c1.color);
		 c1.eat();
		 c1.sleep();
	}

}
