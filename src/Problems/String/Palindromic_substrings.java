    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 076e8441-c8a7-4e69-8728-436c35ea8df9
 * @name Palindromic substrings
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

package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class Palindromic_substrings {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1[]=br.readLine().split(" ");
        int n=Integer.parseInt(s1[0]);
        int k=Integer.parseInt(s1[1]);
        String s2=br.readLine();
        //Susbtrings
        int length=s2.length()*(s2.length()+1)/2;
        String arr[] =new String[length];
        int temp=0;
        for(int i=0;i<s2.length();i++)
        {
            for(int j=i;j<s2.length();j++)
            {
                    arr[temp]=s2.substring(i,j+1);
                    temp++;   
            }
        }
        for(int i=1;i<=k;i++)
        {
            System.out.println(i*k);
        }
        //valid Palindrome subs
        
    }
    
    public static void palindrome(String arr[])
    {
        int count=0;
        String pal="";
        for(int i=0;i<arr.length;i++)
        {
            pal="";
            for(int j=arr[i].length()-1;j>=0;j--)
            {
                pal+=arr[i].charAt(j);
            }
            if(pal.equals(arr[i]) && pal.length()>1)
            {
                count++;
            }
        }
        
    }
}
