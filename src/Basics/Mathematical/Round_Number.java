/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @id ce4331ae-fa0e-47b7-bc44-5cb3f3e8e057
 * @name Round Number
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

package Math;

/**
 *
 * @author MOHANISH
 */
public class Round_Number {
    public static void main(String[] args) {
        int n=128;
        System.out.println(roundNo(n));
    }

    private static int roundNo(int n) 
    {
        int a=(n/10) *10;
        int b=a+10;
        return ( (n-a)>(b-n) ? b : a );
    }
}
