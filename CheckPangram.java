package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckPangram {

	public static  void checkAlphabet(String s){
		s=s.replace(" ", "").toUpperCase();
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
		
		HashMap<Character, Integer> hm=new HashMap<Character,Integer>();
		for(char c:ch){
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
			}
			else{
				hm.put(c, 1);
			}
		}int count=0;
		for(Map.Entry<Character, Integer> m:hm.entrySet()){
			System.out.println(m.getKey()+" "+"----"+m.getValue());
			count++;
		}
		if(count==26){
			System.out.println("PANGRAM!");
		}
		else{
			System.out.println("Not Pangram!");
		}
	}			
		
	public static void main(String[] args) {

		
		checkAlphabet("The quick brown fox jumps over the lazy dog");
		checkAlphabet("Hello World");

	}

}
