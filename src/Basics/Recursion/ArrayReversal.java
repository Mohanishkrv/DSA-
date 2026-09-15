/**
 * @id 3f282fdd-e596-4f3d-8cbe-6ab5e9a12fa3
 * @name ArrayReversal
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

package Recursion;

import java.util.Arrays;

public class ArrayReversal {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void reverseArray(int[] arr) {
		getReverse(arr,0,arr.length - 1);
	}

	private static void getReverse(int[] arr, int start, int end) {
		if(start < end)
		{	int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			getReverse(arr, start + 1, end - 1);
		}

	}
}
