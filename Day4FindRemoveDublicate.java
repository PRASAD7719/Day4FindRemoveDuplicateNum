package main1;

import java.util.LinkedHashSet;

public class Day4FindRemoveDublicate {
	
	public static void removeDuplicates(int[] arr) {
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
			
			
		}
		System.out.println(set);
	}
	
	
	
	public static void main(String[] args) {
		
		int arr[]= {10,10,20,30,40,40,50};
		removeDuplicates(arr);
	}

}
