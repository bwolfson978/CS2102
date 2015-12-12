package hwk4;
//Zachary Armsby



import tester.*;

public class Examples {
	
	HeapTester heapOpTester = new HeapTester();
	
	IHeap H0 = new MtHeap();
	IHeap H1 = new MtHeap();
	
	IHeap H9 = new DataHeap(9,H1,H0);
	IHeap H8 = new DataHeap(8,H1,H0);
	IHeap H7 = new DataHeap(7,H1,H0);
	IHeap H6 = new DataHeap(6,H1,H0);
	IHeap H5 = new DataHeap(5,H1,H0);
	IHeap H4 = new DataHeap(4,H1,H0);
	IHeap H3 = new DataHeap(3,H1,H0);
	IHeap H2 = new DataHeap(2,H1,H0);
	
	///////////////////////////////////////////
	
	IHeap H10 = new DataHeap(3,H7,H8);
	IHeap H11 = new DataHeap(4,H9,H5);
	
	IHeap H12 = new DataHeap(1,H10,H11);
	
	////////////////////
	IHeap H30 = new DataHeap(30,H1,H0);
	IHeap H7add = new DataHeap(7,H30,H0);
	IHeap H7adddup = new DataHeap(7,H8,H0);
	
	IHeap H10add = new DataHeap(3,H7add,H8);
	IHeap H10adddup = new DataHeap(3,H7adddup,H8);
	
	IHeap H12add = new DataHeap(1,H10add,H11);
	IHeap H12addswap = new DataHeap(1,H11,H10add);
	IHeap H12adddup = new DataHeap(1,H10adddup,H11);
	
	/////////////////////
	IHeap H10sub = new DataHeap(3,H7,H8);
	
	IHeap H12sub = new DataHeap(1,H10sub,H11);
	IHeap H12subswap = new DataHeap(1,H11,H10sub);
	
	/////////////////////
	
	IHeap H14 = new DataHeap(1,H7,H8);
	IHeap H15 = new DataHeap(1,H14,H11);
	
	
	//////////////////////////// Test addEltTester /////////////////////////////////////////////////////////////
	
	// test add element to that belongs on the end of the tree
	boolean testAdd1(Tester t){
		return t.checkExpect(heapOpTester.addEltTester(H12, 30, H12.addElt(30)), true);
	}
	
	// test identical heap but different order, to show the implementation does not matter
	boolean testAdd2(Tester t){
		return t.checkExpect(heapOpTester.addEltTester(H12, 30, H12addswap), true);
	}
	
	// test adding a duplicate element
	boolean testAdd3(Tester t){
		return t.checkExpect(heapOpTester.addEltTester(H12, 8, H12.addElt(8)), true);
	}
	
	// testing adding to an empty heap
	boolean testAdd4(Tester t){
		return t.checkExpect(heapOpTester.addEltTester(H0, 8, H0.addElt(8)), true);
	}
	
	// test adding a value that does not belong on the bottom of the heap
	boolean testAdd5(Tester t){
		return t.checkExpect(heapOpTester.addEltTester(H12, 2, H12.addElt(2)), true);
	}
	
	// testing a bad case to make sure it can detect errors
	boolean testAdd6(Tester t){
		return t.checkExpect(heapOpTester.addEltTester(H12, 8, H12addswap), false);
	}
	
	
	//////////////////////////// Test remMinEltTester //////////////////////////////////////////////////////////
	
	// test subtracting an element
	boolean testSub1(Tester t){
		return t.checkExpect(heapOpTester.remMinEltTester(H12, 1, H12.remMinElt()), true);
	}
	
	// test identical heap but different order, to show different implementations work
	boolean testSub2(Tester t){
		return t.checkExpect(heapOpTester.remMinEltTester(H12, 1, H12subswap.remMinElt()), true);
	}
	
	// test removing one of a duplicate pair of elements
	boolean testSub3(Tester t){
		return t.checkExpect(heapOpTester.remMinEltTester(H15, 1, H15.remMinElt()), true);
	}
	
	// test removing from an empty heap
	boolean testSub4(Tester t){
		return t.checkExpect(heapOpTester.remMinEltTester(H1, 1, H1.remMinElt()), true);
	}
	
	// test removing the last element in a heap
	boolean testSub5(Tester t){
		return t.checkExpect(heapOpTester.remMinEltTester(H7, 7, H7.remMinElt()), true);
	}
	
	// test to make sure it can detect errors
	boolean testSub6(Tester t){
		return t.checkExpect(heapOpTester.remMinEltTester(H12, 1, H12), false);
	}
}
