
public interface ITournament {
	
	//returns whether the tournament is perfectly balanced
	public boolean isBalanced();
	
	//returns the the number of elements in a given tournament i.e. the height
	//of any given subtree in the tournament
	public int getNumMatches();
}
