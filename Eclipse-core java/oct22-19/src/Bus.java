
public class Bus {
	String color;
	int seats;
		 Bus(String color, int seats) {
			this.color = color;
			this.seats = seats;
		}
		 Bus(){
			 this(40);
		 }
		 Bus(int seats) {
			 this("red",seats);
		 }
		 void getDetails() {
			 System.out.println("Welcome to "+color+" bus, bus seat capacity is "+seats);
		 }
}
