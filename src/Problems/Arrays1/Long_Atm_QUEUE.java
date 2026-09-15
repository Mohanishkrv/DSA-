/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 88d9c7fe-9deb-4b97-b9c7-d9c48450cc5a
 * @name Long Atm QUEUE
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

package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mohanish
 */
public class Long_Atm_QUEUE {
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n=Integer.parseInt(br.readLine());
    String s1[]=br.readLine().split(" ");
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=Integer.parseInt(s1[i]);
    }
    int c=1;
    for(int i=0;i<n-2;i++)
    {
        int p=a[i];
        int q=a[i+1];
        int r=a[i+2];
        if((p>q && q<r) || (p>q && q<r) ||(p<q && q>r) || (p>q && q<r))
        {
            c++;
        }
     }
    }
}
