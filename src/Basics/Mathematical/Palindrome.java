/*
[S , T] = [O(N) , O(1)]

Leet Code Link :



https://leetcode.com/problems/palindrome-number/solutions/3232462/palindrome-of-string-handling-negative-testcases-also/
 */

/**
 * @metadata-start
 * @id 725efd77-cf52-44ec-b59f-091e47423379
 * @name Palindrome
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

package	Math;
class Palindrome
{
	public static void main(String[] args) {
		int num = 121;
        Palindrome p= new Palindrome();
        p.isPalindrome(num);
	}
	public boolean isPalindrome(int x) {
        int res = 0;
        int n = x;
        while(n > 0)
        {
            int mod = n % 10;       
            res = mod + res*10;     
            n = n/10;
        }
        if(res == x)
            return  true;
        else
            return false;
    }
}