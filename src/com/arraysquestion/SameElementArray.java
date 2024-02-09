package com.arraysquestion;

import java.util.Arrays;

public class SameElementArray {
	
	public static void main(String[] args) {
		
	int arr1[]= {3,2,5,7};
	int arr2[]= {2,3,5,7};
	if(areEqual(arr1,arr2)) {
		System.out.println("Two arrays are equals");
	}
	else {
		System.out.println("Two arrays are not equals");
	}
	}
	public static boolean areEqual(int[] arr1,int[] arr2)
			{
		int n=arr1.length;
		int m=arr2.length;
		
		if(n!=m) {
			return false;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0;i<n;i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
			}
	}


