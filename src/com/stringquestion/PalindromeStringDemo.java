package com.stringquestion;

import java.util.Scanner;

public class PalindromeStringDemo {
	
	
	public static void main(String[] args) {
		String reverse="";
		System.out.println("Enter a any string value>>>>>>>>");
		Scanner sc=new Scanner(System.in);
		
		String original=sc.nextLine();
		
		for(int i=original.length()-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
			
		}
		if(original.equals(reverse)) {
			System.out.println("Given string is palindrom");
			
		}else {
			System.out.println("Given string is not palindrom");
		}
		
		
	}

}
