package com.stringquestion;

public class RemoveCharacter {
	
	public static void main(String[] args) {
		String str="CloudTech";
		
		char ch='C';
		removeChar(str, ch);
		
	}
	
	public static void removeChar(String str,char c) {
		int n =str.length();
		
		String finalStar="";
		
		for(int i=0;i<n;i++) {
			if(str.charAt(i)!=c) {
				finalStar=finalStar+str.charAt(i);

			}
		}
		System.out.println(finalStar);
	}

}
