/**
 * @id f28738c8-fd3b-44af-bbcb-c20fd5ddf9df
 * @name MinMax
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

public class MinMax {
	public static void main(String[] args) {
		long arr[] = {1,2,3,4,4,5,5,2121,6,7,8,8,9};
		getMinMax(arr);
	}
	public static void getMinMax(long[] arr) {
		long min=arr[0],max = arr[0];
		for(int i =0 ;i < arr.length; i++)
		{
			if(arr[i] > max)
				max = arr[i];
			if(arr[i] < min)
				min = arr[i];
			continue;
		}
		System.out.println(min+" "+max);
	}
	
}
