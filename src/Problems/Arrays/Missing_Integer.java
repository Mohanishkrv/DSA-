/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @id e50ea9f7-43e3-4a0f-9104-772bb1d0be32
 * @name Missing Integer
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

package Array_Problems;

/**
 *
 * @author MOHANISH
 */
public class Missing_Integer {
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,5,6,7,8,10};
        //missingNo(a);
        missingNOBinarySearch(a);
    }

    private static void missingNo(int[] a) 
    {
        int diff=a[1]-a[0];
        for(int i=0;i<a.length-1;i++)
        {
            if((a[i]+diff)==a[i+1])
            {
                continue;
            }
            else
            {
                System.out.println(a[i]+1);
            }
        }
    }
    
    public static void missingNOBinarySearch(int a[])  //O(NlogN) , O(1)
    {
        int low=0,high=a.length-1;
        int mid=0;
        while((high-low)>1)
        {
            mid=(low+high)/2;
            if((a[low]-low)!=(a[mid]-mid))
            {
                high=mid;
            }
            else if((a[high]-high)!=(a[mid]-mid))
            {
                low=mid;
            }
        }
        System.out.println(a[mid]+1);
    }
}
