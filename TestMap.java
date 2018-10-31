import java.util.*;

class TestMap{
	public static void main(String args[]){
	
		Map<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(1451,"ANiket");
		mp.put(121,"hunter");
		mp.put(111,"killer");
		mp.put(131,"dwanye");
		mp.put(101,"skoch");

		for(Map.Entry m:mp.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
	
		}
		
		System.out.println("using Iterator-------------------");
		Set set=mp.entrySet();
		Iterator itr=set.iterator();
		
		while(itr.hasNext()){
			Map.Entry hm=(Map.Entry)itr.next();
			System.out.println(hm.getKey()+" "+hm.getValue());
		}
	
	}

}

