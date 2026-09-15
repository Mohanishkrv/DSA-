/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @metadata-start
 * @id c79f966b-307d-4608-92d6-c6fcc980fb3b
 * @name FirstNonRepeatingElement
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

import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author MOHANISH
 */
public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        int arr[]={-1, 2, -1, 3, 2};
        System.out.println(findNonRepeating(arr));
    }

    private static int findNonRepeating(int[] arr) 
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(h.containsKey(arr[i]))
            {
                h.put(arr[i], h.get(arr[i])+1);
            }
            else
            {
                h.put(arr[i],1);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(h.get(arr[i])==1)
            {
                return arr[i];
            }
        }
        return -1;
    }
}
