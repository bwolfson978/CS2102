
public abstract class AbstractITeam implements ITeam {
	
	String teamName;
	int numPlayers;
	String captain;
	
	public AbstractITeam(String teamName, int numPlayers, String captain) {
		this.teamName = teamName;
		this.numPlayers = numPlayers;
		this.captain = captain;
	}

	public String getName(){
		return this.teamName;
	}

}
