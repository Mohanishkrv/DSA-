/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 949907f4-47e0-488e-988a-d6fc992f6c13
 * @name Cataln NO DP
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

package Dynaminc_Programming;

import java.util.Scanner;

/**
 *
 * @author Mohanish
 */
public class Cataln_NO_DP {
//BY GREEDY APPROACH
/*  

    private static int cataln(int n) 
    {
        int res=0;
        if(n<=1)
        {
            return 1;
        }
        for(int i=0;i<n;i++)
        {
            res+=cataln(i)*cataln(n-i-1);
        }
        return res;
    }
*/
    //BY DP APPROACH
    static int cataln(int n)
    {
        int[] cat=new int[n+2];
        cat[0]=1;
        cat[1]=1;
        for(int i=2;i<=n;i++)
        {
            cat[i]=0;
            for(int j=0;j<i;j++)
            {
                cat[i]+=cat[j]*cat[i-j-1];
            }
        }
        return cat[n];  
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print(cataln(i)+"  ");
        }
    }
}


