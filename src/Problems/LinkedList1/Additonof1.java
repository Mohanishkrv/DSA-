/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 33c542bf-b6cc-4fa6-b4ef-4caf2a27ac14
 * @name Additonof1
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

package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 *
 * A number (n) is represented in Linked List 
 * such that each digit corresponds to a
 * node in linked list. Add 1 to it.
 * @author Mohanish
 */

//Asked in AMAZON
public class Additonof1 {
public static void main(String args[]) throws IOException
{
   LinkedList<Integer> l=new LinkedList<Integer>();
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    String sp[]=s.trim().split("");
    for(int i=0;i<sp.length;i++)
    {
        l.add(Integer.parseInt(sp[i]));
    }
    int res=0;
    for(int i=0;i<l.size();i++)
    {
        res=(res*10)+l.get(i);
    }
    System.out.print(res+1);
    
    
    
    
    
    
    
    /*
    char sp[]=s.toCharArray();
    int a[]=new int[sp.length];
    for(int i=0;i<sp.length;i++)
    {
        l.add((int)sp[i]);
    }
    int res=0;
    for(int i=0;i<l.size();i++)
    {
        res=res*10+l.get(i);
        System.out.print((char)a[i]+" ");
    }
    System.out.println(res+1);
    */}
}
