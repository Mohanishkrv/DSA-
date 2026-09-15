/**
 * @id 88d6b214-b85f-43b7-a39b-d9226b28af0f
 * @name Binary Exponentiation
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

package Basics.Algorithms;

public class Binary_Exponentiation
{
	static long N = 1000000007L; // prime modulo value
	public static void main(String[] args)
	{
		long base = 5; 
		long exp = 100000;
 
		long modulo = exponentiationIterative(base, exp);
		System.out.println(modulo);
	}
 
	static long exponentiationIterative(long base, long exp)
	{
		long t = 1L;
		while (exp > 0) {
			// for cases where exponent
			// is not an even value
			if (exp % 2 != 0)
				t = (t * base) % N;
 
			base = (base * base) % N;
			exp /= 2;
		}
		return t % N;
	}

	static long exponentiationRecursion(long base, long exp)
	{
		if (exp == 0)
			return 1;
 
		long t = exponentiationRecursion(base, exp / 2);
 
		if (exp % 2 == 0)
			return (t * t) % N;
		else
			return ((t * t) % N * base) % N;
	}

}