/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id af528c7f-815c-4441-82fb-801f1747423e
 * @name No having nbitSet
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

package Bit_Manipulation;

/**
 *
 * @author ASUS
 */
public class No_having_nbitSet {
    static void printTheArray(int arr[], int n) 
    { 
    for (int i = 0; i < n; i++)  
    { 
        System.out.print(arr[i]+" "); 
    } 
    System.out.println(); 
    } 
  
// Function to generate all binary strings 
static void generateAllBinaryStrings(int n,int arr[], int i) 
{ 
    if (i == n)  
    { 
        printTheArray(arr, n); 
        return; 
    } 
  
    // First assign "0" at ith position 
    // and try for all other permutations 
    // for remaining positions 
    arr[i] = 0; 
    generateAllBinaryStrings(n, arr, i + 1); 
  
    // And then assign "1" at ith position 
    // and try for all other permutations 
    // for remaining positions 
    arr[i] = 1; 
    generateAllBinaryStrings(n, arr, i + 1); 
} 
  
// Driver Code 
    public static void main(String args[]) 
    { 
        int n = 4; 
        int[] arr = new int[n];   
        // Print all binary strings 
        generateAllBinaryStrings(n, arr, 0);    
    }   
}
