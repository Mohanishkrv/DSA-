/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id c8d6c60e-ed96-4ea1-8d08-9f56a135f470
 * @name Substring
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mohanish
 */
public class Substring {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int len=s.length();
        String ss[]=new String[len*((len+1)/2)];
        int temp=0;
        for(int i=0;i<len;i++)
        {
            for(int j=i;j<len;j++)
            {
                ss[temp]=s.substring(i,j+1);
                temp++;
            }
        }
        for(int i=0;i<ss.length;i++)
        {
            System.out.print(ss[i]+"  ");
        }
    }
    
}
