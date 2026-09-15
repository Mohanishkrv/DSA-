/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 95501b1b-0d99-4a84-af6f-92816ed180c4
 * @name nSmallestElement LargestElement
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

import java.util.Collections;
import java.util.PriorityQueue;

/**
 *
 * @author ASUS
 */
public class nSmallestElement_LargestElement {
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int k=3;
        kLargest(arr, k);
        ksmallest(arr, k);
    }

    public static void kLargest(int arr[],int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;++i)
        {
            pq.add(arr[i]);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        System.out.println(pq.peek());
    }
    
    public static void ksmallest(int[] arr,int k) 
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        System.out.println(pq.peek());
    }
    
}
