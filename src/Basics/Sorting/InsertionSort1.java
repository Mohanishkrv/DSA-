/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id e9693847-0e16-4b95-bb12-b4af702e4be0
 * @name InsertionSort1
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

package Sorting;

import java.util.Scanner;

/**
 *
 * @author Mohanish
 */
public class InsertionSort {
    void insertion(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=key;
        }
        print(a);
    }
    
    void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            
            System.out.print(a[i]+" ");
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String sa[]=st.split(" ");
        int a[]=new int[sa.length];
        for(int i=0;i<sa.length;i++)
        {
            a[i]=Integer.parseInt(sa[i]);
        }
        InsertionSort is=new InsertionSort();
        is.insertion(a);
    }
}
