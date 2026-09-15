/*
Array Implementation of Stacks

*global variable top

Space Complextiy    : O(1)
Time Complexity     : O(1) 

*/

/**
 * @id 78170232-bbe1-4343-ac61-eb09e699f67d
 * @name Array Implementation
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

package Stack;

class Array_Implementation
{
	int MAX = 1000;
	int stk[] =new int[MAX];
	static int top = -1;

	public static void main(String[] args) 
	{
		Array_Implementation stk=new Array_Implementation();
		stk.push(1);
		stk.pop();
		stk.peek();
		System.out.println(top);	
	}

	public void push(int value)
	{
		if(top>MAX)
		{
			System.out.println("Stack Overflow/isFull");
			return;
		}
		stk[++top] = value;
	}

	private void pop() {
		if(top<-1)
		{
			System.out.println("Stack Underflow/isEmpty");
			return;
		}
	}

	private void peek() {
		if(top == -1)
		{
			System.out.println("Stack Underflow");
			return;
		}
		System.out.println(stk[top]);
	}

}