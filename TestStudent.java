package com.solution;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	private String sName;
	private int rollNo;
	static String college;
	
	Student(String sName,int rollNo){
		this.sName=sName;
		this.rollNo=rollNo;
	}
}



public class TestStudent {

	public static void main(String[] args) {
		
		Student s1=new Student("Aman", 101);
		Student s2=new Student("vivek", 331);
		Student s3=new Student("Keniya", 301);
		Student s4=new Student("Subhm", 561);
		
		ArrayList<Student> l=new ArrayList<>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		Iterator<Student> itr=l.iterator();
		while(itr.hasNext()){
			Student s=itr.next();
			System.out.println();
		}
		for(Student s:l){
			System.out.println(s);
		}
	}

}
