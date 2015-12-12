
public class DataBST implements IBST{
	 int data;
	  IBST left;
	  IBST right;
	  
	  DataBST(int data, IBST left, IBST right) {
	    this.data = data;
	    this.left = left;
	    this.right = right;
	  }
	  
	  // returns the number of distinct elements in the set
	  public int size() {
	    return 1 + this.left.size() + this.right.size();
	  }
	  
	  // returns set containing all existing elements and the given element
	  public IBST addElt (int elt) {
	    if (elt == this.data)
	      return this; // not storing duplicate values
	    else if (elt < this.data)
	      return new DataBST (this.data,
	                          (IBST) this.left.addElt(elt),
	                          this.right);
	    //trying to understant casting: Can only cast down,
	    //what could be returned is any form of ISET but in
	    //this case you want to provide greater specification
	    //down to the IBST level because we are sure that's what 
	    //going to be returned.
	    else // elt > this.data
	      return new DataBST (this.data,
	                          this.left,
	                          (IBST) this.right.addElt(elt));
	  }
	  
	  // produces the largest element in the BST
	  public int largestElt() {
	    if (this.right instanceof MtBST) 
	      return this.data;
	    else return this.right.largestElt();
	  }
	  
	  // determines whether the given element is in the set
	  public boolean hasElt (int elt) {
	    if (elt == this.data) 
	      return true; 
	    else if (elt < this.data)
	      return this.left.hasElt(elt);
	    else // elt > this.data
	      return this.right.hasElt(elt);
	  }
	  
	  // returns set containing all existing elements except the given element
	  public IBST remElt (int elt) {
	    if (elt == this.data) 
	      return this.left.remParent(this.right);
	    else if (elt < this.data)
	      return new DataBST(this.data, (IBST) this.left.remElt(elt), this.right);
	    else // (elt > this.data)
	      return new DataBST(this.data, this.left, (IBST) this.right.remElt(elt)) ;
	  }
	  
	  // returns the other sibling to remove parent of an empty sibling
	  public IBST remParent(IBST rightSibling) {
	    return rightSibling.mergeToRemoveParent(this);
	  }
	  
	  // returns DataBST resulting from removing parent when both children are DataBSTS
	  public IBST mergeToRemoveParent(IBST leftSibling) {
	    // "this" refers to the original right sibling of the parent being deleted
	    // here, could decide whether to use largest-in-left or smallest-in-right
	    //   and branch accordingly.  Only showing largest-in-left code for now
	    int newRoot = leftSibling.largestElt();
	    return new DataBST(newRoot,
	                       (IBST) leftSibling.remElt(newRoot),
	                       this); 
	  }
}