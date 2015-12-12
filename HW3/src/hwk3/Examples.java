// Zachary Armsby

package hwk3;
import java.util.LinkedList;

import tester.*;

public class Examples {
	
	IWeatherReportSet weatherReports = new WeatherLinkedList();
	WeatherMonitor monitor = new WeatherMonitor(weatherReports);
	
	Time timeA = new Time(2, 50);
	Time timeB = new Time(2, 20);
	Time timeC = new Time(2, 30);
	Time timeD = new Time(2, 5);
	
	Date dateA = new Date(4, 3, timeA);
	Date dateB = new Date(1, 2, timeB);
	
	WeatherReading readingA = new WeatherReading(timeA, 40.0);
	WeatherReading readingB = new WeatherReading(timeB, 50.0);
	WeatherReading readingC = new WeatherReading(timeC, 60.0);
	WeatherReading readingD = new WeatherReading(timeD, 70.0);
	WeatherReading readingE = new WeatherReading(timeD, 40.0);
	WeatherReading readingF = new WeatherReading(timeD, 30.0);
	
	LinkedList<WeatherReading> readingListA = new LinkedList<WeatherReading>();
	LinkedList<WeatherReading> readingListB = new LinkedList<WeatherReading>();
	LinkedList<WeatherReading> readingListC = new LinkedList<WeatherReading>();
	
	
	DailyWeatherReport reportA = new DailyWeatherReport(dateA, readingA, readingB);
	DailyWeatherReport reportB = new DailyWeatherReport(dateA, readingA, readingA);
	
	WeatherLinkedList weatherListA = new WeatherLinkedList();
	WeatherLinkedList weatherListB = new WeatherLinkedList();
	WeatherLinkedList weatherListC = new WeatherLinkedList();
	WeatherLinkedList weatherListD = new WeatherLinkedList();
	WeatherLinkedList weatherListE = new WeatherLinkedList();
	WeatherLinkedList weatherListF = new WeatherLinkedList();
	WeatherLinkedList weatherListG = new WeatherLinkedList();
	WeatherLinkedList weatherListH = new WeatherLinkedList();
	WeatherLinkedList weatherListI = new WeatherLinkedList();
	
	////////////////////////////////////// Tests for addReport (WeatherMonitor) ////////////////////////////////////////////////
	
	// test that the high value is added
	boolean testaddReportMontor1 (Tester t){
		readingListA.addFirst(readingA);
		readingListA.addFirst(readingB);
		readingListA.addFirst(readingC);
		readingListA.addFirst(readingD);
		monitor.addDailyReport(dateA, readingListA);
		
		return  t.checkExpect(monitor.averageHighForMonth(4),70.0);
	}
	
	// test that the low value is added
	boolean testaddReportMontor2 (Tester t){
		readingListB.addFirst(readingA);
		readingListB.addFirst(readingB);
		readingListB.addFirst(readingC);
		readingListB.addFirst(readingD);
		monitor.addDailyReport(dateA, readingListB);
		
		return  t.checkExpect(monitor.averageLowForMonth(4),40.0);
	}
	
	
	// averageHighForMonth and averageLowForMonth are pass thru functions, tests for those methods exist below
	// addReports is a pass thru except for determining with WeatherReading is High and Low (above tests cover that)
	
	////////////////////////////////////// Tests for addReport ////////////////////////////////////////////////
	
	// test that the list of DailyWeatherReports starts empty, also size of list 
	boolean testaddReport1 (Tester t){
		return t.checkExpect(weatherListC.sizeOfList(), 0);
	}
		
	// test that after adding to the empty list the list grew by one, also size of list 
	boolean testaddReport2 (Tester t){
		weatherListA.addReport(dateA, readingA, readingB);
		return t.checkExpect(weatherListA.sizeOfList(), 1);
	}
	
	// test that adding to a list with one element already still grows by one, also size of list 
	boolean testaddReport3 (Tester t){
		weatherListB.addReport(dateA, readingA, readingB);
		weatherListB.addReport(dateA, readingA, readingB);
		return t.checkExpect(weatherListB.sizeOfList(), 2);
	}
	
	//////////////////////////////////////Tests for addReport ////////////////////////////////////////////////
	// not testing breaking cases
	// do not know exceptions
	// ie. empty cases
	
	
	// test that the average for with one number
	boolean testaverageHighForMonth1 (Tester t){
		weatherListD.addReport(dateA, readingA, readingB);
		return t.checkExpect(weatherListD.averageHighForMonth(4), 50.0);
	}
	
	// test that the average for with two numbers in the same month
	boolean testaverageHighForMonth2 (Tester t){
		weatherListE.addReport(dateA, readingA, readingB);
		weatherListE.addReport(dateA, readingA, readingC);
		return t.checkExpect(weatherListE.averageHighForMonth(4), 55.0);
	}
	
	// test that the average for with two numbers in different months
	boolean testaverageHighForMonth3 (Tester t){
		weatherListF.addReport(dateA, readingA, readingB);
		weatherListF.addReport(dateB, readingA, readingC);
		return t.checkExpect(weatherListF.averageHighForMonth(4), 50.0);
	}
	
	
	//////////////////////////////////////Tests for addReport ////////////////////////////////////////////////
	// not testing breaking cases
	// do not know exceptions
	// ie. empty cases
	
	
	// test that the average for with one number
	boolean testaverageLowForMonth1 (Tester t){
		weatherListG.addReport(dateA, readingA, readingB);
		return t.checkExpect(weatherListG.averageLowForMonth(4), 40.0);
	}
	
	// test that the average for with two numbers in the same month
	boolean testaverageLowForMonth2 (Tester t){
		weatherListH.addReport(dateA, readingA, readingB);
		weatherListH.addReport(dateA, readingB, readingC);
		return t.checkExpect(weatherListH.averageLowForMonth(4), 45.0);
	}
	
	// test that the average for with two numbers in different months
	boolean testaverageLowForMonth3 (Tester t){
		weatherListI.addReport(dateA, readingA, readingB);
		weatherListI.addReport(dateB, readingA, readingC);
		return t.checkExpect(weatherListI.averageLowForMonth(4), 40.0);
	}
		
	////////////////////////////////////// Tests for inMonth (Date) ////////////////////////////////////////////////
	
	// test that checking the incorrect month
	boolean testDate1 (Tester t){
		return t.checkExpect(dateA.inMonth(1), false);
	}
	
	// test checking the correct month
	boolean testDate2 (Tester t){
		return t.checkExpect(dateA.inMonth(4), true);
	}
	
	////////////////////////////////////// Tests for isLessThan ////////////////////////////////////////////////
	
	// tests when temp is less than the temp of the reading passed in 
	boolean testisLessThan1 (Tester t){
		return t.checkExpect(readingA.isLessThan(readingB), true);
	}
	
	// tests when temp is the same of the temp of the reading passed in 
	boolean testisLessThan2 (Tester t){
		return t.checkExpect(readingA.isLessThan(readingE), false);
	}
	
	// tests when temp is greater than the temp of the reading passed in 
	boolean testisLessThan3 (Tester t){
		return t.checkExpect(readingA.isLessThan(readingF), false);
	}
	
	////////////////////////////////////// Tests for isGreaterThan ////////////////////////////////////////////////
	
	// tests when temp is less than the temp of the reading passed in 
	boolean testisGreaterThan1 (Tester t){
		return t.checkExpect(readingA.isGreaterThan(readingB), false);
	}
	
	// tests when temp is the same of the temp of the reading passed in 
	boolean testisGreaterThan2 (Tester t){
		return t.checkExpect(readingA.isGreaterThan(readingE), false);
	}
	
	// tests when temp is greater than the temp of the reading passed in 
	boolean testisGreaterThan3 (Tester t){
		return t.checkExpect(readingA.isGreaterThan(readingF), true);
	}
		
	
	////////////////////////////////////// Tests for getTemp ////////////////////////////////////////////////
	
	// tests when temp is the temp from the reading
	boolean testgetTemp1 (Tester t){
		return t.checkExpect(readingA.getTemp(), 40.0);
	}
	
	////////////////////////////////////// Tests for getHigh ////////////////////////////////////////////////
		
	// test that the high temp is returned
	boolean testgetHigh1 (Tester t){
		return t.checkExpect(reportA.getHigh(), 50.0);
	}
	
	////////////////////////////////////// ests for getHigh ////////////////////////////////////////////////
	
	// test that the low temp is returned
	boolean testgetLow1 (Tester t){
		return t.checkExpect(reportA.getLow(), 40.0);
	}
	
	////////////////////////////////////// Tests for inMonth (DailyWeatherReport) ////////////////////////////////////////////////
		
	// test that checking the incorrect month
	boolean testinMonth1 (Tester t){
		return t.checkExpect(reportA.inMonth(1), false);
	}
	
	// test checking the correct month
	boolean testinMonth2 (Tester t){
		return t.checkExpect(reportA.inMonth(4), true);
	}

	
}
