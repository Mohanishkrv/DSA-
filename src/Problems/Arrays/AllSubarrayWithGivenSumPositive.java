// Java program to print all subarrays
// in the array which has sum 0
/**
 * @id 5a74713e-30df-40c1-9a2e-cd6328ae13ac
 * @name AllSubarrayWithGivenSumPositive
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
// User defined pair class

import java.util.ArrayList;

class Pair
{
    int x, y;
    Pair(int a,int b)
    {
        x=a;
        y=b;
    }
}
public class AllSubarrayWithGivenSumPositive
{
    public static void main(String[] args) {
        int arr[]={1,1,1,1,1,1};
        int sum=2;
        ArrayList<Pair> list=getSubArrayWithSum(arr, sum);
        for(int i=0;i<list.size();i++)
        {
            
            System.out.println(list.get(i).x +" "+ list.get(i).y);
        }
    }

    private static ArrayList<Pair> getSubArrayWithSum(int[] arr, int sum) 
    {
        ArrayList<Pair> l=new ArrayList<>();
        int currSum=arr[0];
        int start=0;
        for(int i=1;i<=arr.length;i++)
        {  
            while (currSum > sum && start < i - 1) 
            {
                currSum = currSum - arr[start];
                start++;
            }
            if (currSum == sum) 
            {
                l.add(new Pair(start,i-1));
                //System.out.println("Sum found between "+start +" and " + (i-1));
                //return true;
            }
            if (i < arr.length)
            {
                currSum = currSum + arr[i];
            }
        }
        //System.out.println("No SubArray Found");
        //return false;
        return l;
    }
}

/*
Above code wont handle negative No because of code @48
since iit wont be able to skip delete negative no from the array
*/