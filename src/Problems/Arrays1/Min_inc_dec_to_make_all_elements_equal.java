/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id be54e748-f61d-411b-8492-fa0e349bd030
 * @name Min inc dec to make all elements equal
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
import java.util.Arrays;

/**
 *
 * @author ASUS
 */

    /*    public class Min_inc_dec_to_make_all_elements_equal {
public static void main(String[]  args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        if(n>0)
        {
        String s1[]=br.readLine().split("\\s");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(s1[i]);
        }
        minOper(a, n);
        }
        else
        {
            System.out.print(0);
        }
    }
    //O(n) time
    public static void minOper(int a[],int n)
    {
        Arrays.sort(a);
        int op=0;
        for(int i=0;i<n/2;i++)
        {
            op=op+(a[n/2]-a[i]);
        }
        for(int i=n/2;i<n;i++)
        {
            op=op+(a[i]-a[n/2]);
        }
        System.out.print(op);
    }
}
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String s[]=br.readLine().split(" ");
            check(s);
        }        
    }
    
    public static void check(String[] s)
    {
        for(int i=0;i<s.length;i++)
        {
            int n=Integer.parseInt(s[i]);
            for(int j=1;j<=n;j++)
            {
                if(j%3==0  && j%5==0)
                {
                    System.out.println("FizzBuzz");
                }
                else if(j%3==0)
                {
                    System.out.println("Fizz");
                }
                else if(j%5==0)
                {
                    System.out.println("Buzz");
                }
                else
                {
                    System.out.println(j);
                }
            }
        }
    }
}
