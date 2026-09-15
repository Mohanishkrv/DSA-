/**
 * @metadata-start
 * @id 2f86c837-ea1d-4c35-b309-7cafcd189236
 * @name SumOfN
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

package Recursion;


public class SumOfN {
	public static void main(String[] args) {
		long N = 5;
		System.out.println(getSum(N));
	}

	private static long getSum(long n) {
		long sum = 0;
		return getSumRec(n,sum);
	}

	private static long getSumRec(long n, long sum) {
		if(n <= 0)
			return sum;
		sum+= Math.pow(n,3);
		n--;
		return getSumRec(n,sum);
	}
}
