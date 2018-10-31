import java.util.*;

class HashMaptest{

	public static void main(String args[]){
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(1,"virat");
	hm.put(2,"Dhoni");
	hm.put(4,"sachin");
	hm.put(9,"sehawag");
	
	for(Map.Entry m:hm.entrySet()){
	
	System.out.println(m.getKey()+" "+m.getValue());	
	}

	hm.remove(4);

	Set set=hm.entrySet();
	Iterator itr=set.iterator();
	System.out.println("After remove operation is performed..");
	while(itr.hasNext()){
		Map.Entry m=(Map.Entry)itr.next();
		System.out.println(m.getKey()+" "+m.getValue());
	}
	}

}