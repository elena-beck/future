package future.berlin.flight;
import java.util.Vector;

public class Flight {
	
	private String id;
	private String destination;
	private Time depart;
	private Time arrival;
	private Vector passengerList = new Vector();;
	
	public Flight(String id, String destination, Time depart, Time arrival) {
		this.id = id;
		this.destination = destination;
		this.depart = depart;
		this.arrival = arrival;
	}
	
	public void addPassenger(Passenger psg) {
		this.passengerList.add(psg);
	}
	
	
	public void printInfo(){   
		System.out.println("Flug Nummer: "+id);
		System.out.println("Fluziel: "+destination);
		System.out.println("Abflug: "+depart.getHour()+":"+depart.getMinute());
		System.out.println("Ankunft: "+arrival.getHour()+":"+arrival.getMinute() );
		System.out.println("Anzahl der Passagiere: "+passengerList.size()); 
	}

}
