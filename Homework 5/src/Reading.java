
public class Reading {
	
	Time time;
	int temperature;
	
	public Reading(Time time, int temperature) {
		this.time = time;
		this.temperature = temperature;
	}
	
	public Time getTime() {
		return time;
	}
	
	public int getTemperature() {
		return temperature;
	}
	
}
