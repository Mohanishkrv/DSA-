/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id a48b2f4a-83d0-4d34-9b3b-b35b613fea84
 * @name UnionOf2Arrays
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author ASUS
 */
public class UnionOf2Arrays {
    public static void main(String args[])
    {
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {3, 4 , 5 };
        //unionHashSet(arr1,arr2);
        union(arr1, arr2);
    }
    
    public static void union(int arr1[],int arr2[])
    {
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                System.out.print(arr1[i]+" ");
                i++;
            }
            else if(arr1[i]>arr2[j])
            {
                System.out.print(arr2[j]+" ");
                j++;
            }
            else
            {
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }
        while(i<arr1.length)
        {
            System.out.print(arr1[i++]+" ");
        }
        while(j<arr2.length)
        {
            System.out.print(arr2[j++]+" ");
        }
    }
    
    public static void unionHashSet(int[] arr1,int[] arr2)
    {
        int m=arr1.length;
        int n=arr2.length;
        HashSet<Integer> list=new HashSet<>();
        for(int i=0;i<m;i++)
        {
            list.add(arr1[i]);
        }
        for(int i=0;i<n;i++)
        {
            list.add(arr2[i]);
        }
        System.out.println(list.toString());
    }
}
