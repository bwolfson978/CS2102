
public interface IBST extends ISet {
	//NOTE: uncomment next line to compile without the casts in addElt
	  //IBST addElt (int elt); 
	  
	  // produces the largest element in the BST
	  int largestElt();
	  IBST remParent(IBST sibling);
	  IBST mergeToRemoveParent(IBST sibling);

}
