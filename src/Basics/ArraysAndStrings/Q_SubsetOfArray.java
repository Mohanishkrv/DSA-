/*
 * Naive approach : Using 2 loops 
 * 			[T,S] = [O(MN),O(1)]
 * Methods 2 : Using Sortig and Binary Search
 *
 * Method 3 : Using Hashing 
 * 
 * Methods 4 : Using ArrayList
 * 				[T,S] = [O(MN),O(Max(M,N))]
 */

/**
 * @id 27824556-bfda-4bef-a0a4-7f5b522a7f28
 * @name Q SubsetOfArray
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

import java.util.ArrayList;

public class Q_SubsetOfArray {
	public static void main(String[] args) {
		int arr1 [] = {1,2,3,4,5,6,7,8,9,10};
		int arr2 [] = {1,2,3,1};
		//int arr3 [] = {11,222,1,4,45,5};
		System.out.println(checkSubset(arr1,arr2));
	}

	public static boolean checkSubset(int[] arr1, int[] arr2) {
		ArrayList h = new ArrayList<>();
		for(int i = 0; i < arr1.length; i++)
		{
			h.add(arr1[i]);
		}
		for(int i = 0;i < arr2.length; i++)
		{
			if(!h.contains(arr2[i]))
				return false;
			h.remove(arr2[i]);
		}
		return true;
	}
}
