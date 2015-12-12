
public interface IGraph {
//add a new node with the given string as the cityname
	Node addNode(String cityname);
	
//add a directed edge from the "from" node to the "to" node
	void addConnection(Node from, Node to);
}


