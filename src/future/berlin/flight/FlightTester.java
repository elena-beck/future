package future.berlin.flight;


	public class FlightTester {
		public static void main(String arg[]) {
			Time dep=new Time (8,10);
			Time arr=new Time (9,10);
			Flight f = new Flight("PK-303","Lahore",dep,arr);
			Passenger psg1= new Passenger("John Doe", 30);
			Passenger psg2= new Passenger("Jane Doe", 44);
			f.addPassenger(psg1);
			f.addPassenger(psg2);
			f.printInfo();
	}

}
