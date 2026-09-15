/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @metadata-start
 * @id 5fe5833c-c1ef-45c0-904d-741691c886a2
 * @name InitialsOfName
 * @description
 *
 * @topic Strings
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
public class InitialsOfName {
    public static void main(String[] args) {
        String s="Mohanish Kumar Verma";
        getInitials(s);
    }

    private static void getInitials(String s) 
    {
        String Words[]=s.split(" ");
        for(String w:Words)
        {
            System.out.print(w.charAt(0)+" ");
        }
    }
}
