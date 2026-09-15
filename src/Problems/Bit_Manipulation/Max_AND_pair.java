/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 6e07e1f8-eb4b-42c4-9b3c-29be0e2c9e2a
 * @name Max AND pair
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

package Bit_Manipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class Max_AND_pair {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s[]=br.readLine().split(" ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(s[i]);
        }
        System.out.print(getMaxAND(a,n));
    }
    public static int getMaxAND(int a[],int n)
    {
        int maxAnd=0,c;
        for(int bit=31;bit>=0;bit--)
        {
            c=checkBit(maxAnd | 1<<bit,a,n);
            if(c>=2)
            {
                maxAnd|=(1<<bit);
            }
        }
        return maxAnd;
    }
    
    public static int checkBit(int pattern,int a[],int n)
    {
        int c=0;
        for(int i=0;i<n;i++)
        {
            if((pattern & a[i])==pattern)
            {
                c++;
            }
        }
        return c;
    }
}
