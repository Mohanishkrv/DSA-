
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 45ff7fff-5679-4f0b-b823-13c461a8ef6f
 * @name Anagrams
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

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given two strings, a and b , that may or may not be of the same length, determine 
 * the minimum number of character deletions required to make a and b anagrams. Any 
 * characters can be deleted from either of the strings
 *
 * @author Mohanish
 */
public class Anagrams {
    
    public static void main(String args[] ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    for(int i = 0; i < test; i++)
    {
        boolean bool=true;
        String a = sc.next();
        String b = sc.next();
        char c1[]=a.toCharArray();
        char c2[]=b.toCharArray();
        if(a.length()!=b.length())
        {
            bool=false;
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(i=0;i<c1.length;i++)
        {
            if(c1[i]!=c2[i])
            {
                bool=false;
            }
        }
        System.out.print(bool);
        test--;
    }
    }
}
