/*
 Binary Search

Iterative Approach : [S , T] = [O(log(N)) , O(1)]

Recursive Approach : [S , T] = [O(log(N)) , O(log(N))] 
					-> Space Complexity is also OlogN because the mid variable is getting created 
					at every recursive iteration 

 *Applicable only for sorted array
 */

/**
 * @metadata-start
 * @id 5bfdfd3b-bd3d-4e4a-a153-7a4a5cbb6206
 * @name Binary Search
 * @description
 *
 * @topic Searching
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

package Searching;

class Binary_Search
{
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(iterativeSearch(arr, 2));
		System.out.println(recursiveSearch(arr, 5, 0, arr.length-1));
	}

	public static boolean recursiveSearch(int [] arr, int x,int start, int end)
	{
		if(start > end) // breaking condition
		{
			return false;
		}
		else
		{
			int mid = (start + end)/2;
			if(arr[mid] == x)
			{
				return true;
			}
			else if (x < arr[mid] )
			{
				return recursiveSearch(arr, x, start, mid-1);
			}
			else
			{
				return recursiveSearch(arr, x, mid+1, end);
			}
		}
	}

	public static boolean iterativeSearch(int[] arr, int x) {
		int start = 0;
		int end = arr.length - 1;
		while(start < end )
		{
			int mid = (end + start)/2 ;
			if(arr[mid] == x)
				return true;
			else if(x < arr[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}
		return false;
	}
}