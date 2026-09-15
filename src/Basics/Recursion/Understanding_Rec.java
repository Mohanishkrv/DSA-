/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 882fc5f3-b33e-4c69-af74-1d3ce7830554
 * @name Understanding Rec
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

package Recursion;

/**
 *
 * @author ASUS
 */
public class Understanding_Rec {
 
    public static int recur(int i, int nesting)
    {
        int c;
        for(c=0;c<nesting;c++) 
        { 
            System.out.print(" ");
        }
        System.out.println("recur"+nesting+" "+i);
        if (i < 3)
        {
            System.out.println("i <3, calling recur"+(nesting+1)+" "+(i+1));
            recur(i + 1, nesting+1);
            for(c=0;c<nesting;c++) 
            {
                System.out.printf(" ");
            }
            System.out.println("returning 10 from recur"+nesting+"with i=="+i);
            return 10;
        }
    else if (i < 5)
    {
        int j=0;
        System.out.println("i <5, calling recur"+(nesting+1)+" "+(i +1));
        j=recur(i + 1, nesting+1);
        for(c=0;c<nesting;c++) 
        {
            System.out.printf(" ");
        }
        System.out.println("ignored return value from recur"+(nesting+1)+" "+(i+1)+"is"+j);
    }
    System.out.println();
    for(c=0;c<nesting;c++) 
    {
        System.out.printf(" ");
    }
    System.out.println("returning i from recur"+nesting+"with i=="+i);
    return i;
}

    public static void main(String[] args)
    {
        int i=0;
        i = recur(i, 0);
        System.out.printf("the last return value did not get ignored: i = "+i);
    }   
}
