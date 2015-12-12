
public class SwimmingScore implements IScore {
	
	int contestant1time;
	int contestant2time;
	
	public SwimmingScore(int contestant1time, int contestant2time) {
		this.contestant1time = contestant1time;
		this.contestant2time = contestant2time;
	}

	//returns the name of the contestant with the lower time
	public String winner(IContestant cont1, IContestant cont2) {
		if(contestant1time<contestant2time) return cont1.getName();
		else return cont2.getName();
	}
}
