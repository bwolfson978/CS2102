
public class BaseballScore implements IScore{
	
	int runs1;
	int runs2;
	int innings;
	boolean isRainDelayed;
	
	public BaseballScore(int runs1, int runs2, int innings, boolean isRainDelayed) {
		this.runs1 = runs1;
		this.runs2 = runs2;
		this.innings = innings;
		this.isRainDelayed = isRainDelayed;
	}

	
	//returns the contestant number with the larger score
	public int getLarger(){
		if (runs1>runs2)return 1;
		else return runs2;
	}


	//returns the name of the contestant that won the baseball game
	public String winner(IContestant cont1, IContestant cont2) {
		if(runs1 > runs2) return cont1.getName();
		else return cont2.getName();
	}
	
	

}
