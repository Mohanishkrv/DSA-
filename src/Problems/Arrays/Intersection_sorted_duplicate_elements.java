/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @metadata-start
 * @id 77264df7-13e8-4af9-802d-47978d478696
 * @name Intersection sorted duplicate elements
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

package Array_Problems;

import java.util.HashSet;

/**
 *
 * @author MOHANISH
 */
public class Intersection_sorted_duplicate_elements {
    public static void main(String[] args) {
        int a[]={1,2,2,3,3,4,5};
        int b[]={3,4,4,5,5,6,7,8};
        intersection(a,b);
    }

    private static void intersection(int[] a, int[] b)
    {
        HashSet<Integer> list=new HashSet<Integer>();
        int i=0,j=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]==b[j])
            {
                
                if(list.add(a[i])==true)
                {
                    System.out.println(a[i]+" ");
                }
                i++;
                j++;
            }   
            else if(a[i]<b[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
    }
}
