/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 9494ef95-038d-4ffa-9e4c-2b6310f8a4ed
 * @name Array pairsimilarele
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

package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Mohanish
 */
public class Array_pairsimilarele {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s=br.readLine();
        String sp[]=s.trim().split(" ");
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(sp[i]);
        }
        Arrays.sort(a);
        int c=0;
        for(i=0;i<n;i++)
        {
            long d=1,sn=1;
            while((i<n) && (a[i]==a[i-1])||(a[i]==a[i+1]+1))
            {
                d++;
                if(a[i]==a[i-1])
                {
                    sn++;
                    i++;
                }
            }
            if(d!=1 && d!=sn)
            {
                c+=(d*(d-1))/2;
            }
        }
        System.out.print(c);
    }
}
