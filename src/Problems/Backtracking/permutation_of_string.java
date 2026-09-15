/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 61395b6b-602d-4f76-a71c-859f60cc6163
 * @name permutation of string
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

package Backtracking;

/**
 *print all the permutation  of a string ABC that does not contain
 * "AB"
 * 
 * @author ASUS
 */
public class permutation_of_string {
    public static void main(String[] args)
    {
        String s="ABC";
        int n=3;
        permute(s,"");
    }

    public static void permute(String s,String res) 
    {
        if(s.length()==0)
        {
            System.out.print(res+" ");
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            String ans=s.substring(0,i)+s.substring(i+1);
            permute(ans,res+c);
        }
    }

}
