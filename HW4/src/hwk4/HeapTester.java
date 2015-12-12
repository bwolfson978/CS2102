package hwk4;

public class HeapTester {
	
	// tester method for addElt method on IHeap
	boolean addEltTester(IHeap Horig, int elt, IHeap Hadded){
		return (Horig.isHeap() && Hadded.isHeap() &&
				Hadded.conserveEltsAdd(Horig, elt));
	}
	
	// tester method for remMinElt method on IHeap
	boolean remMinEltTester(IHeap Horig, int elt, IHeap Hsubtracted){
		return (Horig.isHeap() && Hsubtracted.isHeap() &&
				Hsubtracted.conserveEltsSub(Horig, elt));
	}
}
