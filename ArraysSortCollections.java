package br.com.tdv.precoleta.model;

import java.util.Arrays;
import java.util.Collections;


public class ArraysSortCollections {
	
	public static void printSort(int[] arrayInt) {
		Arrays.sort(arrayInt);
	    for(int i: arrayInt) System.out.println(i);
	}

	public static void printSortReverse(int[] arrayInt) { 
		Integer[] arr = new Integer[arrayInt.length];
		for (int i = 0; i < arrayInt.length; i++) 
			arr[i] = arrayInt[i];
		Arrays.sort(arr, Collections.reverseOrder());
	    System.out.println(Arrays.toString(arrayInt));
	}
	
	public static void main(String[] args) {
		int[] array = {9,3,5,7,3,2,1,0,-1};
	    printSort(array);
	    printSortReverse(array);
    }
	
	
}
