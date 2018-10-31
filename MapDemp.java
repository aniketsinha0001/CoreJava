import java.util.*;

class Student{
	int rollNo;
	String name;
	String college;


	Student(int rollNo,String name){
		this.rollNo=rollNo;
		this.name=name;
	}
}

class MapDemp{

	public static void main(String args[]){
		Student s1=new Student(101,"Aniket");
		Student s2=new Student(41,"onik");
		Student s3=new Student(75,"ram");
		Student s4=new Student(51,"shyam");
		Student s5=new Student(501,"Amit");

	Map<Integer,Student> mp=new HashMap<Integer,Student>();
		mp.put(1,s1);
		mp.put(3,s2);
		mp.put(2,s3);
		mp.put(5,s4);
		mp.put(4,s5);	
	for(Map.Entry<Integer,Student> m:mp.entrySet()){
		int key=m.getKey();
		Student s=(Student)m.getValue();
		System.out.println(key+" "+s.rollNo+" "+s.name+" "+s.college);
		}
		mp.remove(4);
		mp.remove(3);
	Set set=mp.entrySet();
	Iterator itr=set.iterator();
	while(itr.hasNext()){
		Map.Entry m=(Map.Entry)itr.next();
		int id=(Integer)m.getKey();
		Student s=(Student)m.getValue();
		System.out.println(id+" "+s.name+" "+s.rollNo+" "+s.college);
	
	}

	}
}