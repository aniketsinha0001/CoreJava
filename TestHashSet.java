import java.util.*;

class Employee{
	int empId;
	String name;
	String salary;

	Employee(int empId,String name,String salary){
	this.empId=empId;
	this.name=name;
	this.salary=salary;
	}
}
class TestHashSet{
	public static void main(String args[]){

		Employee e1=new Employee(111,"Elon Musk","190k");
		Employee e2=new Employee(39,"Mark Zukerberg","390k");
		Employee e3=new Employee(3,"sunder Puichai","490k");
		Employee e4=new Employee(4,"Staya Nadella","240k");
		Employee e5=new Employee(5,"ANiket","10k");
		
		HashSet<Employee> h=new HashSet<Employee>();	
		h.add(e1);
		h.add(e2);
		h.add(e3);
		h.add(e4);
		h.add(e5);
		
		Iterator itr=h.iterator();
		
		while(itr.hasNext()){
			Employee e=(Employee)itr.next();
			System.out.println(e.empId+" "+e.name+" "+e.salary);
		}
	}
}