/**
 * @metadata-start
 * @id e486079d-b3ba-4093-ae8e-2f349bab24eb
 * @name Print1 N
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

public class Print1_N {
	public static void main(String[] args) {
		printNos(10);
		System.out.println();
		prinNosRev(10);
	}

	private static void printNos(int N) 
	{
		if(N > 0)//The loop runs till N>1
        {
            printNos(N-1);//We keep on recursing till the end as we want to print from 1 to N
            System.out.print(N+" ");//When recursion is done then print N
        }
        return;
	}

	public static void prinNosRev(int N)
	{
		if(N <= 0) //base case
			return;
		else
			System.out.print(N-- +" ");
			prinNosRev(N);
	}
}
