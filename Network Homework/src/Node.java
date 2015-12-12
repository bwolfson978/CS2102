import java.util.LinkedList;

public class Node {
	
	private String cityname;
	//List of nodes to which there exists a direct flight,
	//If city A can fly to city B, city B can fly to city A
	private LinkedList<Node> flightGetsTo;
	
	public Node(String cityname){
		this.cityname = cityname;
		this.flightGetsTo = new LinkedList<Node>();
	}
	
	public String getCityname() {
		return cityname;
	}
	
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	
	public LinkedList<Node> getFlightGetsTo() {
		return flightGetsTo;
	}
	
	public void setFlightGetsTo(LinkedList<Node> flightGetsTo) {
		this.flightGetsTo = flightGetsTo;
	}

	//adds an edge from this node to a given node
	public void addEdge(Node toNode){
		this.flightGetsTo.add(toNode);
	}

	public Network getMyNetwork(){
		return getMyNetworkHelper(new Network(),new LinkedList<Node>());
	}

	public Network getMyNetworkHelper(Network net, LinkedList<Node>visited){
		if(visited.contains(this.getCityname())){
			return net;
		}
		else{
			net.addToNetwork(this.cityname);
			visited.add(this);
			for(Node n : flightGetsTo){
				n.getMyNetworkHelper(net,visited);
			}
			return net;
		}	
	}
}
