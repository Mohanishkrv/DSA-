/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @metadata-start
 * @id 9c44af96-9cdd-4409-8ede-ebcb6ae47763
 * @name Union And Intersection3Arrays
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

package Array_Problems;

import java.util.ArrayList;

/**
 *
 * @author MOHANISH
 */
public class Union_And_Intersection3Arrays {
    public static void main(String[] args) {
    int A[] = {1, 5, 10, 20, 40, 80};
    int B[] = {6, 7, 20, 80, 100};
    int C[] = {3, 4, 15, 20, 30, 70, 80, 120};
    //union(A,B,C);
    intersection(A,B,C);
    }

    private static void union(int[] A, int[] B, int[] C) 
    {
        int i=0,j=0,k=0;
        while(i<A.length && j<B.length && k<C.length)
        {
            if(A[i]<B[j] && A[i]<C[k])
            {
                System.out.print(A[i]+" ");
                i++;
            }
            else if(B[j]<A[i] && B[j]<C[k])
            {
                System.out.print(B[j]+" ");
                j++;
            }
            else if(C[k]<A[i] &&  C[k]<B[j])
            {
                System.out.print(C[k]+" ");
                k++;
            }
            else if(A[i]==B[j])
            {
                i++;
                j++;
            }
            else if(A[i]==C[k])
            {
                i++;
                k++;
            }
            else if(B[j]==C[k])
            {
                j++;
                k++;
            }
            else
            {
                i++;
                j++;
                k++;
            }
            
        }
        while(i<A.length)
        {
            System.out.print(A[i++]+" ");
        }
        while(j<B.length)
        {
            System.out.print(B[j++]+" ");
        }
        while(k<C.length)
        {
            System.out.print(C[k++]+" ");
        }
    }

    private static void intersection(int[] A, int[] B, int[] C) 
    {
        ArrayList<Integer> l=new ArrayList<>();
        int i=0,j=0,k=0;
        while(i<A.length && j<B.length && k<C.length)
        {
            if(A[i]==B[j] && B[j]==C[k])
            {
                if(!l.contains(A[i]))
                {
                    l.add(A[i]);
                }
                i++;
                j++;
                k++;
            }
            else if(A[i]<B[j])
            {
                i++;
            }
            else if(B[j]<C[k])
            {
                j++;
            }
            else
            {
                k++;
            }
        }
    }
}
