
public class Soccer extends AbstractITeam implements IRanked {
	
	int ranking;
	
	public Soccer(String teamName, int numPlayers, String captain, int ranking) {
		super(teamName, numPlayers, captain);
		this.ranking = ranking;
	}

	//returns whether this contestant has a better ranking than the given contestant
	public boolean hasBetterRanking(IRanked contestant) {
		if(this.ranking < contestant.getRank())return true;
		else return false;
	}

	//returns the ranking of this contestant
	public int getRank() {
		return ranking;
	}

}
