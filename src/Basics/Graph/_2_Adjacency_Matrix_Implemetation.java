/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 78efa06f-9d09-4553-bb6f-e956e0cfa937
 * @name 2 Adjacency Matrix Implemetation
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

package Graph;

/**
 *
 * @author ASUS
 */
public class _2_Adjacency_Matrix_Implemetation {
    boolean adjMat[][];
    int V;
    
    public _2_Adjacency_Matrix_Implemetation(int V)
    {
        this.V=V;
        adjMat=new boolean[V][V];
    }
    
    public void addEdge(int i,int j)
    {
        adjMat[i][j]=true;
        adjMat[j][i]=true;
    }
    
    public void removeEdge(int i,int j)
    {
        adjMat[i][j]=false;
        adjMat[j][i]=false;
    }
    
    public static void main(String[] args)
    {
        _2_Adjacency_Matrix_Implemetation g=new _2_Adjacency_Matrix_Implemetation(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        for(int i=0;i<g.V;i++)
        {
            for(int j=0;j<g.V;j++)
            {
                System.out.print(g.adjMat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
