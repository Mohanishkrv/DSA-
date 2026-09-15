/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @id 7b9d8042-638b-4a0a-917c-9549654d1b78
 * @name CountPairsWithGivenSum
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

import java.util.HashMap;

/**
 *
 * @author MOHANISH
 */
public class CountPairsWithGivenSum { 
    public static void main(String[] args) {
        int arr[]={1,5,7,1,5,5};
        int sum=6;
        countPairs(arr,sum);
        
    }
    //Value as frequency and Key as main no
    public static void countPairs(int[] arr, int sum) 
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++)
            
        {
            if(h.containsKey(sum-arr[i]))
            {
                count+=h.get(sum-arr[i]);
            }
            if(h.containsValue(arr[i]))
            {
                h.put(arr[i],h.get(arr[i])+1);
            }
            else
            {
                h.put(arr[i], 1);
            }
        }
        System.out.println(count);
    }
    
}
