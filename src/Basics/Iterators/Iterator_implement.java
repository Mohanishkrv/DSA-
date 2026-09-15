/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @id 37c80fca-92ca-411b-8208-7efd5d828f0f
 * @name Iterator implement
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

package Iterators;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author ASUS
 */
public class Iterator_implement {
    public static void main(String[] args)
    {
        Stack a=new Stack<Integer>();
        a.push(1);
        a.push(2);
        a.push(3);
        a.peek();
        Iterator<Integer> it=a.iterator();
        System.out.print(it.next()+"");
        System.out.print(it.next()+"");
    }
}
