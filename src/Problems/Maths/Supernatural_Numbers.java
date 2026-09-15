/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id dd501556-2124-4b1b-95a7-7afb647e0cd5
 * @name Supernatural Numbers
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

package Maths;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class Supernatural_Numbers {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int count=0,a;
        for(int i=2;i<10000000;i++)
        {
            a=supernno(i);
            if(a==n)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static int supernno(int n)
    {
        int rem,prod=1;
        while(n!=0)
        {
            rem=n%10;
            if(rem==1)
            {
                return 0;
            }
            prod*=rem;
            n=n/10;
        }
        return prod;
    }
}
