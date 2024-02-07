package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberStream {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(15);
		l.add(25);
		
		System.out.println(l);
		
		//without using stream concept
		/*List<Integer> l1=new ArrayList<Integer>();
		for(Integer i:l) {
			if(i%2==0) {
				l1.add(i);
			}
			}
		System.out.println(l1);*/
		
		//with using atream concept
		
		List<Integer> ar=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(ar);
		
		}
	
	

}
