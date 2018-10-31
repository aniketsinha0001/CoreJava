import java.util.*;

class ArrayListExample{

	public static void main(String args[]){
	ArrayList<String> al=new ArrayList<String>();			
	al.add("Hi");
	al.add("Hello");
	al.add("world");
	al.add("demo");

	Iterator itr=al.iterator();
	while(itr.hasNext()){
		
		System.out.print(" "+itr.next());
	}
	for(String str:al){

	System.out.print("  	 "+str);
	
	}

	}
}