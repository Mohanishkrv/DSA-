/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @id cb285bde-d048-40be-9213-0dc5b0e4bfa6
 * @name RearrangeStringArrays
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

package String_Problems;

import java.util.Arrays;

/**
 *
 * @author MOHANISH
 */

/*string[] ={bb,aa,AA,ABC,123,567}
ans  should be 
{AA,ABC,123,567,aa,bb}
*/
public class RearrangeStringArrays {
    public static void main(String[] args) {
        String s[]={"bb","aa","AA","ABC","123","567"};
        getSorted(s);
    }

    private static void getSorted(String[] s) 
    {
        Arrays.sort(s);
                        
        System.out.println(Arrays.asList(s));
        int upperlimit=0;
        while(!Character.isLowerCase(s[upperlimit].charAt(0)))
        {
            upperlimit++;
        }
        int x=0;
        for(int i=0;i<upperlimit;i++)
        {
            if(Character.isUpperCase(s[i].charAt(0)))
            {
                swap(s[i],s[x]);
                x++;
            }
        }
        System.out.println(Arrays.asList(s));
    }

    private static void rotateArray(String[] arr,int lowerlimit, int upperlimit, int k) 
    {
        reverse(arr,lowerlimit,upperlimit-k-1);
        reverse(arr,upperlimit-k-1,upperlimit);
        reverse(arr,lowerlimit,upperlimit);
    }

    private static void reverse(String[] arr, int lowerlimit, int upperlimit) 
    {
        int start=lowerlimit;
        int end=upperlimit;
        while(start<end)
        {
            String temp=arr[lowerlimit];
            arr[lowerlimit]=arr[upperlimit];
            arr[upperlimit]=temp;
            start++;
            end--;
        }
    }

    private static void swap(String s1, String s2) 
    {
        String temp=s1;
        s1=s2;
        s2=temp;
    }
}
