/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id c8f2186e-e809-45f5-9d07-d53aa0060a7b
 * @name Array HelpJarvis
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
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Mohanish
 */
public class Array_HelpJarvis {
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t>0)
        {      
            int i;
            int a[]=new int[4];
            String as=br.readLine();
            char c[]=as.toCharArray();
            boolean flag=true;
            Arrays.sort(c);
            for(i=0;i<c.length-1;i++)
            {
                if(c[i+1]-c[i]!=1)
                {
                    flag=false;
                }
            }
            if(flag=true)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            t--; 
        }   
    }
    
}
