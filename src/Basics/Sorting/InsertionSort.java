/*
Insertion Sort		: The array is virtually split into a sorted and an unsorted part.
					  Values from the unsorted part are picked and placed at the correct 
					  position in the sorted part.
Space Complextiy    : O(N^2)
Time Complexity     : O(1)

Worst Case Analysis : When array is arranged in decreasing order 
Total number of swaps = Total number of comparison
Total number of comparison (Worst case) = n(n-1)/2
Total number of swaps (Worst case) = n(n-1)/2

Best Case Analysis   : When array is sorted 	Ω(N)
*/
/**
 * @metadata-start
 * @id be0be3f0-8128-4b24-9b21-f92a5be1bc9b
 * @name InsertionSort
 * @description
 *
 * @topic Sorting
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
  * @metadata-end
 */

package Sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) 
    {
        int arr[]={21,312,31,1112,3,981,1212};
		sort(arr); 
		System.out.println(Arrays.toString(arr));
    }

	private static void sort(int[] arr) {
		for(int i=1; i < arr.length ; i++)
		{
			int flag = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > flag)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = flag;
		}
	}
	
}
