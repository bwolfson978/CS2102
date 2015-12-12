package hwk3;

public class Date {
	
	private int month; 	// month of the date
	private int date;	// day of the date
	private Time time;	// time of the date
	
	Date(int month, int date, Time time){
		this.month = month;
		this.date = date;
		this.time  = time;
	}
	
	// see if the month is the same as the month passed in
	boolean inMonth(int month){
		return (this.month == month);
	}
}
