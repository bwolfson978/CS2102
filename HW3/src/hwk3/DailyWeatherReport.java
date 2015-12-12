package hwk3;
public class DailyWeatherReport {
	
	private Date date;				// Date of the report
	private WeatherReading low;		// Low temp WeatherReading
	private WeatherReading high;	// High Temp WeatherReading
	
	DailyWeatherReport(Date date, WeatherReading low, WeatherReading high){
		this.date = date;
		this.low = low;
		this.high = high;
	}
	
	// return the daily high temp
	double getHigh(){
		return this.high.getTemp();
	}
	
	// return the daily low temp
	double getLow(){
		return this.low.getTemp();
	}
	
	// return if the month passed in threw month is the month in which this DailyWeatherReport was made for
	boolean inMonth(int month){
		return this.date.inMonth(month);
	}
}
