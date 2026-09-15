/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @id 40181144-fb3c-4900-a1cb-8ecee16531f4
 * @name AllSubArraywithSumZero
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author MOHANISH
 */
class Pair
{
    int x,y;
    Pair(int a,int b)
    {
        x=a;
        y=b;
    }
}

public class AllSubArraywithSumZero {
    public static void main(String[] args) {
        int arr[]={6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        ArrayList<Pair> res=getSubArray(arr);
        for(int i=0;i<res.size();i++)
        {
            System.out.println(res.get(i).x+" - "+res.get(i).y);
        }
    }
    
    public static boolean getZeroSum(int arr[])
    {
        HashSet<Integer> h=new HashSet<>();
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(arr[i]==0 || sum==0 || h.contains(sum))
                return true;
            h.add(sum);
        }
        return false;
    }
    
    private static ArrayList<Pair> getSubArray(int[] arr) 
    {
        HashMap<Integer,ArrayList<Integer>> h=new HashMap<>();
        ArrayList<Pair> list=new ArrayList<>();
        int currSum=0;
        for(int i=0;i<arr.length;i++)
        {
            currSum+=arr[i];
            if(currSum==0)
            {
                list.add(new Pair(0,i));
            }
            ArrayList<Integer> flag=new ArrayList<>();
            //if currSum exists then there exist at least one sub array with zero sum
            if(h.containsKey(currSum))
            {
                flag=h.get(currSum);
                for(int j=0;j<flag.size();i++)
                {
                    list.add(new Pair(flag.get(j) + 1 , i));
                }
            }
            flag.add(i);
            h.put(currSum,flag);
        }
        return list;
    }
}
