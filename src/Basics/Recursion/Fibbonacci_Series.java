/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 4ae967c3-ba54-441e-a18b-faea762289a3
 * @name Fibbonacci Series
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
public class Fibbonacci_Series {
    public static void main(String[] args)
    {
        int n=10;
        System.out.print(recfib(n));
    }
    
    public static int recfib(int n)
    {
        if(n==1 || n==2)
        {
            return n;
        }
        else
        {
            return recfib(n-1)+recfib(n-2);
        }
    }
}
