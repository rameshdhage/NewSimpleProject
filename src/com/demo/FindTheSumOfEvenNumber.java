package com.demo;

import java.util.Arrays;

//using java 1.8 feature
public class FindTheSumOfEvenNumber {
	
	public static void main(String[] args) {
		
		int [] numbers= {1,2,3,4,5,6,7,8,9,10};
		
		int sum=Arrays.stream(numbers).filter(n->n%2==0).sum();
		
		System.out.println("The sum of the even number is:"+sum);
	}

}
