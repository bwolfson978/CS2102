
public class SoccerScore implements IScore{
	
	int goals1;
	int goals2;
	boolean hasExtraTime;
	
	public SoccerScore(int goals1, int goals2, boolean hasExtraTime) {
		this.goals1 = goals1;
		this.goals2 = goals2;
		this.hasExtraTime = hasExtraTime;
	}

	//determines whether a SoccerScore is valid. If the score is tied, extra time had
	//to have been played. 
	public boolean isValid() {
		if(goals1==goals2 && hasExtraTime==false)
			return false;
		return true;
	}
	
	//returns the number of the contestant with the larger number of goals
	public int getLarger(){
		if(goals1>goals2)return 1;
		else return 2;
	}

}
