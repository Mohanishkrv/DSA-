/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @id b13d71b0-49fc-433d-97a3-0d3462b619f1
 * @name PrintDuplicateUnsortedArray
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
import java.util.Map.Entry;

/**
 *
 * @author MOHANISH
 */
public class PrintDuplicateUnsortedArray {
    public static void main(String[] args) {
        int arr[]={1,9,9,4,1,2,4,5,1,6,8};
        printDup(arr);
    }

    private static void printDup(int[] arr) 
            
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(h.containsKey(arr[i]))
            {
                h.put(arr[i],h.get(arr[i])+1);
            }
            else
            {
                h.put(arr[i], 1);
            }
        }
        boolean duplicate=false;
        for(Entry<Integer,Integer> i:h.entrySet())
        {
            if(i.getValue()>1)
                System.out.print(i.getKey()+" ");
                duplicate=true;
        }
        if(duplicate==false)
            System.out.println("No Duplicates");
    }
}
