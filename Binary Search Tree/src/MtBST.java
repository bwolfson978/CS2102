
public class MtBST implements IBST{
	MtBST() {}
	  
	  // returns the number of distinct elements in the set
	  public int size () { return 0; }
	  
	  // returns set containing all existing elements and the given element
	  public IBST addElt (int elt) {
	    return new DataBST(elt, new MtBST(), new MtBST());
	  }

	  // returns set containing all existing elements except the given element
	  public IBST remElt (int elt) { return this; }

	  // determines whether the given element is in the set
	  public boolean hasElt (int elt) { return false; }

	  // largestElt not well-defined on empty BSTs, so raises an error
	  public int largestElt () {
	    throw new RuntimeException("shouldn't call largestElt on MtBST") ;
	  }
	  
	  // returns the other sibling to remove parent of an empty sibling
	  public IBST remParent(IBST rightsibling) {
	    return rightsibling;
	  }
	  
	  // "this" is the right sibling; leftsibling is a DataBST
	  public IBST mergeToRemoveParent(IBST leftsibling) {
	    return leftsibling;
}
}
