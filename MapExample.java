import java.util.*;

class Employee{
	int empId;
	String empName;
	String empSalary;
	
	Employee(int empId, String empName,String empSalary){
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;	
	
	}
}

class MapExample{

	public static void main(String args[]){
		Map<Integer, Employee> hm=new HashMap<Integer,Employee>();
		Employee e1=new Employee(10193,"rohit","888k");
		Employee e2=new Employee(44,"Amit","223lk");
		Employee e3=new Employee(5344,"Ayush","423lk");
		Employee e4=new Employee(64,"mohan","523k");
		Employee e5=new Employee(8344,"ram","677lk");

		hm.put(1,e1);
		hm.put(4,e2);
		hm.put(3,e3);
		hm.put(9,e4);
		hm.put(6,e5);
		
		for(Map.Entry<Integer,Employee> m:hm.entrySet()){
			int key=m.getKey();
			Employee emp=m.getValue();
			System.out.println(key+" "+emp.empId+" "+emp.empName+" "+emp.empSalary);
	
		}
		
		System.out.println("After Removing Eelements from MAP");
		hm.remove(3);
		Set set=hm.entrySet();
		Iterator itr=set.iterator();

		while(itr.hasNext()){
			Map.Entry emp=(Map.Entry)itr.next();
			int key=(Integer)emp.getKey();
			Employee e=(Employee)emp.getValue();
			//System.out.println();
			System.out.println(key+" "+e.empId+" "+e.empName+" "+e.empSalary);
		}	
		
	}

}