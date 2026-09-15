/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 861f659a-3aec-4ce7-b44b-6015b0e5ecb9
 * @name Count Bits
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

package Bit_Manipulation;

/**
 *
 * @author ASUS
 */
public class Count_Bits 
{
    public static void main(String[] args)
    {
        int n=5;
        int count=0;
        while(n!=0)
        {
            count++;
            n>>=1;
        }
        System.out.println(count);
        //OR
        //System.out.println((int)(Math.log(no) / Math.log(2) + 1));
    }
}
