/**
 * FindLongestSubstring.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Dec 11, 2017
 * 
 *  find the longest substring without repeating characters in a given string. For example, 
 *  if “javaconceptoftheday” is the input string, then the longest substring without repeating or 
 *  duplicate characters is “oftheday” and its length is 8.
 */
package stringManipulation;

import java.util.LinkedHashMap;

public class FindLongestSubstring {

	public static void main(String[] args) {
		
		//String input="javaconceptoftheday";
		//String input="thelongestsubstring";
		String input="abcdefabcdef11";
		
		char[] charArray=input.toCharArray();
		
		String longestSubstring=null;
		int longestSubstringLength=0;
		
		//Save using Linked HashMap
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		
		//Iterate thru charArray
		for(int i=0;i<charArray.length;i++){
			
			char ch=charArray[i];
			
			if(!map.containsKey(ch)){
				
				//if map does not have the key update it
				map.put(ch, i);
			}else{
				
				//if map has the key, then clear the map and position cursor i of loop to it.
				i=map.get(ch); //reset i to earlier key position
				map.clear();   //clear map to start again
				
			}
			
			//update attributes for output
			if(map.size() > longestSubstringLength){
				longestSubstring=map.keySet().toString(); //save key to output
				longestSubstringLength=map.size();        //update length of output
			}
			
		}
		
		
		System.out.println("Input String :"+input);
		System.out.println("Output Longest String :"+longestSubstring);
		System.out.println("Output String Length  :"+longestSubstringLength);
		
	}

}

