/*
 * Counting Frequency of Each item in array from 1 to P
 */

/**
 * @metadata-start
 * @id 6a545bcf-1f12-400c-84a1-69f7d607c907
 * @name Q CountingFrequency
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

package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Q_CountingFrequency {
	public static void main(String[] args) {
		int arr[] = {3, 2, 2, 2, 1};
		getFrequency(arr, arr.length, 5);
	}

	public static void getFrequency(int arr[],int len,int P)
	{
		Map<Integer,Integer> h = new HashMap<Integer,Integer>();
		for(int i = 0;i < len && arr[i]<=P; i++)
		{
			if(h.containsKey(arr[i]))
			{
				h.put(arr[i],h.get(arr[i])+1);
			}
			else
			{
				h.put(arr[i], 1);
			}
		}

		for(int i = 1 ; i <=P; i++ )
		{
			if(h.containsKey(i))
			{
				System.out.print(h.get(i)+" ");
			}
			else
			{
				System.out.print(0+" ");
			}	
		}
	}

}
