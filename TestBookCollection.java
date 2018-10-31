import java.util.*;

class Book
{
	String author;
	int price;
	String bookName;

	Book(int price,String bookName, String author)
	{
	this.price=price;
	this.bookName=bookName;
	this.author=author;	
	
	}
}

class Employee
{
	String empName;
	int id;
	String salary;	
	
	Employee(int id,String empName,String salary)
	{
	this.id=id;
	this.empName=empName;
	this.salary=salary;
	}
}

class TestBookCollection
{


	public static void main(String a[])
	{

	ArrayList<Book> al=new ArrayList<Book>();
	
	Book b1=new Book(200,"Physics","HC Verma");	
	Book b2=new Book(230,"Physics","DC pandey");		
	Book b3=new Book(200,"Physics","Irodov");
	Book b4=new Book(300,"java","Balagurswami");	
	Book b5=new Book(500,"C","Yaswant Kanitkar");	

	al.add(b1);
	al.add(b2);
	al.add(b3);
	al.add(b4);
	al.add(b5);

	LinkedList<Employee> emp=new LinkedList<Employee>();
	Employee e1=new Employee(001,"benga","50k");
	Employee e2=new Employee(021,"DJ","30k");
	Employee e3=new Employee(201,"manish","60k");
	Employee e4=new Employee(401,"sujit","80k");

	emp.add(e1);
	emp.add(e2);
	emp.add(e3);
	emp.add(e4);
	Iterator ltr=emp.iterator();
	System.out.println("Info about the Employeee");

	while(ltr.hasNext())
	{
		
		Employee e=(Employee)ltr.next();
		System.out.print(e.id+" "+e.empName+" "+e.salary);

	}

	System.out.println("Using Loop!");
	for(Employee e:emp){
		System.out.println(e.id+" "+e.empName+" "+e.salary);
	
	}

	for(Book b:al)
	{
		System.out.print(b.price+" "+b.author+" "+b.bookName);
	}
	
	System.out.println("using while Loop--------------------------------");

	Iterator itr=al.iterator();

	while(itr.hasNext())
	{
		Book b=(Book)itr.next();
		System.out.print(b.author+" "+b.bookName+" "+b.price);
	}	
	}
	
}




