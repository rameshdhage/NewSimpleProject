package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StartingWithOne {

	public static void main(String[] args) {
		
	List<Integer>list=Arrays.asList(11,18,20,24,85,66,13);
		
List<String>reString=list.stream().map(e->e+"").filter(e->e.startsWith("1")).collect(Collectors.toList());

	System.out.println(reString);
	
	
	//male and female
	
	ArrayList<Employee>emp=new ArrayList<Employee>();
	emp.add(new Employee(1,"A",60,"M",12000));
	emp.add(new Employee(2,"B",22,"M",22000));
	emp.add(new Employee(3,"C",32,"F",32000));
	emp.add(new Employee(4,"D",45,"F",52000));
	
	Map<String,Long>collect=emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
	
	System.out.println(collect);
	
	List<Employee> resList=emp.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
	
	   System.out.println(resList);
	  resList.forEach(ele->System.out.println("Age="+ele.getAge()+"Name="+ele.getName()));
	   
	}

}
