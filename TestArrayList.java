import 	java.util.*;

class Student{
	 String name;
	 int rollNo;
	static String college;

	Student(int rollNo,String name){
	this.rollNo=rollNo;
	this.name=name;
	
	}

	static{
	college="Techno India";
	}

}

class TestArrayList{

	public static void main(String a[]){
	ArrayList<Student> al=new ArrayList<Student>();
	Student s1=new Student(101,"virat");
	Student s2=new Student(81,"sachin");	
	Student s3=new Student(21,"ABD");	
 	Student s4=new Student(51,"karthik");	
	Student s5=new Student(71,"piku");	

	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	al.add(s5);
	a1.remove(3);
	Iterator itr=al.iterator();
	while(itr.hasNext()){
		Student s=(Student)itr.next();
		System.out.println(" "+ s.rollNo+" "+s.name+" "+s.college);
	}
	
	for(Student s:al){
		System.out.println("Using Loop: "+" "+s.rollNo+" "+s.name+" "+s.college);
	}

	
	}

}