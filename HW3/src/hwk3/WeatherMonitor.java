package hwk3;
import java.util.LinkedList;

public class WeatherMonitor {
	
	private IWeatherReportSet setOfReports;	// data structure to store the DailyReports
	
	WeatherMonitor(IWeatherReportSet setOfReports){
		this.setOfReports = setOfReports;
	}
	
	// get the average high temp for the month
	double averageHighForMonth(int month){
		return setOfReports.averageHighForMonth(month);
	}
	
	// get the average low temp for the month
	double averageLowForMonth(int month){
		return setOfReports.averageLowForMonth(month);
	}
	
	// add a daily report 
	void addDailyReport(Date date, LinkedList<WeatherReading> readings){
		
		// will throw an exception if it is an empty list
		// do not know exceptions yet
		WeatherReading high = readings.getFirst();
		WeatherReading low = readings.getFirst();
		
		for (WeatherReading reading:readings){
			if (reading.isGreaterThan(high)){
				high = reading;
			}
			else if (reading.isLessThan(low)){
				low = reading;
			}
		}
		
		setOfReports.addReport(date, low, high);
	}
}
