/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id fb932fc2-fab1-4407-9f5d-98467b32c3e0
 * @name LCM Power Modulo
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

package Maths;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class LCM_Power_Modulo {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String s1[]=br.readLine().split(" ");
            int N=Integer.parseInt(s1[0]);
            int M=Integer.parseInt(s1[1]);
            int K=Integer.parseInt(s1[2]);
            String s2[]=br.readLine().split(" ");
            long a[]=new long[N];
            for(int i=0;i<N;i++)
            {
                a[i]=Long.parseLong(s2[i])*K;
            }
            long lcm=LCM(a,N);
            System.out.println((lcm%M)/2);
        }
    }
    public static long LCM(long a[],int N)
    {
        long lcm=1,divisor=2;
        while(true)
        {
            int c=0;
            boolean divisible=false;
            for(int i=0;i<N;i++)
            {
                if(a[i]==0)
                {
                    return 0;
                }
                else if(a[i]<0)
                {
                    a[i]=a[i]*(-1);
                }
                if(a[i]==1)
                {
                    c++;
                }
                if(a[i]%divisor==0)
                {
                    divisible=true;
                    a[i]=a[i]/divisor;
                }
            }
            if(divisible)
            {
                lcm=lcm*divisor;
            }
            else
            {
                divisor++;
            }
            if(c==N)
            {
                return lcm;
            }
        }    
    }
}
