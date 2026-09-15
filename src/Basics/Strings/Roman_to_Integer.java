/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id abdb21b1-cc73-4c06-a807-ba25c1b73c99
 * @name Roman to Integer
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

package String_Problems;

/**
 *
 * @author ASUS
 */

public class Roman_to_Integer {
    
    public static int vals(char s)
    {
        switch(s)
        {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
        }
        return -1;
    }
    
    public static int toInteger(String str)
    {
        int res=0;
        for(int i=0;i<str.length();i++)
        {
            //getting value of s[i]
            int s1=vals(str.charAt(i));
            if((i+1) < str.length())
            {
                //getting value of s[i+1]
                int s2=vals(str.charAt(i));
                //Comparing both values
                if(s1>=s2)
                {
                    //comparison of current symbol(s1) and next symbol(s2)
                    res=res+s1;
                }
                else
                {
                    res=res+s2-s1;
                    i++;
                }
            }
            else
            {
                res=res+s1;
            }
        }
        return res;
    }
    
    public static void main(String[] args)
    {
        Roman_to_Integer r=new Roman_to_Integer();
        String str = "XXIV";
        System.out.println("Integer form of Roman Numeral"+ " is "+r.toInteger(str));
    }
}
