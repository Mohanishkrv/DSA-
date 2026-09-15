/**
 * @metadata-start
 * @id b48135f4-b344-49d1-8636-735797aa5647
 * @name PrimeNumber
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

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 51;
		System.out.println(checkPrime(n));
	}

	private static String checkPrime(int n) {
		for(int i = 2; i <= Math.sqrt(n) ; i++)
		{
			if(n % i == 0)
			{
				return "Not Prime Number";
			}
		}
		return "Prime Number";
	}
}
