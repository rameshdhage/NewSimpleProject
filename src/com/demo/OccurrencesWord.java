package com.demo;

import java.util.Arrays;
import java.util.List;

public class OccurrencesWord {
	
	public static void main(String[] args) {
		
		
		List<String> words=Arrays.asList("Apple","Banana","Apple","Mango","Apple","Banana","Apple");
		
		long count=words.stream().filter(word->word.equals("Apple")).count();
		
		System.out.println("Occurrences of the Apple are="+count);
		
	}

}
