
public interface ISet {
	// PROPERTY: No duplicate elements
		  // PROPERTY: Elements are unordered
		  // returns set containing all existing elements and the given element
		  ISet addElt (int elt);
		  // returns set containing all existing elements except the given element
		  ISet remElt (int elt);
		  // returns the number of distinct elements in the set
		  int size ();
		  // determines whether given element is in the set
		  boolean hasElt (int elt);
}
