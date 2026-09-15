/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id bb898e9e-44a4-4519-8ef7-8cf047ff9896
 * @name Decode the String
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

package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 *
 * @author ASUS
 */
public class Decode_the_String {
    
    public static  void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            Stack<String> stk=new Stack();
            String s[]=br.readLine().split("");
            for(int i=0;i<s.length;i++)
            {
                stk.push(s[i]);
            }
            System.out.println(Encoder(stk));
        }
    }
    
    public static String Encoder(Stack<String> stk)
    {
        String str="";
        while(!stk.isEmpty())
        {
            String x=stk.pop();
            char c=x.charAt(0);
            if(c==']')
            {
                stk.pop();
            }
            else if(c=='[')
            {
                stk.pop();
            }
            else if(Character.isDigit(c))
            {
                int y=Character.getNumericValue(c);
                String str2=str;
                for(int i=0;i<y;i++)
                {
                    str=str+str2;
                }
            }
            else if(Character.isAlphabetic(c))
            {
                str=str+x;
            }
            else
            {
                continue;
            }
            //System.out.print(c+" ");
        }
        return str;
    }
}
