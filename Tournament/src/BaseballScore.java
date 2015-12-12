
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
	
	//returns whether a given BaseballScore is valid
	public boolean isValid(){
		if(isRainDelayed && innings<5)return false;
		else if(!isRainDelayed && innings<9)return false;
		else if(runs1==runs2)return false;
		else return true;
	}
	
	//returns the contestant number with the larger score
	public int getLarger(){
		if (runs1>runs2)return 1;
		else return runs2;
	}
	
	

}
