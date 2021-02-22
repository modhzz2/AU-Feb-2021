import java.util.*;  
class two{  
    public static void main(String args[]){  
      
    LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
      
    hm.put(1,"Parth");  
    hm.put(2,"Nirmal");  
    hm.put(3,"Nisarg");  
      
    Set <Integer> keyset = hm.keySet(); 
  
    List<Integer> lK = new ArrayList<Integer>(keyset); 
  
    ListIterator<Integer> iterator = lK.listIterator(lK.size()); 
  
		while (iterator.hasPrevious()) { 
			Integer key = iterator.previous();
			System.out.print(key);
			System.out.print(" " + hm.get(key)); 
			System.out.println();
        } 
    } 
}
