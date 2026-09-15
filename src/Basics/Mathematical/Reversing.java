/*
* Reversal of Integer with following conditions
 * https://leetcode.com/problems/reverse-integer/
 */
/**
 * @metadata-start
 * @id cc26fef1-4b43-41c4-8bb2-f3209bf7944e
 * @name Reversing
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

package Math;

public class Reversing {
	public static void main(String[] args) {
		int n = 1534236469;
		System.out.println(getReverse(n));
	}

	private static long getReverse(int x) 
	{
		long result = 0;
        while(x != 0 )
        {
            long mod = x % 10;
            result = result * 10 + mod;
            x = x/10;
        }
    	if(result > Math.pow(2,31) -1 || result < Math.pow(-2,31))
            return 0;
        else
			return result;
	}	
}
