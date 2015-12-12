import java.util.LinkedList;


public class Graph implements IGraph{
private LinkedList<Node> nodes;

Graph(){
	this.nodes = new LinkedList<Node>();
}

public Node addNode(String cityname) {
	Node newN = new Node(cityname);
	this.nodes.add(newN);
	return newN;
}


public LinkedList<Network> getNetworks() {
	LinkedList<Network>result= new LinkedList<Network>();
	
	for(Node n : nodes){
		boolean hasNetwork = false;
		for(Network net : result){
			if(net.equals(n.getMyNetwork())){
				hasNetwork = true;
			}
		}
		if(!hasNetwork){
			result.add(n.getMyNetwork());
		}
	}
	return result;
}

public void addConnection(Node from, Node to) {
	from.addEdge(to);
}

}