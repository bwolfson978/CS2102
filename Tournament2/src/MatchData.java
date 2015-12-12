
public class MatchData {
	
	IContestant contestant1;
	IContestant contestant2;
	IScore score;
	Venue matchVenue;
	
	public MatchData(IContestant contestant1, IContestant contestant2, IScore score, Venue matchVenue) {
		this.contestant1 = contestant1;
		this.contestant2 = contestant2;
		this.score = score;
		this.matchVenue = matchVenue;
	}
	
	public String winner(){
		return score.winner(this.contestant1, this.contestant2);
	}

	
}
