/**
 * duplicateWords.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Dec 8, 2017
 * WAP to find the duplicate words and their occurrences in a String.
 */
package stringManipulation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicateWords {

	
	//Method to find duplicate words
	public static void findDuplicate(String input){
		
		//Split
		String[] words=input.split(" ");
		System.out.println("total words :" +words.length);
		
		//Use hashMap to save words and their count
		HashMap<String,Integer> wordCount= new HashMap<String, Integer>();
		
		//Check words via for each loop
		for(String word : words){
			
			
			if(wordCount.containsKey(word)){
				//if found update count
				wordCount.put(word.toLowerCase(),wordCount.get(word.toLowerCase())+1 );
				
			}else{
				//insert the new word 
				wordCount.put(word.toLowerCase(), 1);
				
			}
			
 
		}
		//print the output
		System.out.println("First way using for Each and Keyset()..");
		for(String key:wordCount.keySet()){
			System.out.println("Word :"+ key+ "  Count:"+wordCount.get(key));
		}
		
		//Print output 2nd Way
		System.out.println("Second way using for Each, SET and entryset()..");
		Set<Map.Entry<String, Integer>> entryset=wordCount.entrySet();
		for(Entry entry : entryset){
			System.out.println("Word :"+ entry.getKey()+ "  Count:"+entry.getValue());
		}
		
		//print the output 3rd
		System.out.println("Third way using SET, Keyset and Iterator..");
		Set<String> keyset=wordCount.keySet();
		Iterator<String> itr=keyset.iterator();
		while(itr.hasNext()){
			String key=itr.next();
		System.out.println("Word :"+ key+ "  Count:"+wordCount.get(key));
		}
		
		//Print using 4th Way
		System.out.println("Fourth way using Set , EntrySet and Iterator..");
		Set<Map.Entry<String, Integer>> entrySet2=wordCount.entrySet();
		Iterator<Entry<String,Integer>> itr2=entrySet2.iterator();
		while(itr2.hasNext()){
			Entry entry=itr2.next();
			System.out.println("Word :"+entry.getKey()+" Count: "+entry.getValue());
		}
		
	}
	
	public static void main(String[] args) {
		
		findDuplicate("aa ad aa age ad age aa aab");
	}

}

