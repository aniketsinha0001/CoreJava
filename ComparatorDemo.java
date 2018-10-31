import java.util.*;
import java.io.*;
class Employee implements Comparable<Employee>{
	int id;
	String name;
	int age;


	Employee(int id,String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Employee emp){
		if(age==emp.age){
			return 0;
		}
		else if(age>emp.age){
			return 1;
		}
		else{
			return -1;
		}
		
	}	
}
class ComparatorDemo{
	public static void main(String args[]){
	Employee e1=new Employee(101,"Aniket",27);
	Employee e2=new Employee(2433,"hello",34);
	Employee e3=new Employee(11,"Amit",17);
	Employee e4=new Employee(233,"devender",44);
	
	ArrayList<Employee> al=new ArrayList<Employee>();
	al.add(e1);
	al.add(e2);
	al.add(e3);
	al.add(e4);
	Collections.sort(al);  
	Iterator itr=al.iterator();
	while(itr.hasNext()){
			
		Employee e=(Employee)itr.next();
		System.out.println(e.id+" "+e.name+" "+e.age);
	}
	}
}