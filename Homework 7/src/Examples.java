import tester.Tester;
public class Examples {

	LongestCommonSubsequence donkeyOver = 
			new LongestCommonSubsequence("donkey","over");
	
	LongestCommonSubsequence lengthy = 
			new LongestCommonSubsequence("heymynameisbarry","whatsgoingon");
	
	LongestCommonSubsequence RealLengthy = 
			new LongestCommonSubsequence("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
					"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaad");
	LongestCommonSubsequence empty1 = 
			new LongestCommonSubsequence("", "empty");
	LongestCommonSubsequence empty2 = 
			new LongestCommonSubsequence("", "");
	LongestCommonSubsequence complex = 
			new LongestCommonSubsequence("adadadadadadzadadada", "adadadadadadadadada");
	
	LongestCommonSubsequence dom = new LongestCommonSubsequence ("mandatedas", "manifest");
	
	boolean testLCS(Tester t){
		return t.checkExpect(donkeyOver.lcsmem(),"oe");
				//t.checkExpect(lengthy.lcsmem(),"has")&&
				//t.checkExpect(empty1.lcsmem(), "")&&
				//t.checkExpect(empty2.lcsmem(), )&&
				//t.checkExpect(complex.lcsmem(),"ada")&&
				//t.checkExpect(dom.lcsmem(), "ma");

	}
	
	//boolean testLongLCS(Tester t){
		//return t.checkExpect(RealLengthy.lcsmem(),"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	//}
}
