/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id a4e165a3-53df-4cdc-8740-80907baf26d9
 * @name Rat Maze Problem
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

package Standard_Problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
//BACKTRACKING PROBLEM
public class Rat_Maze_Problem {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int maze[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            String s[]=br.readLine().split(" ");
            for(int j=0;j<n;j++)
            {
                maze[i][j]=Integer.parseInt(s[j]);
            }
        }
        
        getpath(maze,n);
        print(maze,n);
    }

    private static void print(int[][] maze,int n) 
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void getpath(int[][] maze, int n) 
    {
        int path[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                path[i][j]=0;
            }
        }
    }
    public static solve(int maze[][])
    {
        if(x==n-1 && )
    }
    
}
