import java.util.LinkedList;

public class WeatherMonitor {
	
	public ReportList reportList;

	public WeatherMonitor(ReportList reportList){
		this.reportList=reportList;
	}

	//takes a month and a year and returns the average high temperature for that month
	public double averageHighForMonth(int forMonth, int forYear){
		double sum = 0;
		int count = 0;
		for(DailyWeatherReport report : reportList.getReports()){
			if(report.getDate().getMonthNum() == forMonth && report.getDate().getYear() == forYear){
				count++;
				sum += report.getHigh().getTemperature(); 
			}
		}
		return sum/count;
	}
	
	//takes a month and a year and returns the average low temperature for that month
	public double averageLowForMonth(int forMonth, int forYear){
		double sum = 0;
		int count = 0;
		for(DailyWeatherReport report : reportList.getReports()){
			if(report.getDate().getMonthNum() == forMonth && report.getDate().getYear() == forYear){
				count++;
				sum += report.getLow().getTemperature(); 
			}			
		}
		return sum/count;
	}

	//creates a report based off of a given date and list of readings and adds the report to the report list
	//returns false if the report couldn't be added
	public boolean addDailyReport(Date date, LinkedList<Reading> readings){
		Reading reading1 = getHighest(readings);
		Reading reading2 = getLowest(readings);
		DailyWeatherReport report = new DailyWeatherReport(date, reading1, reading2);
		return reportList.addReport(report);
	}

	//returns the reading with the highest temperature out of the given list of readings
	public static Reading getHighest(LinkedList<Reading> readings){
		Reading high = readings.get(0);
		for(int i = 0; i < readings.size(); i++){	
			if(readings.get(i).getTemperature() > high.getTemperature()){
				high = readings.get(i);
			}
		}
		return high;
	}
	
	//returns the reading with the lowest temperature out of the given list of readings
	public static Reading getLowest(LinkedList<Reading> readings){
		Reading low = readings.get(0);
		for(int i = 0; i < readings.size(); i++){	
			if(readings.get(i).getTemperature() < low.getTemperature()){
				low = readings.get(i);
			}
		}
		return low;
	}

	//returns the report list
	public ReportList getReportList() {
		return this.reportList;
	}
}


