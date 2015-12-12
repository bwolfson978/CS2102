package hwk3;

public interface IWeatherReportSet {
	
	// add a DailyReport to the data structure
	void addReport(Date date, WeatherReading low, WeatherReading high);
	
	// find the average high temperature for the month
	double averageHighForMonth(int month);
	
	// find the average low temperature for the month
	double averageLowForMonth(int month);
}
