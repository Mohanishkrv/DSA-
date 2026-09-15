/*
 * Given a number N. Count the number of digits in N which evenly divides N.

Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.
 */

/**
 * @id 0323b506-00ff-4879-89d1-30f9e57f33cb
 * @name CountDigits
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

package Math;

public class CountDigits {
	public static void main(String[] args) {
		int N = 1234;
        System.out.println(evenlyDivides(N));
		//corener case is  22074 - 0 coming in between
	}
	public static int evenlyDivides(int N){
        int c = 0;
        int x = N;
        while(x != 0)
        {
            int mod = x %10;
            x = x/10;
            if(mod!=0 && N % mod == 0)
                c++;
        }
        return c;
    }
}
