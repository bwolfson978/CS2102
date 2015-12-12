
public class InitMatch implements ITournament {
	
	MatchData data;
	
	public InitMatch(MatchData data){
		this.data=data;
	}

	//returns whether this subtree is balanced and because each of its 
	//subtrees always has height 0, it always is balanced.
	public boolean isBalanced() {
		return true;
	}

	//returns the number of elements in this subtree of the tournament.
	//because this is an initial match getNumElts just returns 1.
	public int getNumMatches() {
		return 1;
	}

	

}
