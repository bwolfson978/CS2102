
public class Date {
	
	private int monthNum;
	private int year;
	private int day;
	
	public Date(int monthNum, int year, int day) {
		this.monthNum = monthNum;
		this.year = year;
		this.day = day;
	}
	public int getMonthNum(){
		return this.monthNum;
	}

	public int getYear(){
		return this.year;
	}
	
	public int getDay(){
		return this.day;
	}
}
