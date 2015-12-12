
public class AdvancedMatch implements ITournament {
	
	MatchData data;
	ITournament feeder1;
	ITournament feeder2;
	
	public AdvancedMatch(MatchData data, ITournament feeder1, ITournament feeder2) {
		this.data = data;
		this.feeder1 = feeder1;
		this.feeder2 = feeder2;
	}

	//returns whether or not every winner in the tournament advanced to the next round
	public boolean winnerAlwaysAdvanced() {
		if(allScoresValid() && feeder1.getWinner()==data.contestant1 &&
			feeder2.getWinner()==data.contestant2)return true;
		return false;
	}

	//returns whether a venue has a higher seating capacity than a given capacity
	public boolean highCapacityVenue(int capacity) {
		return (data.matchVenue.capacity>capacity);
	}

	//returns whether all scores in a given tournament are valid
	public boolean allScoresValid() {
		return(data.score.isValid()&& 
				feeder1.allScoresValid()&&
				feeder2.allScoresValid());
	}

	//returns the winner of this match
	public String getWinner() {
		if(data.score.getLarger()==1){
			return data.contestant1;
		}
		return data.contestant2;
	}
	

}
