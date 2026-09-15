/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 46127286-b1df-41e3-a3bf-ee1fb69d00b9
 * @name ReverseAString
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

package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 *
 * @author Mohanish
 */
public class ReverseAString {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t>0)
        {
            String s=br.readLine();
            Reverse(s);
            t--;
        }
    }

    private static void Reverse(String s) 
    {
        Stack st=new Stack();
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            st.push(a);
        }
        String n="";
        for(int i=0;i<s.length();i++)
        {
            char c=(char) st.pop();
            n=n+c;
        }
        System.out.print(n);
    }
    
}
