package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicateElementFromArrayList {

	public static void removeDuplicateElements(List al){
		
		HashSet hs=new HashSet();
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.addAll(al);
		hs.addAll(al);
		System.out.println("Removed Duplicates using HashSet: ");
		for(Object s:hs){
			System.out.print( s+" ");
		}
		System.out.println();
		System.out.println("Using LinkedHashSet insertion Order preserved!");
		for(Object s2:lhs){
			System.out.print(s2+" ");
		}
	}	
	
	public static void main(String[] args) {

		List l=new ArrayList();
		l.add("JAVA");
		l.add("C");
		l.add(9756);
		l.add("Spring");
		l.add("C");
		l.add("JAVA");
		l.add("Struts");
		l.add(9756);
		l.add(2432);

		
		removeDuplicateElements(l);
	}

}
