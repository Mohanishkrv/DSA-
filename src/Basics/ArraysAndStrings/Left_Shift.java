/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 74c77f8f-032c-48f7-8d90-7c2f357763d0
 * @name Left Shift
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

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class Left_Shift {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5,6,7};
        int shift=2;
        shiftt(a,shift);
        System.out.println(Arrays.toString(a));
    }
    
    public static void shiftt(int a[],int shift)
    {
        
        int p=a[0];
        for(int i=1;i<a.length;i++)
        {
            a[i-1]=a[i];
        }
        a[a.length-1]=p;
    }
    
    public static void shifttimes(int a[],int n,int k)
    {
        k%=n;
        int temp[]=new int[k];
        for(int i=00;i<k;i++)
        {
            temp[i]=a[i];
        }
        for(int i=0;i<n-k;i++)
        {
            a[i]=a[i+k];
        }
        int j=0;
        for(int i=n-k;i<n;i++)
        {
            a[i]=temp[j];
            j++;
        }
    }
}
