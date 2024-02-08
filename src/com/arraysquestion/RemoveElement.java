package com.arraysquestion;

import java.util.Arrays;

//Delete an element form an array
public class RemoveElement {
	
	public static void main(String[] args) {
		
	int [] originalArray= {1,2,3,4,5};
	
	int elementToRemove=3;
	int []newArray=remove(originalArray,elementToRemove);
	System.out.println("Original Array="+Arrays.toString(originalArray));
	System.out.println("News Array="+Arrays.toString(newArray));
	}
	
	public static int[]remove(int []array,int element){
		int[] newarray=new int [array.length-1];
		int index=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]!=element) {
				newarray[index]=array[i];
				index++;
			}
		}
		return newarray;
	}
	

}
