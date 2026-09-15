/*
 Given a positive integer N., The task is to find the value of    
 sum_{i=1}^{i=n} F(i)  where function F(i) for the number i be defined as the sum of all divisors of ‘i‘.
 https://www.geeksforgeeks.org/sum-divisors-1-n/

Method 1 : Naive Approach
		[T,S] = [O(Nsqrt(N)),O(1)]
Method 2 : Efficinet Approach
number i is occurring only in their multiples less than or equal to n. Thus, we just need to find the count
  of multiples and then multiply it with i for full contribution in the final sum. It can easily be done in
   O(1) time by taking the floor of (n / i) and then multiply it with i for the sum. 
		[T,S] = [O(N),O(1)]
   */
/**
 * @id cf69f62b-80c0-4508-8219-2559c7ac502d
 * @name SumDivisorsFrom1ton
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

public class SumDivisorsFrom1ton {
	public static void main(String[] args) {
		int n = 4;	
		//System.out.println(sumOfDivisors(n));
		System.out.println(divisorSum(n));
	}

	static long divisorSum(int N)
	{
		long sum = 0;
		for(int i = 1;i <=N;i++)
		{
			sum += (N/i) * i;
		}
		return sum;
	}

	static long sumOfDivisors(int N){
        long sum =0;
        for(int i = 1 ;i <= N; i++)
            sum+=getSumOfDivisors(i);
        return sum;
    }
    
    static long getSumOfDivisors(long N)
    {
        long sum = 0;
        for(int i = 1; i <= N;i++)
        {
            if(N % i == 0)
                sum+=i;
        }
        return sum;
    }

}
