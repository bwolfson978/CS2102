package hwk4;


import java.lang.Math;
import java.util.LinkedList;

interface IBinTree {
	// determines whether element is in the tree
	boolean hasElt(int e);
	// returns number of nodes in the tree; counts duplicate elements as separate items
	int size();
	// returns depth of longest branch in the tree
	int height();
	
	// determines if the input elements are conservered in the current tree
	boolean conserveEltsAdd(IBinTree Borig, int elt);
	// determines if the input elements are conservered in the current tree
	boolean conserveEltsSub(IBinTree Borig, int elt);
	// returns linked list of the elements of the tree
	LinkedList<Integer> getEltList();
	
}

class MtBT implements IBinTree {
	MtBT(){}

	// returns false since empty tree has no elements
	public boolean hasElt(int e) {
		return false;
	}

	// returns 0 since enpty tree has no elements
	public int size() {
		return 0;
	}

	// returns 0 since empty tree has no branches
	public int height() {
		return 0;
	}
	/////////////////////////////////////////////////////////////////////////////////
	
	// returns empty linked list because there are no elements
	public LinkedList<Integer> getEltList(){
		return (new LinkedList<Integer>());
	}
	
	// determines if the elements are conserved from the input
	public boolean conserveEltsAdd(IBinTree Borig, int elt){
		
		LinkedList<Integer> modList = Borig.getEltList();
		modList.add(elt);
		
		return modList.equals(this.getEltList());
	}
	
	// determines if the elements are conserved from the input
	public boolean conserveEltsSub(IBinTree Borig, int elt){
		
		LinkedList<Integer> modList = Borig.getEltList();
		modList.removeFirstOccurrence(elt);
		
		return modList.equals(this.getEltList());
	}
}

class DataBT implements IBinTree{
	int data;
	IBinTree left;
	IBinTree right;

	DataBT(int data, IBinTree left, IBinTree right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	// determines whether this node or node in subtree has given element
	public boolean hasElt(int e) {
		return this.data == e || this.left.hasElt(e) || this.right.hasElt(e) ;
	}

	// adds 1 to the number of nodes in the left and right subtrees
	public int size() {
		return 1 + this.left.size() + this.right.size();
	}

	// adds 1 to the height of the taller subtree
	public int height() {
		return 1 + Math.max(this.left.height(), this.right.height());
	}
	////////////////////////////////////////////////////////////////////////////////////////////
	
	// returns a linked list of elements of the tree
	public LinkedList<Integer> getEltList(){
		LinkedList<Integer> prevEltList = (this.right.getEltList());
		prevEltList.addAll(this.left.getEltList());
		prevEltList.add(data);
		return prevEltList;
	}
	
	// determines if the elements are conserved from the input
	public boolean conserveEltsAdd(IBinTree Borig, int elt){
		
		LinkedList<Integer> modList = Borig.getEltList();
		modList.add(elt);
		modList.sort(null);
		
		LinkedList<Integer> addList = this.getEltList();
		addList.sort(null);
		
		return modList.equals(addList);
	}
	
	// determines if the elements are conserved from the input
	public boolean conserveEltsSub(IBinTree Borig, int elt){
		
		LinkedList<Integer> modList = Borig.getEltList();
		modList.removeFirstOccurrence(elt);
		modList.sort(null);
		
		LinkedList<Integer> subList = this.getEltList();
		subList.sort(null);
		
		return modList.equals(subList);
	}
}