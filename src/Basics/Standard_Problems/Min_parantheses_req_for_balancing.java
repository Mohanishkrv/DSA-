/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @metadata-start
 * @id 6d341051-2b27-40c4-bd3e-c24ddb7d611e
 * @name Min parantheses req for balancing
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

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Min_parantheses_req_for_balancing {
    /*public static void main(String[] args) throws Exception
    { 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().trim().split("");
        Stack stk=new Stack();
        stk.add(-1);
        int bal=0;
        int ans=0;
        for(int i=0;i<s.length;i++)
        {
            if(s[i].equals("("))
            {
                stk.add(s[i]);
            }
            if(stk.peek()=="-1")
            {
                ans++;
                bal++;
            }
        }
        System.out.print(ans+bal);
    }*/
    public static void main(String args[] ) throws Exception 
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        while(str.contains("()"))
        {
            str=str.replace("()","");
        }
System.out.print(str.length());

}
}
