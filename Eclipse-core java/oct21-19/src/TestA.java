
public class TestA {
	public static void main(String[] args) {
		
		Pen p = new Pen();
		
		p.cost = 100;
		p.color = "red";
		p.brand = "Parker";
		System.out.println("cost is "+p.cost);
		System.out.println("color is "+p.color);
		System.out.println("brand is "+p.brand);
		
		p.write();
		
		System.out.println("*****************************************");
		
		Van v = new Van();
		
		v.cost = 25000;
		v.color = "black";
		System.out.println("cost of van is "+v.cost);
		System.out.println("color of van is "+v.color);
		
		v.move();
		
		System.out.println("******************************************");
		
		Van v1 = new Van();
		
		v1.cost = 30000;
		v1.color = "red";
		System.out.println("cost of v1 "+v1.cost);
		System.out.println("color of v1 "+v1.color);
		
		v1.move();
		
		
		}
}
