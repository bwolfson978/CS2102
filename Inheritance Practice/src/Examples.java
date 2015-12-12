
import tester.*;

public class Examples {
	Fish nemo = new Fish(4,2.0);
	Shark bruce = new Shark(5,6);
//checking fish size	
 boolean test1(Tester t){
	 return t.checkExpect(nemo.isNormalSize(),true);
 }
 
 //checking shark size
 //checking to see which method is called(I know
 //it is the most derived)
 boolean test2(Tester t){
	 return t.checkExpect(bruce.isNormalSize(),false);
 }
 
}
