import java.util.LinkedList;

//ReportList contains a list of DailyWeatherReports and a way to add new reports to that list
public class ReportList implements IWeatherData{
	
	private LinkedList<DailyWeatherReport> reports;
	
	public ReportList(){
		reports = new LinkedList<DailyWeatherReport>();
	}
	
	public ReportList(LinkedList<DailyWeatherReport> reports){
		this.reports=reports;
	}
	
	public LinkedList<DailyWeatherReport> getReports(){
		return this.reports;
	}
	
	//adds a Daily Weather Report to the list of Daily Weather Reports
	public boolean addReport(DailyWeatherReport report){
		return reports.add(report);
	}
}
