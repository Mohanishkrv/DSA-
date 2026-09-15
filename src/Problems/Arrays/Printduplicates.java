/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @id b07ee82b-26b2-4778-b875-a124fc0949d5
 * @name Printduplicates
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

import java.util.HashSet;

/**
 *
 * @author MOHANISH
 */
public class Printduplicates {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,5,1};
        duplicateElements(arr);
    }

    private static void duplicateElements(int[] arr) 
    {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(h.add(arr[i])==false)
            {
                System.out.println(arr[i]);
            }
        }
    }
    
}
