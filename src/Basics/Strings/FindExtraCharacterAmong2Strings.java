/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @metadata-start
 * @id 9fcb5819-2670-471e-a930-87f6f8f6f3a8
 * @name FindExtraCharacterAmong2Strings
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

package String_Problems;

/**
 *
 * @author MOHANISH
 */
public class FindExtraCharacterAmong2Strings {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="abcde";
        System.out.println(getExtraChar(s1,s2));
    }

    private static char getExtraChar(String s1, String s2) 
    {
        int i=0,j=0;
        int sum1=0,sum2=0;
        //System.out.println((int)s1.charAt(i));
        while(i<s1.length())
        {
            sum1+=(int)s1.charAt(i++);
        }
        while(j<s2.length())
        {
            sum2+=(int)s2.charAt(j++);
        }
        //System.out.println(sum1+" "+sum2);
        return (char) ((char)sum2-sum1);
    }
}
