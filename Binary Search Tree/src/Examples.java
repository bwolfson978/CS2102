import tester.*;
public class Examples {
	Examples(){}
	  
	  ISet b1 = new DataBST (5, new MtBST(), new MtBST());
	  ISet b2 = b1.addElt(3).addElt(4).addElt(8).addElt(7);
	  ISet b2no4 = b1.addElt(3).addElt(8).addElt(7);
	  ISet b2no8 = b1.addElt(3).addElt(4).addElt(7);
	  ISet b2rem5 = new DataBST(4, new MtBST(), new MtBST()).addElt(3).addElt(8).addElt(7);

	  // does size work as expected?
	  boolean test1 (Tester t) {
	    return t.checkExpect(b2.size(), 5);
	  }
	  
	  // do size and addElt interact properly on a new element?
	  boolean test2 (Tester t) {
	    return t.checkExpect(b1.addElt(7).size(), 2);
	  }
	    
	  // do size and addElt interact properly on a duplicate element?
	  boolean test3 (Tester t) {
	    return t.checkExpect(b1.addElt(5).size(), 1);
	  }
	  
	  // check removal in left subtree
	  boolean test4 (Tester t) {
	    return t.checkExpect(b2.remElt(4), b2no4);
	  }
	  
	  // check removal in right subtree
	  boolean test5 (Tester t) {
	    return t.checkExpect(b2.remElt(8), b2no8);
	  }

	  // check removal of root
	  boolean test6 (Tester t) {
	    return t.checkExpect(b2.remElt(5), b2rem5);
	  }

}
