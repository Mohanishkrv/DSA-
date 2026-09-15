/**
 * @metadata-start
 * @id d6c64b39-7ad9-4a3d-b3e3-5dd11b58f592
 * @name SecondLargest
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

public class SecondLargest {
	public static void main(String[] args) {
		int arr [] = {61 ,30, 28, 47, 42, 41, 56, 27, 45, 44, 34, 46, 35, 58, 36, 60, 29, 53, 55, 32, 31, 33, 59, 50, 51, 52, 37, 39, 38, 43, 49, 54, 57, 40, 26, 48};
		System.out.println(getSecondLargest(arr));
		System.out.println(getSecondSmallest(arr));
	}

	public static int getSecondSmallest(int arr[])
	{
		int min = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < min)
			{
				min2 = min;
				min = arr[i];
			}
			else if(arr[i] < min2 && arr[i] != min)
			{
				min2 = arr[i];
			}
		}
		return min2;
	}

	public static int getSecondLargest(int arr[])
	{
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max2 = max;
				max = arr[i];

			}
			else if(arr[i] > max2 && arr[i] != max)
			{
				max2 = arr[i];
			}
		}
		return max2;
	}
}
