package hwk4;

import java.util.LinkedList;

public class Planning {
	
	Planning(){}
	
	/* Inputs for Testing
	 *  List 1 : [1,2,3]
	 *  List 2 : [1,2,-999,3]
	 *  List 3 : [1,-1,2,-999]
	 *  List 4 : [-1,-999]
	 *  */
	
	double rainfall(LinkedList<Double> dailyRainFalls){
		
		int count = 0;
		double sum = 0;
		for (Double report:dailyRainFalls){
			if(report > 0 ){
				sum += report;
				count ++;
			} else if (report == -999){
				break;
			}
		}
		if (count == 0){
			return -1;
		} else {
			return sum/count;
		}
	}
	
	/* Inputs for Testing
	 *  List 1 : ["a","a","a"]
	 *  List 2 : ["aa","d","a","cccc"]
	 *  List 3 : ["a", "", "a"]
	 *  List 4 : ["a","b","c","d","e"]
	 *  */
	
	int maxTripleLength(LinkedList<String> strList){
		
		int strListLength = strList.size();
		int count = 0;
		int maxLength = 0;
		
		for(String str:strList){
			if((strListLength-count) < 3){
				break;
			} else {
				int curLength = str.concat(strList.get(count+1)).concat(strList.get(count+2)).length();
				if (curLength > maxLength){
					maxLength = curLength;
				}
				count ++;
			}
		}
		return maxLength;
	}
}
