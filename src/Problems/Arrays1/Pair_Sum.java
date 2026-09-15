/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id a2296dfd-a541-4f6f-9c33-0eede2a49e9b
 * @name Pair Sum
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
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 *
 * @author ASUS
 */
public class Pair_Sum {
    static int pairs;
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<s.length;i++)
        {
            a[i]=Integer.parseInt(s[i]);
        }
        int sum=Integer.parseInt(br.readLine());
        pairs=0;
        System.out.print(no_of_pairs(a,sum));
    }

    private static int no_of_pairs(int[] a,int sum) 
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    continue;
                }
                if(a[i]+a[j]==sum)
                {
                    pairs++;
                }
            }
        }
        return pairs;
    }
}
