/**
 * @id a84471a6-16c5-41ab-8008-62c8f2a5fe79
 * @name SieveOfEratosthenes
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
/*
************************Sieve of Eratosthenes************************
-----------------------------Algorithm---------------------------
The sieve of Eratosthenes is one of the most efficient ways to find all primes smaller than n
when n is smaller than 10 million 

According to the algorithm we will mark all the numbers which are divisible by 2
and are greater than or equal to the square of it. 

Now we move to our next unmarked number 3 and mark all the numbers which are
multiples of 3 and are greater than or equal to the square of it.  

We move to our next unmarked number 5 and mark all multiples of 5 and are
greater than or equal to the square of it. 
We continue this process 
-----------------------------Program-----------------------------
> create prime arr[] for 0 to n
> mark whole array as true
> traverse whole array starting from 2 to n 
> mark no divisible by i and are greater than or equal to the square of it 

[ S, T] = [ O(N), O(Nlog(log(n)))]
*/
public class SieveOfEratosthenes {
	public static void main(String[] args) {
	int n = 100;
	SieveOfEratosthenes s = new SieveOfEratosthenes();
	s.getPrimeNos(n);
	}	

	public void  getPrimeNos(int n)
	{
		boolean prime[] = new boolean[ n + 1 ]; //n+1 because we want from 0 - n

		for( int i = 0 ; i <= n ; i++ )
			prime[i] = true;

		for(int p = 2; p * p <= n ;p++)
		{
			if(prime[p] == true)
			{
				for(int i = p*p; i <= n; i += p)
				{
					prime[i] = false;
				}
			}
		}
		for(int i = 2;i <= n; i++)
		{
			if(prime[i] == true)
				System.out.print(i + " ");
		}
	}
}