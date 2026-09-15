/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 25879cad-e59a-47ca-9e2c-90478a302ce6
 * @name Missing No
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
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class Missing_No {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            String s[]=br.readLine().split(" ");
            int a[]=new int[n-1];
            for(int i=0;i<n-1;i++)
            {
                a[i]=Integer.parseInt(s[i]);
            }
            System.out.print(check(n,a));
        }
    }

    public static int check(int n, int[] a) 
    {
        int sum_of_all_terms=n*(a[0]+a[n-2])/2;
        for(int i=0;i<n-2;i++)
        {
            sum_of_all_terms-=a[i];
        }
        return sum_of_all_terms;
    }
}
