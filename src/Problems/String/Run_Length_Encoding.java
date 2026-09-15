/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id d652a30b-cbfe-47b1-8e63-2b00bc6069e4
 * @name Run Length Encoding
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

package String;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Run_Length_Encoding {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s=sc.nextLine();
            check(s);
        }
    }
    
    public static void check(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            
        }
    }
}
