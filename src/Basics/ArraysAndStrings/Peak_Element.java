/*
 Get First peak element i.e. greater than both neighbouring elements
 
 Method 1 : Brute Force [S,T] = [O(N),O(1)] : gets first peak element
 Method 2 : Binary Search [S,T] = [O(NlogN) , O(NlogN)] : gets peak element out of whole array
 */

/**
 * @id 295f6446-d15e-4a86-8d68-33588236d361
 * @name Peak Element
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

package Arrays;

public class Peak_Element {
	public static void main(String[] args) 
	{
		int arr[] = {10, 20, 15, 2, 23, 90, 67};
		System.out.println(getPeak(arr));
		System.out.println(getPeakBinarySearch(arr));
	}

	public static int getPeak(int arr[] )
	{
		int n = arr.length;
		if(n == 1)
			return arr[0];
		if(arr[0] >= arr[1])
			return arr[0];
		if(arr[n-1] >= arr[n-2])
			return arr[n-1];
		for(int i = 1;i < arr.length - 1; i++)
		{
			if(arr[i] > arr[i-1] && arr[i] > arr[i+1])
				return arr[i];
		}
		return -1;
	}

	public static int getPeakBinarySearch(int arr[])
	{
		int start = 0;
		int end = arr.length - 1;
		while(start < end)
		{
			int mid = (start + end) / 2;
			if(arr[mid] > arr[mid + 1])
				end = mid;
			else
				start = mid + 1;
		}
		return arr[start];
	}
}
