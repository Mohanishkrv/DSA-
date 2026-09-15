/*
Selection Sort		: Repeatedly selects the smallest element from the unsorted portion and moves it 
					  sorted portion of array
Space Complextiy    : O(N^2)
Time Complexity     : O(1)

*/
/**
 * @id 14b9e534-dfc5-4099-bc02-d064863f5cff
 * @name SelectionSort
 * @description
 *
 * @topic
 * @type Normal
 * @difficulty
 * @pattern
 *
 * @companies
 * @source
 * @url
 *
 * @status Unsolved
 * @approach
 * @attempts 0
 * @confidence Low
 * @review
 *
 * @time-complexity
 * @space-complexity
 *
 * @limitations
 * @edge-cases
 */

package Sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) 
    {
        int arr[]={21,312,31,1112,3,981,1212};
		sort(arr); 
		System.out.println(Arrays.toString(arr));
    }

	private static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			int min_index=i;
			for(int j = i+1 ;j < arr.length ; j++)
			{
				if(arr[j] < arr[min_index])
				{
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
	}

}
