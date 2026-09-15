/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @metadata-start
 * @id 89a264ab-125e-4538-8b71-92b6c3bcdcb5
 * @name Panagram
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

package String_Problems;

/**
 *
 * @author MOHANISH
 */
public class Panagram {
    public static void main(String[] args) {
        String s="The quick brown  o jumps over the lazy dog ";
        System.out.println(checkPanagram(s));
        missingCharTomakePanagram(s);
    }

    private static boolean checkPanagram(String s) 
    {
        boolean check[]=new boolean[26];
        for(int i=0;i<s.length();i++)
        {
            char ascii=s.charAt(i);
            int index;
            if(ascii>='A' && ascii<='Z')
            {
                index=ascii-'A';
            }
            else if(ascii>='a' && ascii<='z')
            {
                index=ascii-'a';
            }
            else
            {
                continue;
            }
            check[index]=true;
        }
        boolean b=true;
        for(int i=0;i<check.length;i++)
        {
            if(check[i]==false)
            {
                b= false;
            }
        }
        return b;
    }

    private static void missingCharTomakePanagram(String s) 
    {
        boolean check[]=new boolean[26];
        for(int i=0;i<s.length();i++)
        {
            char ascii=s.charAt(i);
            int index;
            if(ascii>='A' && ascii<='Z')
            {
                index=ascii-'A';
            }
            else if(ascii>='a' && ascii<='z')
            {
                index=ascii-'a';
            }
            else
            {
                continue;
            }
            check[index]=true;
        }
        for(int i=0;i<check.length;i++)
        {
            if(check[i]==false)
            {
                char x=(char) i;
                System.out.print(x+" ");
            }
        }
    }
    
}
