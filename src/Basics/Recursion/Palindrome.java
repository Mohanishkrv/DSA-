/**
 * @id 31772bb1-f853-4c41-b299-97c47d72417f
 * @name Palindrome
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

public class Palindrome {
	public static void main(String[] args) {
		String s = "aba";
		System.out.println(checkPalindrome(s,0,s.length()-1));
	}

	private static boolean checkPalindrome(String s ,int start, int end) 
	{	
		if(start > end)
			return true;
		return s.charAt(start) != s.charAt(end) ? false : checkPalindrome(s, start + 1, end - 1); 
	}
}
