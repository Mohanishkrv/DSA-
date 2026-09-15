/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @id e5583677-a228-408a-a479-c8aa145caefa
 * @name IsInt IsString
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

package String_Problems;

/**
 *
 * @author MOHANISH
 */
public class IsInt_IsString {
    public static void main(String[] args) {
        String n="123";
        String s="as11";
        check(s);
    }

    private static void check(String s) 
    {
        try
        {
            Integer.parseInt(s);
            System.out.println("Integer");
        }
        catch(Exception e)
        {
            System.out.println("String");
        }
    }
}
