package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartingWithOne {

	public static void main(String[] args) {
		
	List<Integer>list=Arrays.asList(11,18,20,24,85,66,13);
		
List<String>reString=list.stream().map(e->e+"").filter(e->e.startsWith("1")).collect(Collectors.toList());

	System.out.println(reString);
	
	}

}
