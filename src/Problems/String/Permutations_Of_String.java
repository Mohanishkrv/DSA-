/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id f2fafb88-ff8e-4d2a-bf83-22dce0e59222
 * @name Permutations Of String
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

package String;

import java.io.*;

/**
 *Backtracking Problem
 * @author Mohanish
 */
public class Permutations_Of_String 
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        printperm(s,"");
    }

    private static void printperm(String s,String ans) 
    {
        if(s.length()==0)
        {
            System.out.print(ans+" ");
        }
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            String res=s.substring(0, i)+s.substring(i+1);
            printperm(res,ans+c);
        }
    }    
}
