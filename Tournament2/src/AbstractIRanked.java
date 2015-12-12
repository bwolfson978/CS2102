
public abstract class AbstractIRanked implements IRanked {
	
	String name;
	int ranking;
	
	public AbstractIRanked(String name, int ranking) {
		this.name = name;
		this.ranking = ranking;
	}

	public String getName(){
		return this.name;
	}
	
	public int getRank(){
		return this.ranking;
	}
	
	public boolean hasBetterRanking(IRanked contestant1){
		return (this.ranking < contestant1.getRank());
	}

}
