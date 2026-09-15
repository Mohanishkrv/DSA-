/*
 * An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. Return "Yes" if it is a armstrong number else return "No".
NOTE: 371 is an Armstrong number since 33 + 73 + 13 = 371
 */
/**
 * @metadata-start
 * @id b2f30710-333c-42da-8f71-24b2a32b6d3d
 * @name ArmstrongNumber
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

public class ArmstrongNumber {
	public static void main(String[] args) {
		int n = 371;
		System.out.println(checkArmstrongNumber(n));
	}

	private static String checkArmstrongNumber(int n) {
		int result = 0;
		int temp = n;
		while(temp != 0)
		{
			int mod = temp % 10;
			result += Math.pow(mod, 3);
			temp/=10;
		}
		if(result == n)
			return "Armstrong Number";
		else
			return "Not an Armstrong Number";
	}
}
