import tester.*;
public class Examples {
	
		//Baseball Examples
		BaseballScore soxYankees = new BaseballScore(5,3,6,true);
		BaseballScore soxOrioles = new BaseballScore(4,2,9,false);
		BaseballScore yankeesMarlins = new BaseballScore(3,1,9,false);
		
		Venue fenway = new Venue("Fenway",10000);
		Venue camden = new Venue("Camden Yards",12000);
		Venue yankeeStad = new Venue("Yankee Stadium",13000);
		
		MatchData soxYankeesData = new MatchData("Red Sox", "Yankees",soxYankees,fenway);
		MatchData soxOriolesData = new MatchData("Red Sox", "Orioles",soxOrioles,camden);
		MatchData yankeesMarlinsData = new MatchData("Yankees", "Marlins",yankeesMarlins,yankeeStad);
		
		InitMatch americanLeague = new InitMatch(soxOriolesData);
		InitMatch nationalLeague = new InitMatch(yankeesMarlinsData);
		
		ITournament championship = new AdvancedMatch(soxYankeesData, americanLeague, nationalLeague);
		
		//Soccer Examples
		SoccerScore revsRedBull = new SoccerScore(5,3,false);
		SoccerScore revsManchester = new SoccerScore(4,2,false);
		SoccerScore ManchesterLiverpool = new SoccerScore(3,1,false);
		
		Venue gillete = new Venue("Gillete",10000);
		Venue oldTrafford = new Venue("Old Trafford",12000);
		Venue emirates = new Venue("Emirates",13000);
		
		MatchData revsRedBullData = new MatchData("Revolution", "Red Bull",revsRedBull,gillete);
		MatchData revsManchesterData = new MatchData("Revolution", "Manchester United", revsManchester, oldTrafford);
		MatchData ManchesterLiverpoolData = new MatchData("Manchester United","Liverpool",ManchesterLiverpool,emirates);
		
		InitMatch east = new InitMatch(revsRedBullData);
		InitMatch west = new InitMatch(ManchesterLiverpoolData);
		
		ITournament WorldCup = new AdvancedMatch(revsManchesterData, east, west);
					
		//tests to see if all scores in a tournament are valid
		boolean testAllScoresValid1(Tester t){
			return t.checkExpect(WorldCup.allScoresValid(),true);
		}
		boolean testAllScoresValid2(Tester t){
			return t.checkExpect(championship.allScoresValid(),true);
		}
		
		//tests to see if all winners advanced 
		boolean testWinnersAdvanced1(Tester t){
			return t.checkExpect(WorldCup.winnerAlwaysAdvanced(),true);
		}
		boolean testWinnersAdvanced2(Tester t){
			return t.checkExpect(championship.winnerAlwaysAdvanced(),true);
		}
		boolean testWinnersAdvanced3(Tester t){
			return t.checkExpect(west.winnerAlwaysAdvanced(),true);
		}
		
		//tests to see if a venue has a high capacity
		boolean testHighCapactity(Tester t){
			return t.checkExpect(championship.highCapacityVenue(500),true);
		}
		boolean testHighCapactiy(Tester t){
			return t.checkExpect(WorldCup.highCapacityVenue(20000),false);
		}
		
		//tests to see if a specific score is valid
		boolean testIsValid1(Tester t){
			return t.checkExpect(soxYankees.isValid(),true);
		}
		boolean testIsValid2(Tester t){
			return t.checkExpect(revsManchester.isValid(),true);
		}					
	
	}

