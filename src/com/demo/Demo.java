package com.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Demo {
	
	public static void main(String[] args) {
		
		
		Map<Integer,String> corses=new HashMap<Integer,String>();
		
		corses.put(1,"c");
		corses.put(2,"c++");
		corses.put(3,"java");
		corses.put(4,"Angulat");
		corses.put(5,"ReactJS");

		
		System.out.println("Using iterator with entryset");
		
	Iterator <Entry<Integer,String>	> iterator=corses.entrySet().iterator();
	        
	while(iterator.hasNext()) {
	Entry <Integer,String>	entry=iterator.next();
	
	System.out.println(entry.getKey());
	System.out.println(entry.getValue());
	
	
	}
	System.out.println();
	
	System.out.println("iterator using by keySet");
	
	       Iterator<Integer>    itr=corses.keySet().iterator();
	       
	       while(itr.hasNext()) {
	    	   Integer key=itr.next();
	    	   
	    	   System.out.println(key);
	    	   System.out.println(corses.get(key));
	       } 
	    	   
	    System.out.println();
	    System.out.println("Using lambda expretion");
	    
	         corses.forEach((key,value)->{
	        	 System.out.println(key);
	        	 System.out.println(value);
	        	 

	        	 });
	    	   
	    	   
	    	 
	    		  
	    		  
	    	
	       
	
		
	}
	
	
	
	

}
