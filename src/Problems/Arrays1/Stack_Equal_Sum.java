/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id aa23cdc6-8aed-421b-aa53-90529803f2d9
 * @name Stack Equal Sum
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

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * You have three stacks of cylinders where each cylinder has the same diameter,
 * but they may vary in height. You can change the height of a stack by removing and 
 * discarding its topmost cylinder any number of times.
  Find the maximum possible height of the stacks such that all of the stacks are exactly 
  * the same height. This means you must remove zero or more cylinders from the top 
  * of zero or more of the three stacks until they're all the same height, then print 
  * the height. The removals must be performed in such a way as to maximize the height.
  * Note: An empty stack is still a stack.
 *
 * @author Mohanish
 */
public class Stack_Equal_Sum {
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        int sum1=IntStream.of(h1).sum();
        int sum2=IntStream.of(h2).sum();
        int sum3=IntStream.of(h3).sum();
        int c1=0;
        int c2=0;
        int c3=0;
        
        int temp1=0;
        int temp2=0;
        int temp3=0;
        while(sum1!=sum2 || sum2!=sum3 || sum1!=sum3)
        {
            if(sum1>sum2 && sum1>sum3)
            {
                sum1=sum1-h1[temp1];   
                c1++;
                temp1++;
            }
            else if(sum2>sum1 && sum2>sum3)
            {
                sum2=sum2-h2[temp2];
                c2++;
                temp2++;
            }
            else
            {
                sum3=sum3-h3[temp3];
                c3++;
                temp3++;
            }
        }
        return sum1;
    }
    
 
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWrite = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner scanner=new Scanner(System.in);
        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
        }

        int[] h2 = new int[n2];

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
        }

        int[] h3 = new int[n3];

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
        }

        int result = equalStacks(h1, h2, h3);
        System.out.print(result);
    }
}
