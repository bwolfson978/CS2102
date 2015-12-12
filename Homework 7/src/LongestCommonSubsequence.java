/**
 * LongestCommonSubsequence is a class designed for 
 * computing the longest common subsequence of two strings.
 * It includes a method called lcsmem for doing this
 * computation using a memoization table, in this case a 
 * HashMap which is more efficent for longer strings.
 * @author Barrett Wolfson, Erik Sola
 */
import java.util.HashMap;
import java.util.LinkedList;
 
public class LongestCommonSubsequence{
      
      private String string1;
      private String string2;
      private HashMap<LCSKey,String>memtab;
      
      /**
       * Constructs a LongestCommonSubsequence object
       * @param s1 the first string
       * @param s2 the second string
       */
      public LongestCommonSubsequence(String s1, String s2){
            string1 = s1;
            string2 = s2;
            memtab = new HashMap<LCSKey,String>();
      }
      
      /**
       * Delegates to the lcsmemHelper method starting the computation at the
       * start of each string s1 and s2
       * @return the longest common subsequence between s1 and s2
       */
      public String lcsmem(){
            return this.lcsmemHelper(0,0);
      }
      
      /**
       * Helper method for lcsmem
       * @param index1 index of the position currently being looked at in the first string
       * @param index2 index of the position currently being looked at in the second string
       * @return the longest common subsequence between s1 and s2
       */
      public String lcsmemHelper(int index1, int index2){
            LCSKey key = new LCSKey(index1, index2);
            if(memtab.containsKey(key)){
                  return memtab.get(key);
            }
            String lcs = "";
            //base case- if either of the strings are empty, 
            //the only lcs they have is the empty string ""
            if(index1 == string1.length() || index2 == string2.length()){
                  memtab.put(key, lcs);
                  return lcs;
            }
            
            //if the two strings start with the same letter, it is
            //inside their lcs
            else if(this.string1.charAt(index1)==this.string2.charAt(index2)){
                  lcs += this.string1.charAt(index1);
                  lcs += lcsmemHelper(index1 + 1, index2 + 1);
                  memtab.put(key, lcs);
                  return lcs;
            }
            
            //otherwise the two current letters are not the same.
            //return whichever next subsequence is longer
            else{
                  String option1 = lcsmemHelper(index1 + 1, index2);
                  String option2 = lcsmemHelper(index1, index2 + 1);
                  if(option1.length() >= option2.length()){
                        memtab.put(key,option1);
                        return option1;
                  }
                  else{
                        memtab.put(key, option2);
                        return option2;
                  }
            }
      }     
}
