
public class BMW implements Automobile,AutomobileWithAbs{
	public int gear() {
		System.out.println("BMW gear() method");
		return 10;
	}
	public void gps() {
		System.out.println("BMW gps() method");
	}
	public void abs() {
		System.out.println("BMW abs() method");
	}
}
