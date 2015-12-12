
import java.util.LinkedList;


public class Network {
	
	private LinkedList<String> citynames;

	public Network(){
		this.citynames = new LinkedList<String>();
	}

	public Network(LinkedList<String>citynames){
		this.citynames = citynames;
	}

	public LinkedList<String> getCitynames(){
		return this.citynames;
	}

	public void addToNetwork(String nameOf){
		this.citynames.add(nameOf);
	}
	
	public boolean equals(Object o){
		boolean sameNet = false;
		if(o instanceof Network){
			Network n = (Network) o;
			for(String s : this.getCitynames()){
				if(n.getCitynames().contains(s)){
					sameNet=true;
				} 
			}
		}
		return sameNet;
	}

}
