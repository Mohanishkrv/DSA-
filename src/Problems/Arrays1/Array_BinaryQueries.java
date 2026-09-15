/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 75e8b161-45a2-4a7a-bd60-71e59ce63f38
 * @name Array BinaryQueries
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
public class Array_BinaryQueries {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nq = br.readLine(); 
        String nqs[]=nq.trim().split(" ");
        int n=Integer.parseInt(nqs[0]);
        int q=Integer.parseInt(nqs[1]);

        String no=br.readLine();
        String nos[]=no.trim().split(" ");
        int nn[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nn[i]=Integer.parseInt(nos[i]);
        }

        while(q>0)
        {
            String qe=br.readLine();
            String qs[]=qe.trim().split(" ");
            int p=Integer.parseInt(qs[0]);
            
            if(p==1)
            {
                int u=Integer.parseInt(qs[1]);
                if(nn[u]==0)
                {
                    nn[u]=1;
                }
                if(nn[u]==1)
                {
                    nn[u]=0;
                }
            }

            if(p==0)
            {
                int l=Integer.parseInt(qs[1]);
                int r=Integer.parseInt(qs[2]);
                int sum=0;
               /* for(int i=l-1;i<=r-1;i++)
                {
                    int qa=(int) Math.pow(2,i);
                    sum+=qa;
                }
                if(sum%2==0)
                {
                    System.out.println("EVEN");
                }
                else
                {
                    System.out.println("ODD");
                }*/
                if(nn[r]==1)
                {
                     System.out.println("EVEN");
                }
                else
                {
                     System.out.println("ODD");
                }
            }
            q--;
        }              
    }
}
    

