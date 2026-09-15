/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 0487e900-9375-4b99-ac94-3bbf8a91b472
 * @name Divisibility by 8
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

package Maths;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class Divisibility_by_8 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int x=Character.getNumericValue(s.charAt(s.length()-1));
        int y=Character.getNumericValue(s.charAt(s.length()-2));
        int z=Character.getNumericValue(s.charAt(s.length()-3));
        int res=z*100+y*10+x;
        if(res%8==0)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}
