/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 66096623-cb38-489d-b800-e5655688945b
 * @name StrPalindrome
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

package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 *
 * @author Mohanish
 */
public class StrPalindrome {
    public static void main(String []args) throws IOException
    {
        LinkedList l=new LinkedList();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            
        //Input String in n sized Linked list
        int n=Integer.parseInt(br.readLine());
        String s=br.readLine();
        String sp[]=s.trim().split(" ");
        for(int i=0;i<n;i++)
        {
            l.add(sp[i]);
        }
        //System.out.print(l);
        String str[]=new String[n];
        String res="";
        for(int i=0;i<n;i++)
        {
            str[i]=(String)l.get(i);
            res+=str[i];
        }
        //System.out.print(res);
        boolean a=true;
        for(int i=0;i<n/2;i++)
        {
            if(res.charAt(i)==res.charAt((n-1)-i))
            {
                a=true;
            }
            else
            {
                a=false;
            }
        }
        System.out.print(a);
    }    
}
