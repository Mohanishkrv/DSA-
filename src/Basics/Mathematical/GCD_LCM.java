/*
GCD

 *Method 1 : Brute Force
			[T,S] = [O(N),O(1)]
 * 
 *Method 2 : Euclidean's Theorem :
	Intuition: Gcd is the greatest number which is divided by both a and b.
 	If a number is divided by both a and b, it is should be divided by (a-b) and b as well.
			[T,S] = [O(log(Min(a,b))) , O(1)]

LCM
	Method 1 : Brute Force
	Method 2 : Using GCD
	*/

/**
 * @metadata-start
 * @id 6e1023c4-dcef-48b1-b6fb-a2f61df6ba9f
 * @name GCD LCM
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

public class GCD_LCM {
	public static void main(String[] args) {
		int x = 5;
		int y =29;
		System.out.println(getGCD(x,y));
		System.out.println(getGCDbyEuclideansTheorem(x,y));
		System.out.println(getLCM(x, y));
		System.out.println(getLCMusingGCD(x, y));
	}

	private static int getGCDbyEuclideansTheorem(int a, int b) 
	{
		if(b == 0)
			return a;
		return getGCDbyEuclideansTheorem(b,a % b);
	}

	public static int getGCD(int x, int y) {
		int result = 1; // since 1 is the GCD for prime no.s also who dont have any GCD
		for(int i = 1;i <= Math.min(x, y); i++) //Traverse untill the min of 2 elements
		{
			if((x % i ==0) && (y % i ==0))
				result = i;
		}
		return result;
	}

	public static int getLCM(int x, int y)
	{
		int max = Math.max(x,y);
		while(true)
		{
			if((max % x == 0) && (max % y == 0))
			{
				return max;
			}
			max ++;
		}
	}

	public static int getLCMusingGCD(int x, int y)
	{
		return ((x * y)/getGCDbyEuclideansTheorem(x, y));
	}

}
