
public class AdvancedMatch implements ITournament {
	
	MatchData data;
	ITournament feeder1;
	ITournament feeder2;
	
	public AdvancedMatch(MatchData data, ITournament feeder1, ITournament feeder2) {
		this.data = data;
		this.feeder1 = feeder1;
		this.feeder2 = feeder2;
	}

	//returns whether the given tournament is balanced 
	//the tournament is balanced if each of its subtrees has the same height
	//for any given match.
	public boolean isBalanced(){
		if(feeder1.getNumMatches()==feeder2.getNumMatches()){
			if(feeder1.isBalanced()&&feeder2.isBalanced()) 
				return true;
		}
		return false;
	}
	
	//returns the number of matches in the given tournament
	public int getNumMatches(){
		 return 1 + feeder1.getNumMatches() +feeder2.getNumMatches();
	}

}
