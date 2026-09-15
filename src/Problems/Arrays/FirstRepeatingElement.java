/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @metadata-start
 * @id 69463d7f-3e50-4625-ae82-a73a17da76ca
 * @name FirstRepeatingElement
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

/**
 *
 * @author MOHANISH
 */
public class FirstRepeatingElement {
    public static void main(String[] args) {
        int arr[]={7, 4, 0, 9, 4, 8, 8, 2, 4, 5, 5, 1};
        System.out.println(firstRepeated(arr,arr.length));
    }
    public static int firstRepeated(int[] arr, int n) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(h.containsKey(arr[i]))
            {
                return (h.get(arr[i]));
            }
            else
            {
                h.put(arr[i],i);
            }
        }
        return -1;
    }
}
