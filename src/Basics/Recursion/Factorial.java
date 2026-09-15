/**
 * @id 063d9622-59c9-43e2-b70e-d74ba2e15195
 * @name Factorial
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

import java.util.ArrayList;


public class Factorial {
	public static void main(String[] args) {
		int N = 1,fact = 1;
		ArrayList<Long> l = new ArrayList<>();
		l =factorialNumbers(N);
		System.out.println(l);
		//System.out.println(getFactorial(N));
	}
	static ArrayList<Long> factorialNumbers(long N)
	{
        ArrayList<Long> arr = new ArrayList<Long>();
        for(long i = 1 ;i <= N ;i++)
        {
            if(getFactorial(i) <= N)
                arr.add(getFactorial(i));
            else
				break;
        }
        return arr;
    }
	private static int getFactorial(int n, int fact) {
		if(n == 1)
			return fact;
		fact *= n;
		n--;
		return getFactorial(n, fact);
	}

	public static long getFactorial(long n)
	{
		if(n == 0)
			return 1;
		return n * getFactorial(n-1);
	}
}
