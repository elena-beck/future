package future.berlin.flight;

public class Time {
	private int hour;
	private int minute;
	
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public void setHour(int hour) {
		this.hour = hour; 
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public void setMinute(int min) {
		this.minute = min;
	}

}
