/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 92b72644-1d37-408a-9656-c369ba15fc44
 * @name Special ReversedLL
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
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * You are given a linked list that contains N
integers. You have performed the following reverse operation on the list:
-->Select all the subparts of the list that contain only even integers. For example, if the list is 
{1,2,8,9,12,16}, then the selected subparts{2,8} and {12,16} will be,.
Reverse the selected subpart such as {8,2},{16,12}
and

    .

Now, you are required to retrieve the original list.
 *
 * @author ASUS
 */
public class Special_ReversedLL {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s[]=br.readLine().split(" ");
        LinkedList<Integer> l=new LinkedList();
        for(int i=0;i<s.length;i++)
        {
            l.add(Integer.parseInt(s[i]));
        }
        getLL(n,l);
    }
    
    public static void getLL(int n,LinkedList<Integer> l)
    {
        LinkedList<Integer> res=new LinkedList();
        LinkedList<Integer> rev=new LinkedList();
        for(int i=0;i<l.size();i++)
        {
            if(even(l.get(i)) )
            {
                rev.add(l.get(i));
            }
            else
            {
                res=reverse(rev);
                for(int j=0;j<res.size();j++)
                {
                    System.out.print(res.get(j)+" ");
                }
                rev.removeAll(rev);
                res.removeAll(res);
                System.out.print(l.get(i)+" ");
            }
            if(i==l.size()-1)
            {
                res=reverse(rev);
                for(int j=0;j<res.size();j++)
                {
                    System.out.print(res.get(j)+" ");
                }
            }            
        }
    }
    
    public static LinkedList reverse(LinkedList<Integer> rev)
    {
        LinkedList<Integer> reversed=new LinkedList();
        for(int i=0;i<rev.size();i++)
        {
            int x=rev.get(rev.size()-i-1);
            reversed.add(x);
        }
        return reversed;
    }
    
    public static boolean even(int no)
    {
        if(no%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
