

	import java.util.LinkedList;

	import tester.Tester;


	public class Examples {
		Graph G = new Graph();
	Node bost, worc, hart, chic, denv, phoe, hous, tuls;

	Network bostonNetwork = new Network();
	Network chicagoNetwork = new Network();
	Network phoenixNetwork = new Network();
	LinkedList<Network> G1networks = new LinkedList<Network>();
	
	Graph G2 = new Graph();
	Node act,box,wes,lit,rox,lin,lex,sud,con;
	
	Network boxboroNetwork = new Network();
	Network lexNetwork = new Network();
	LinkedList<Network> G2networks = new LinkedList<Network>();

	void initNetwork(){
		
		bostonNetwork.addToNetwork("Boston");
		bostonNetwork.addToNetwork("Worcester");
		bostonNetwork.addToNetwork("Hartford");
		
		chicagoNetwork.addToNetwork("Chicago");
		chicagoNetwork.addToNetwork("Denver");
		
		phoenixNetwork.addToNetwork("Phoenix");
		phoenixNetwork.addToNetwork("Houston");
		phoenixNetwork.addToNetwork("Tulsa");
		
		G1networks.add(bostonNetwork);
		G1networks.add(chicagoNetwork);
		G1networks.add(phoenixNetwork);
		
		boxboroNetwork.addToNetwork("Acton");
		boxboroNetwork.addToNetwork("Boxboro");
		boxboroNetwork.addToNetwork("Westford");
		boxboroNetwork.addToNetwork("Littleton");
		
		lexNetwork.addToNetwork("Roxbury");
		lexNetwork.addToNetwork("Lexington");
		lexNetwork.addToNetwork("Lincoln");
		lexNetwork.addToNetwork("Sudbury");
		lexNetwork.addToNetwork("Concord");
		
		G2networks.add(boxboroNetwork);
		G2networks.add(lexNetwork);
		
	}

	 void initGraph() {
		bost = this.G.addNode("Boston");
		worc = this.G.addNode("Worcester");
		hart = this.G.addNode("Hartford");
		chic = this.G.addNode("Chicago");
		denv = this.G.addNode("Denver");
		phoe = this.G.addNode("Phoenix");
		hous = this.G.addNode("Houston");
		tuls = this.G.addNode("Tulsa");
		
		G.addConnection(bost, worc);
		//G.addConnection(worc, bost);
		G.addConnection(worc, hart);
		//G.addConnection(hart, worc);
		G.addConnection(chic, denv);
		//G.addConnection(denv, chic);
		G.addConnection(phoe, hous);
		//G.addConnection(hous, phoe);
		G.addConnection(hous, tuls);
		//G.addConnection(tuls, hous);
		
		act = this.G2.addNode("Acton");
		box = this.G2.addNode("Boxboro");
		wes = this.G2.addNode("Westford");
		lit = this.G2.addNode("Littleton");
		rox = this.G2.addNode("Roxbury");
		lin = this.G2.addNode("Lincoln");
		lex = this.G2.addNode("Lexington");
		sud = this.G2.addNode("Sudbury");
		con = this.G2.addNode("Concord");
		
		G2.addConnection(box, act);
		//G2.addConnection(box, act);
		G2.addConnection(box, lit);
		//G2.addConnection(lit,box);
		G2.addConnection(box, wes);
		//G2.addConnection(wes,box);
		
		G2.addConnection(rox, lex);
		//G2.addConnection(lex,rox);
		G2.addConnection(lin, lex);
		//G2.addConnection(lex,lin);
		G2.addConnection(lex, sud);
		//G2.addConnection(sud,lex);
		G2.addConnection(lex, con);
		//G2.addConnection(con,lex);
		
		}
	Examples(){
		this.initGraph();
		this.initNetwork();
	}

	boolean testGetNetwork1(Tester t){
		return t.checkExpect(G.getNetworks(), G1networks);
	}
	
	boolean testGetNetwork2(Tester t){
		return t.checkExpect(G2.getNetworks(), G2networks);
	}


	}


