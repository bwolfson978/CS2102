
public class MatchData {
	
	String contestant1;
	String contestant2;
	IScore score;
	Venue matchVenue;
	
	public MatchData(String contestant1, String contestant2, IScore score, Venue matchVenue) {
		this.contestant1 = contestant1;
		this.contestant2 = contestant2;
		this.score = score;
		this.matchVenue = matchVenue;
	}
	
	public boolean isScoreValid(){
		return score.isValid();
	}
	
}
