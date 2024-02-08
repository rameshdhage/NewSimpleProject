package com.demo;

import java.util.Arrays;
import java.util.List;

public class Demo {
	
	public static void main(String args[]) {
		
		List<String> words=Arrays.asList("Apple","Banana","Apple","Mango","Apple");
		
		     long count=words.stream().filter(word->word.equals("Apple")).count();
		     
		     System.out.println("Total ocurance of the project are the ="+count);
		
	}
	

}
