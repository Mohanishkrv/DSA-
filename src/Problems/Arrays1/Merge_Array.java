/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id ed308883-2b63-4e18-8f81-9b5a91ff17d5
 * @name Merge Array
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

package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Mohanish
 */
public class Merge_Array {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1=br.readLine();
            String s11[]=s1.split(" ");
            int a[]=new int[s11.length];
            int al=a.length;
            for(int i=0;i<al;i++)
            {
                a[i]=Integer.parseInt(s11[i]);
            }
        String s2=br.readLine();
        String s22[]=s2.split(" ");
        int b[]=new int[s22.length];         
        int bl=b.length;
        
            for(int i=0;i<bl;i++)
            {
                b[i]=Integer.parseInt(s22[i]);
            }
        int c[]=new int[al+bl];
        System.arraycopy(a, 0,c, 0, al);
        System.arraycopy(b, 0,c,al,bl);
        System.out.print(Arrays.toString(c));
    }
     
   
}
