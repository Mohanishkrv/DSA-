/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id f91a9ad2-591d-40fc-8c71-bf7cb0b810d6
 * @name Reverse
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mohanish
 */
public class Reverse {
    public static void main (String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t>0)
		{
		    String s=br.readLine();
                    String s1[]=s.split("\\.");
                    int a=s1.length;
                    String ss="";
                    for(int i=a-1;i>=0;i--)//Conmmonn mistake made here
                     //(int i=a-1;i>=0;i--)==>>This results in array IndexOutofBounds
                     //bcoz String array starts from 0 to n-1    
                    {
                        ss=ss+s1[i]+".";
                    }
                    System.out.println(ss.substring(0,ss.length()-1));
		    t--;
		}
	}      
}
