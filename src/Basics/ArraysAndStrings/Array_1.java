/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 1aa743b8-d7b5-491f-9f56-370cf4696f3b
 * @name Array 1
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

package Arrays;
import java.util.Scanner;
/**
 *
 * @author Mohanish
 */
public class Array_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter Array Size");
        int s=sc.nextInt();
      
        int[] a=new int[s];
        System.out.println("Enter Elements");
        for(int i=0;i<s;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Output");
        for(int i=0;i<s;i++)
        {
            System.out.println(a[i]);
        }
    }
}
