/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 20467d24-52f4-421d-98db-13b5210c58ed
 * @name RomanNo
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

import java.io.*;

/**
 *
 * @author Mohanish
 */
public class RomanNo {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        System.out.print(convert(s));
    }
    public static int dic(char a)
    {
            switch(a)
            {
                case 'I':return 1;
                case 'V':return 5;
                case 'x':return 10;                   
                case 'L':return 50;
                case 'C':return 100;
                case 'D':return 500;
                case 'M':return 1000;
            }
        return -1;
    }

    private static int convert(String s)
    {
        int res=0;
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            int c1=dic(s.charAt(i));
            if(i+1<len)
            {
                int c2=dic(s.charAt(i+1));
                if(c1>=c2)
                {
                    res+=c1;
                }
                else
                {
                    res+=c2-c1;
                    i++;
                }
            }
            else
            {
                res+=c1;
            }
        }
        return res;
    }
    
}
