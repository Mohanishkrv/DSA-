/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 0b2b6c7b-3e29-4ed8-91ce-f8541bebe72f
 * @name Count the Submatrices
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

package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *A matrix of size M*N where M and N are integers that denote the number of rows
 * and columns of the matrix respectively. The matrix contains
 * integer elements only. You are given an integer P.

Write a program to determine the number of submatrices of this matrix
* such that the sum of all the elements of a submatrix is divisible by P.
 * 
 * @author ASUS
 */
public class Count_the_Submatrices {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        int M=Integer.parseInt(s[0]);
        int N=Integer.parseInt(s[1]);
        int P=Integer.parseInt(s[2]);
        int a[][]=new int[M][N];
        for(int i=0;i<M;i++)
        {
            String s1[]=br.readLine().split(" ");
            for(int j=0;j<N;j++)
            {
                a[i][j]=Integer.parseInt(s1[j]);                
            }
        }
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
