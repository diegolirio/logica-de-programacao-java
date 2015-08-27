package br.com.tdv.precoleta.model;

import java.util.Arrays;


public class ArraysSortCollections {
	
	public static void printSort(int[] arrayInt) {
		Arrays.sort(arrayInt);
	    for(int i: arrayInt) System.out.println(i);
	}

	// TODO: 
	public static void printSortReverse(int[] arrayInt) {
		Arrays.sort(arrayInt);
		for(int i: arrayInt) System.out.println(i);
	}
	
	public static void main(String[] args) {
		int[] array = {9,3,5,7,3,2,1,0,-1};
	    printSort(array);
    }
}
