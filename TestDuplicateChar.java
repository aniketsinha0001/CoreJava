package com;

import java.util.HashMap;
import java.util.Map;

public class TestDuplicateChar {

	private static void testCharacter(String s) {
		HashMap<Character, Integer> hm=new HashMap<Character,Integer>();
		s=s.replace(" ","");
		char ch[]=s.toCharArray();
		for(char c:ch){
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
			}else{
				hm.put(c, 1);
			}
		}
		for(Map.Entry<Character, Integer> m:hm.entrySet()){
			
				System.out.println(m.getKey()+" "+"-----value----"+m.getValue());
		}
		
	}	
	public static void main(String[] args) {
		testCharacter("Hello world");
		testCharacter("Better Butter");

	}

}
