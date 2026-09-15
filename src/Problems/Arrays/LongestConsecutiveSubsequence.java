/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @metadata-start
 * @id e465d9d2-5e86-40c0-ad41-a4d45bd33a69
 * @name LongestConsecutiveSubsequence
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

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author MOHANISH
 */
public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int arr[] = {2,6,1,9,4,5,3};
        getSubsequence(arr);
    }
    
    
    /*private static void getSubsequence(int[] arr) 
    {
        HashSet<Integer> h=new HashSet<>();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            h.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!h.contains(arr[i] - 1))
            {
                int j=arr[i];
                while(h.contains(j))
                {
                    j++;
                }
                if(count<j-arr[i])
                    count=j-arr[i];
            }
        }
        System.out.println(count);
    }*/
    
    //ONlogn O(1)
    private static void getSubsequence(int[] arr) 
    {
        Arrays.sort(arr);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                list.add(arr[i]);
            }
        }
        int count=0;
        int res=0;
        for(int i=0;i<list.size();i++)
        {
            if(i>0 && arr[i]==arr[i-1]+1 )
            {
                count++;
            }
            else
            {
                count=1;
            }
            res=Math.max(res, count);
        }
        System.out.println(res);
    }
}
