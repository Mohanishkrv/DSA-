/*
 ***********Finding Longest Prefix in String of Arrays***********
[T, S] = [O(MNlog(N)), O(1)]
 
Approach : 
-Sort the arrays in-order to arrange them in alphabetical order.
-Compare char of first and last element 
*/

/**
 * @metadata-start
 * @id 04df6a34-d048-46c6-932d-1ed746ac24e6
 * @name Longest Prefix
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

package Strings;

import java.util.Arrays;

public class Longest_Prefix 
{
	public static void main(String[] args) {
		String str [] = {"geeksforgeeks", "geeks", "geek", "geezer"};
		get_Longest_prefix(str);
	}

	private static void get_Longest_prefix(String[] str)
	{
		Arrays.sort(str); 

		System.out.println(Arrays.toString(str));
		String firstElem = str[0];
		String lastElem = str[str.length-1];
		//Find Min Length since the last string can be of shorter length
		int len = Math.min(firstElem.length(), lastElem.length()); 
		
		int i = 0;
		while(i < len && firstElem.charAt(i) == lastElem.charAt(i))
		{
			i++;
		}

		if(i == 0)
			System.out.println("No Prefix found");
		else
			System.out.println(firstElem.substring(0,i));
	}
	
}
