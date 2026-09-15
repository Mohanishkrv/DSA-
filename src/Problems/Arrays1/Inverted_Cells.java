/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 07c77fe2-f4cd-4f07-8fbc-d1aee7ab81a3
 * @name Inverted Cells
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
 *
 * @author ASUS
 */
public class Inverted_Cells {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        int a[][]=new int[n][m];
        a[0][0]=0;
        int x=0;
        for(int i=0;i<n;i++)
        {
            String s1[]=br.readLine().split(" ");
            for(int j=0;j<m;j++)
            {
                if(s1[j].equals("#"))
                {
                    a[i][j]=x;
                    if(x==1)
                    {
                        x=0; 
                    }
                    if(x==0)
                    {
                        x=1;
                    }
                }
                else
                {
                    a[i][j]=x;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }        
    }
}
