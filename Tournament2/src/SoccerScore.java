
public class SoccerScore implements IScore{
	
	int goals1;
	int goals2;
	boolean hasExtraTime;
	
	public SoccerScore(int goals1, int goals2, boolean hasExtraTime) {
		this.goals1 = goals1;
		this.goals2 = goals2;
		this.hasExtraTime = hasExtraTime;
	}

	
	//returns the number of the contestant with the larger number of goals
	public int getLarger(){
		if(goals1>goals2)return 1;
		else return 2;
	}


	//returns the name of the contestant that won the soccer match
	public String winner(IContestant cont1, IContestant cont2) {
		if(goals1 > goals2) return cont1.getName();
		else return cont2.getName();
	}

}
