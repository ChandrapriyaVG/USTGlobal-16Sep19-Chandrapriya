
public class TestE {
	public static void main(String[] args) {
		
		Bus b = new Bus();
		b.getDetails();
		
		Bus b1 = new Bus(50);
		
		b1.getDetails();
		
		Bus b2 = new Bus("blue",60);
		b2.getDetails();
	}
}
