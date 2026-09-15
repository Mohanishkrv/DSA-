/**
 * @metadata-start
 * @id ad55d8be-1e28-4fed-82dc-859138ab3c6f
 * @name Array Rotation
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
  * @metadata-end
 */

package Arrays;

import java.util.Arrays;

/*
 * Method 1 : Using temproary array [T , S] = [(O(N) , O(N))] 
 * Method 2 : Rotate one by one [T , S] = [O(N*K) , O(N)]
 */
public class Array_Rotation {
	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5,6,7};
		int arr2 [] = {1,2,3,4,5,6,7};
		int k = 2;
		System.out.println(Arrays.toString(arr));
		// RotateM1(arr,k);
		rotateReverse(arr2, k);
		// System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}

	public static void reverstUtil(int arr[], int low , int high)
	{
		while(low < high)
		{
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
	public static void rotateReverse(int arr[], int k)
	{
		//if no of rotation is more than length
		// then k = k % n;
		int len = arr.length;
		// For anti clockwise
		k = len - k;
		////clockwise 
		reverstUtil(arr, 0, len- k -1);
		reverstUtil(arr, len - k, len - 1);
		reverstUtil(arr, 0, len - 1);
		
	}

	private static void RotateM1(int[] arr, int k) 
	{
		int temp[] = new int[arr.length];
		int j = 0;
		for(int i = k; i < arr.length; i++)
		{
			temp[j++] = arr[i];
		}
		
		for(int i = 0;i < k; i++)
		{
			temp[j++] = arr[i];
		}

		for(int i = 0;i < arr.length; i++)
		{
			arr[i] = temp[i];
		}
	}


}
