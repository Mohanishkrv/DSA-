/**
 * @metadata-start
 * @id bbeabb4e-66a4-4dd7-89a5-89e6c7f16456
 * @name MinNoOfJumps
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

/*M
Given an array of N integers arr[] where each element represents the maximum length of the jump 
that can be made forward from that element. This means if arr[i] = x, then we can jump any distance 
y such that y ≤ x.
Find the minimum number of jumps to reach the end of the array (starting from the first element).
If an element is 0, then you cannot move through that element.
Note: Return -1 if you can't reach the end of the array.

https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1

[T,S] = [O(N) , O(1)]
*/package Arrays;

public class MinNoOfJumps {
	public static void main(String[] args) {
		int arr [] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		System.out.println(getMinNoOfJumps(arr));
	}

	private static int getMinNoOfJumps(int[] arr) {
		int count=0,curr_i=0,sum=0;
        for(int i=0;i<arr.length-1;i++)
		{
            sum=Math.max(sum,arr[i]+i);//current element + index == no of steps or say sum
            if(i==curr_i){
                count++;
                curr_i=sum;
            }
        }
        if(curr_i<arr.length-1)
            return -1;
        return count;
	}
}
