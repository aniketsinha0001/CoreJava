class Emp{
	int empId;
	String name;
	int salary;
	
	Emp(int empId, int salary,String name)
	{
		this.empId=empId;
		this.salary=salary;
		this.name=name;
	}
}
class TestLinkedList{

	public static void main(String args[]){
		Emp e1=new Emp(11,700000,"rahul");
		Emp e2=new Emp(10,1700000,"Aniket");
		Emp e3=new Emp(98,4300000,"hello");
		Emp e4=new Emp(76,7030000,"world");
		Emp e5=new Emp(34,7030000,"demos");

		LinkedList<Emp> linkedlist=new LinkedList<>();
		linkedlist.add(e1);
		linkedlist.add(e2);
		linkedlist.add(e3);
		linkedlist.add(e4);
		linkedlist.add(e5);

		Iterator itr=linkedlist.iterator();
		while(itr.hasNext())
		{
			Emp e=(Emp) itr.next();
			System.out.print(e.empId+" "+e.name+" "+e.salary);
		}
	}
}