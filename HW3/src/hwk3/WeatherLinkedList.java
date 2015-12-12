package hwk3;
import java.util.LinkedList;

public class WeatherLinkedList implements IWeatherReportSet {
	
	private LinkedList<DailyWeatherReport> reportList = new LinkedList<DailyWeatherReport>();	// keep a list of all of the DailywWeatherReports
	
	WeatherLinkedList(){}
	
	// add a DailyWeatherReport to the internal linked list
	public void addReport(Date date, WeatherReading low, WeatherReading high){
		reportList.add(new DailyWeatherReport(date, low, high));
	}
	
	// helper function for testing
	int sizeOfList(){
		return reportList.size();
	}
	
	// average the high temps of the month 
	// zero if empty (do not know exceptions yet)
	public double averageHighForMonth(int month){
		double sum = 0.0;
		int count = 0;
		for(DailyWeatherReport report:reportList){
			if (report.inMonth(month)){
				sum = sum + report.getHigh();
				count = count + 1;
			}
		}
		return (sum/count);
	}
	
	// average the low temps of the month
	// zero if empty (do not know exceptions yet)
	public double averageLowForMonth(int month){
		double sum = 0.0;
		int count = 0;
		for(DailyWeatherReport report:reportList){
			if (report.inMonth(month)){
				sum = sum + report.getLow();
				count = count + 1;
			}
		}
		return (sum/count);
	}
}
