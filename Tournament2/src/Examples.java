import tester.*;
public class Examples {
	
		//Baseball Examples
	
		ITeam redSox = new Baseball("Red Sox", 25, "David Ortiz");
		ITeam yankees = new Baseball("Yankees", 24, "Derek Jeter");
		ITeam orioles = new Baseball("Orioles", 26, "Sammy Sosa");
		ITeam marlins = new Baseball("Marlins", 23, "Barry Bonds");
	
		BaseballScore soxYankees = new BaseballScore(5,3,6,true);
		BaseballScore soxOrioles = new BaseballScore(4,2,9,false);
		BaseballScore yankeesMarlins = new BaseballScore(3,1,9,false);
		
		Venue fenway = new Venue("Fenway",10000);
		Venue camden = new Venue("Camden Yards",12000);
		Venue yankeeStad = new Venue("Yankee Stadium",13000);
		
		MatchData soxYankeesData = new MatchData(redSox,yankees,soxYankees,fenway);
		MatchData soxOriolesData = new MatchData(redSox,orioles,soxOrioles,camden);
		MatchData yankeesMarlinsData = new MatchData(yankees, marlins,yankeesMarlins,yankeeStad);
		
		InitMatch americanLeague = new InitMatch(soxOriolesData);
		InitMatch nationalLeague = new InitMatch(yankeesMarlinsData);
		
		ITournament championship = new AdvancedMatch(soxYankeesData, americanLeague, nationalLeague);
		
		//Soccer Examples
		
		IRanked revolution = new Soccer("Revolution", 15, "boss",3);
		IRanked redBull = new Soccer("Red Bull", 13, "Joey",2);
		IRanked manchester = new Soccer("Manchester United", 16,"Hank",1);
		IRanked liverpool = new Soccer("Liverpool", 20, "Peter",4);
		
		SoccerScore revsRedBull = new SoccerScore(5,3,false);
		SoccerScore revsManchester = new SoccerScore(4,2,false);
		SoccerScore ManchesterLiverpool = new SoccerScore(3,1,false);
		
		Venue gillete = new Venue("Gillete",10000);
		Venue oldTrafford = new Venue("Old Trafford",12000);
		Venue emirates = new Venue("Emirates",13000);

		MatchData revsRedBullData = new MatchData(revolution, redBull,revsRedBull,gillete);
		MatchData revsManchesterData = new MatchData(revolution, manchester, revsManchester, oldTrafford);
		MatchData ManchesterLiverpoolData = new MatchData(manchester,liverpool,ManchesterLiverpool,emirates);
		
		InitMatch east = new InitMatch(revsRedBullData);
		InitMatch west = new InitMatch(ManchesterLiverpoolData);
		
		ITournament WorldCup = new AdvancedMatch(revsManchesterData, east, west);
		
		//Swimming Examples
		IRanked michael = new Swimming("Michael Phelps", 2);
		IRanked ian = new Swimming("Ian Thorpe", 3);
		IRanked ryan = new Swimming("Ryan Lochte", 1);
		IRanked eric = new Swimming("Eric", 3);
		
		Venue china = new Venue("Bejing", 200);
		Venue vancouver = new Venue("Vancouver", 300);
		Venue brazil = new Venue("Brazil", 300);
		
		SwimmingScore michaelIanScore = new SwimmingScore(80, 100);
		SwimmingScore ryanEricScore = new SwimmingScore(75, 110);
		SwimmingScore ryanMichaelScore = new SwimmingScore(75, 70);
		
		MatchData michaelIanData = new MatchData(michael, ian, michaelIanScore, china);
		MatchData ryanEricData = new MatchData(ryan, eric, ryanEricScore, vancouver);
		MatchData ryanMichaelData = new MatchData(ryan, michael, ryanMichaelScore, brazil);
		
		InitMatch michaelVIan = new InitMatch(michaelIanData);
		InitMatch ryanVEric = new InitMatch(ryanEricData);
		ITournament olympics = new AdvancedMatch(ryanMichaelData, michaelVIan, ryanVEric);
		
		
		//tests the version of winner called by a score
		boolean testWinner1(Tester t){
			return t.checkExpect(soxYankees.winner(redSox,yankees),"Red Sox");
		}
		
		//tests the version of winner called by MatchData
		boolean testWinner2(Tester t){
			return t.checkExpect(soxYankeesData.winner(),"Red Sox");
		}
		
		//test the winner method called on scores for swimming
		boolean testWinner3(Tester t){
			return t.checkExpect(michaelIanScore.winner(michael,ian),"Michael Phelps");
		}
		
		//test the no parameter winner method on MatchData for swimming
		boolean testWinner4(Tester t){
			return t.checkExpect(ryanEricData.winner(),"Ryan Lochte");
		}
		
		//tests the hasBetterRanking method
		boolean testRank(Tester t){
			return t.checkExpect(revolution.hasBetterRanking(redBull),false);
		}
		
		//tests the hasBetterRanking method for swimming
		boolean testRank2(Tester t){
			return t.checkExpect(michael.hasBetterRanking(ian),true);
		}
		
		//tests the getNumMatches method for a swimming tournament
		boolean testNumMatches(Tester t){
			return t.checkExpect(olympics.getNumMatches(),3);
		}
		
		//tests the getNumMatches method to see if the World Cup has 3 matches
		boolean testNumMatches2(Tester t){
			return t.checkExpect(WorldCup.getNumMatches(),3);
		}
		
		//tests whether the World Cup is a perfectly balanced tournament
		boolean testBalanced(Tester t){
			return t.checkExpect(WorldCup.isBalanced(),true);
		}
		
		//tests to see if the olympics is a perfectly balanced tournament
		boolean testBalanced2(Tester t){
			return t.checkExpect(olympics.isBalanced(),true);
		}
		
		
	}

