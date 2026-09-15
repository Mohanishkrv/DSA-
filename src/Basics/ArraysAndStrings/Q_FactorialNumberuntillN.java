/*
 * A number N is called a factorial number if it is the factorial of a positive integer.
 *  For example, the first few factorial numbers are 1, 2, 6, 24, 120,
Given a number N, the task is to return the list/vector of the factorial numbers smaller than
or equal to N.
https://practice.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548
/0?problemType=functional&difficulty[]=-1&page=1&query=problemTypefunctionaldifficulty[]-1page1&utm_source
=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-all-factorial-numbers-less-than-or-equal-to-n
 
[T,S] = [O(K),O(1)] ;K = no of factorials
*/
/**
 * @id 4f3ab6b0-8b1e-4e0b-a567-6b1fcb4c49f0
 * @name Q FactorialNumberuntillN
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

package Arrays;

import java.util.ArrayList;

public class Q_FactorialNumberuntillN {
	public static void main(String[] args) {
		int N = 6;
		ArrayList<Long> l = new ArrayList<>();
		factorialNumbers(N);
	}

	private static void factorialNumbers(int n)
	{
		int fact = 1;
		int curr_no = 2;// starting from 2 as fact 1 will already be there
		while(fact <= n)
		{
			System.out.print(fact+" ");
			fact*=curr_no;
			curr_no++;
		}
	}
}