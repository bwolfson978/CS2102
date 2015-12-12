import java.util.LinkedList;

import tester.Tester;


public class Examples {
	
	Time morning = new Time(6,30);
	Time night = new Time(18,0);
	
	Date feb1 = new Date(2,2014,1);
	Date feb2 = new Date(2,2014,2);
	Date feb3 = new Date(2,2014,3);
	Date jul1 = new Date(7,2014,1);
	Date jul2 = new Date(7,2014,2);
	Date jul3 = new Date(7,2014,3);
	
	Reading r20 = new Reading(morning,20);
	Reading r25 = new Reading(night,25);
	Reading r30 = new Reading(morning,30);
	Reading r40 = new Reading(night,40);
	Reading r56 = new Reading(morning,56);
	Reading r60 = new Reading(night,60);
	
	Reading r65 = new Reading(morning,65);
	Reading r70 = new Reading(night,70);
	Reading r80 = new Reading(morning,80);
	Reading r85 = new Reading(night,85);
	Reading r72 = new Reading(morning,72);
	Reading r78 = new Reading(night,78);
	LinkedList<Reading> readings = new LinkedList<Reading>();
	
	DailyWeatherReport d1 = new DailyWeatherReport(feb1,r40,r30);
	DailyWeatherReport d2 = new DailyWeatherReport(feb2,r60,r56);
	DailyWeatherReport d3 = new DailyWeatherReport(feb3,r25,r20);
	DailyWeatherReport d4 = new DailyWeatherReport(jul1,r70,r65);
	DailyWeatherReport d5 = new DailyWeatherReport(jul2,r85,r80);
	DailyWeatherReport d6 = new DailyWeatherReport(jul3,r78,r72);
	ReportList reportList = new ReportList();
	
	Examples(){
	readings.add(r20);
	readings.add(r25);
	readings.add(r30);
	readings.add(r40);
	readings.add(r56);
	readings.add(r60);
	readings.add(r70);
	readings.add(r80);
	
	reportList.addReport(d1);
	reportList.addReport(d2);
	reportList.addReport(d3);
	reportList.addReport(d4);
	reportList.addReport(d5);
	reportList.addReport(d6);
	}
	
	//testing the averageHigh method
	boolean testAvgHigh(Tester t){
		WeatherMonitor w = new WeatherMonitor(reportList);
		return t.checkExpect(w.averageHighForMonth(2, 2014),41.666666666666664);
	}
	
	//testing the averageLow method
	boolean testAvgLow(Tester t){
		WeatherMonitor w = new WeatherMonitor(reportList);
		return t.checkExpect(w.averageLowForMonth(7, 2014),72.33333333333333);
	}
	
	//testing the add daily report method
	//this also means that getHighest and getLowest work because they are called and relied upon by addDailyReport
	boolean testAddDailyReport(Tester t){
		//creating a list of readings for the new Daily Report
		LinkedList<Reading> readings = new LinkedList<Reading>();
		readings.add(r65);
		readings.add(r70);
		readings.add(r80);
		WeatherMonitor w = new WeatherMonitor(reportList);
		//adding a daily weather report onto the end of the report list
		w.addDailyReport(new Date(1,2014,4),readings);
		return t.checkExpect(w.getReportList().getReports().get(6),new DailyWeatherReport(new Date(1,2014,4),r80,r65));
	}
	
	
	
	
	
	
	
	
	
	
	

	
}
