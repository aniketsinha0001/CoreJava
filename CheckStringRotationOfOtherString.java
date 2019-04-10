package com;

public class CheckStringRotationOfOtherString {
	public static void checkString(String s1,String s2){
		if(s1.length()==s2.length()){
			String s3=s1+s1;
			if(s3.contains(s2)){
				System.out.println("Both String is rotation of Each others!");
			}
		}
	}
	
	public static void main(String[] args) {
		checkString("JavaJ2EESpringHibernate","SpringHibernateJavaJ2EE");
	}

}
