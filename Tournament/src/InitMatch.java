
public class InitMatch implements ITournament {
	
	MatchData data;
	
	public InitMatch(MatchData data){
		this.data=data;
	}

	//because an initial match has no feeders, always returns true
	public boolean winnerAlwaysAdvanced() {
		return true;
	}

	//returns whether this venue has higher capacity than a given value
	public boolean highCapacityVenue(int capacity) {
		return(data.matchVenue.capacity > capacity);
	}

	//returns whether the score of this match is valid
	public boolean allScoresValid() {
		return data.isScoreValid();
	}

	//returns the winner of the match
	public String getWinner() {
		if(data.score.getLarger()==1){
			return data.contestant1;
		}
		else return data.contestant2;
	}
	

}
