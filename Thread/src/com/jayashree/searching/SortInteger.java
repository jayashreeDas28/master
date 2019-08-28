package com.jayashree.searching;

public class SortInteger {
		
	public static void main(String arg[]) {
		int[] a = new int[] {56,8,67,34,13,3,4,56,89,12};
		// will be using quick sort algorithm where Worst case : O(n^2) time
		// but on and average case : O(nlogn)
		// this  sort will happen in place so extra space is not required .
		int end = a.length -1 ;
		quickSort(a,0,end);
		for(int i = 0 ; i < a.length ; i++) {
			System.out.print(a[i]+ " ");
		}
		
		
	}

	private static void quickSort(int[] a, int start, int end) {
		if(start < end ) {
		int pivot = partition(a,start,end);
		quickSort(a,start,pivot-1);
		quickSort(a,pivot+1,end);
		}
		
	}

	private static int partition(int[] a, int start, int end) {
		int pivot = a[end];
		int i = start ;
		for(int j = start ; j < end-1 ; j++) {
			if(a[j] < pivot ) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp ;
				i++;
			}
			
		}
		
		int temp1 = a[end];
		 a[end] = a[i] ;
		 a[i]  = temp1 ;
		return i;
	}
	
	
	
	
	
}
