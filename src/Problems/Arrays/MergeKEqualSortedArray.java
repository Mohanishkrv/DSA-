/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @id beb85abd-f24a-4d97-80e0-08cb66f2dd13
 * @name MergeKEqualSortedArray
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
 * @author MOHANISH
 */
public class MergeKEqualSortedArray {
    static int N=4;
    public static void main(String[] args) {
        int arr[][] = { { 2, 6, 12, 34 },
                        { 1, 9, 20, 1000 },
                        { 23, 34, 90, 2000 } };
        int K=arr.length;
        int[] res=new int[N*K];
        mergeKArrays(arr,0,2,res);
        for(int i=0;i<N*K;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    //merges arr1 & arr2 into combining i.e. merges 2 array
    private static void mergeArrays(int[] arr1,int[] arr2, int N1, int N2, int[] combining) 
    {
        int i=0,j=0,k=0;
        while(i<N1 && j<N2)
        {
            if(arr1[i]<arr2[j])
            {
                combining[k]=arr1[i];
                i++;
            }
            else
            {
                combining[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<N1)
        {
            combining[k]=arr1[i];
            i++;
            k++;
        }
        while(j<N2)
        {
            combining[k]=arr2[j];
            j++;
            k++;
        }
    }
   
    //Main merge sort method
    private static void mergeKArrays(int[][] arr, int i, int j, int[] res) 
    {
        if(i==j)// if array is in range
        {
            for(int q=0;q<N;q++)
            {
                res[q]=arr[i][q];
            }
            return;
        }
        if(j-i==1) // if only 2 arrays are left merge them
        {
            mergeArrays(arr[i], arr[j],N,N, res);
            return;
        }
        int mid=(i+j)/2;
        int res1[]=new int[N* (mid-i+1)];
        int res2[]=new int[N*(j- mid)];
        mergeKArrays(arr, i, mid  , res1);
        mergeKArrays(arr, mid+1 ,j, res2);
        mergeArrays(res1, res2, N*(mid -i +1), N*(j-mid), res);
    }
}
