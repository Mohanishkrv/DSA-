/*
Method 1 : Greedy Algorithm
[T,S] = [O(N),O(N)]

Method 2 : Space Optimized
[T,S] = [O(N),O(1)]
	
 */

/**
 * @id 9857fc1f-0df4-4460-a4ac-f88a70954c9c
 * @name FibonacciNo
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

import java.util.Arrays;

public class FibonacciNo {
	public static void main(String[] args) {
		int n = 5;
		getFibonacci(n);
		getFibonacci2(n);
	}

	//Method 1
	private static void getFibonacci(int n)
	{
		int fibb []= new int[n + 1];
		fibb[0] = 0;
		fibb[1] = 1;
		for(int i = 2; i <= n ;i++ )
		{
			fibb[i] = fibb[i-1] + fibb[i-2];
		}
		System.out.println(Arrays.toString(fibb));
	}	

	public static void getFibonacci2(int n)
	{
		int second_last = 0;
		int last = 1;
		System.out.print(second_last+" "+last+" ");
		int curr;
		for(int i = 2;i <= n; i++)
		{
			curr = last +second_last;
			second_last = last;
			last = curr;
			System.out.print(curr+" ");
		}
	}
}
