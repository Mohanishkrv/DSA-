/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 563fe498-2b1a-4a8c-92a3-98473dbfaedc
 * @name Sort012
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

package Array_Problems;

/**
 *
 * @author ASUS
 */
public class Sort012 {
    public static void main(String[] args)
    {
        int arr[]={0,2,1,2,0};
        sort01(arr);
    }
    
    private static void sort01(int[] arr) 
    {
        int c[]={0,0,0};
        for(int i=0;i<arr.length;i++)
        {
            switch(arr[i])
            {
                case 0:c[0]++;
                    break;
                case 1:c[1]++;
                    break;
                case 2:c[2]++;
                    break;   
            }
        }
        //System.out.println(c[0]+" "+c[1]+" "+c[2]);
        int x=0;
        while(x<=2)
        {
            for(int i=0;i<c[x];i++)
            {
                System.out.print(x+" ");
            }
            x++;
        }
    }
}
