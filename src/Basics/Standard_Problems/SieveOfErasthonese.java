/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 64977bfe-1807-4c41-bc9b-fadb977297f3
 * @name SieveOfErasthonese
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

package Standard_Problems;

/**
 *
 * @author Mohanish
 */
public class SieveOfErasthonese {
    public static void main(String args[])
    {
        int n=50;
        sieve(n);
    }

    private static void sieve(int n) 
    {
        boolean prime[]=new boolean[n+1];
        for(int i=0;i<n;i++)
        {
            prime[i]=true;//Marking all no as prime
        }
        for(int p=2;p*p<n;p++)//Selecting nos 2,3,5...
        {
            if(prime[p]==true)
            {
                for(int i=p*p;i<=n;i=i+p)//checking divisiblity
                {
                    prime[i]=false;
                }
            }
        }
        for(int i=2;i<n;i++)
        {
            if(prime[i]==true)
            {
                System.out.print(i+" ");
            }
        }
    }
    
}
