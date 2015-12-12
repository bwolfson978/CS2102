
public interface IWeatherData {
	
	//adds a DailyWeatherReport to whatever data structure is being used for storing multiple weather reports
	public boolean addReport(DailyWeatherReport report);
}
