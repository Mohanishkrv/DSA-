/*
Reversal of String
Refer below to learn more

	// Write optimized version also
	//https://www.geeksforgeeks.org/reverse-words-in-a-given-string/

Method 1 :	Reverse each word than reverse whole String,
			[S , T] = [O(N) ,O(N)]
			Doesn't handles when String starts with Space
Method 2 : Using String Builder
			Str result = new StringBuilder(str).reverse().toString();


Method 3 : Below implemetation
It is impossible to reverse the String in O(1) Time
*/

/**
 * @metadata-start
 * @id 60d89d40-946a-44df-b042-08e5395a6984
 * @name Reversal String
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

class Reversal_String
{
	public static void main(String[] args) {
		String str = "i love programming very much";
		System.out.println(new StringBuilder(str).reverse().toString()); //Method 2
		System.out.println(string_reversal(str));
	}

	private static String string_reversal(String str)//Method 3 
	{
		String result = "";
		for(int i = str.length() - 1 ; i >= 0 ; i--)
		{
			result += str.charAt(i);
		}
		return result;
	}

} 