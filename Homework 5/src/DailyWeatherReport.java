
public class DailyWeatherReport {
	
	private Date date;
	private Reading high;
	private Reading low;

	DailyWeatherReport(Date date, Reading highTemp, Reading lowTemp){
		this.date = date;
		this.high = highTemp;
		this.low = lowTemp;
	}
	
	public Date getDate(){
		return this.date;
	}
	
	public Reading getHigh(){
		return this.high;
	}
	
	public Reading getLow(){
		return this.low;
	}

}
