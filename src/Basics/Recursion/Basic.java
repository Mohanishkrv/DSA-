/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 9d177122-2853-4ff5-b00d-f79167df70a4
 * @name Basic
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

package Recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author ASUS
 */
public class Basic {
    
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        rec(n);
    }
    
    public static int rec(int n)
    {
        if(n==0)
        {
            return n;
        }
        System.out.print(n+" ");
        return rec(n-1);
    }
}