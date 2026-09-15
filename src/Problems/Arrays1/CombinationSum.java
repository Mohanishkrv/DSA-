/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id e6370ccf-5a03-4865-8691-2c95d65049dc
 * @name CombinationSum
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author Mohanish
 */
public class CombinationSum {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n=Integer.parseInt(br.readLine());
            String s1=br.readLine();
            String s11[]=s1.trim().split(" ");
            int a[]=new int[n];
            for(int i=0;i<s11.length;i++)
            {
                a[i]=Integer.parseInt(s11[i]);
            }
            int s=Integer.parseInt(br.readLine());
            for(int i=0;i<n;i++)
            {
                int j=0;
                while(j!=i && j<i)
                {
                    int b[]=Arrays.copyOfRange(a,i,j);
                    int sum=IntStream.of(b).sum();
                    if(sum==s)
                    {
                        System.out.println(Arrays.toString(b));
                    }
                    j++;
                }                
            }
    }   
}
