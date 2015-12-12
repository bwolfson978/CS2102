package hwk3;
public class WeatherReading {
	
	private Time time;		// time of the weather reading
	private double temp;	// temp taken during the reading
	
	WeatherReading(Time time, double temp){
		this.time = time;
		this.temp = temp;
	}
	
	// compares if the current weather reading is less than the WeatherReading passed in
	boolean isLessThan(WeatherReading prev){
		return (this.temp < prev.getTemp());
	}
	
	// compares if the current weather reading is greater than the WeatherReading passed in
	boolean isGreaterThan(WeatherReading prev){
		return (this.temp > prev.getTemp());
	}
	
	// returns the temp during the weather reading
	double getTemp(){
		return this.temp;
	}
}
