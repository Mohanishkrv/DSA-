/*
 Implementing Stack using Singly Linked List
 for push , pop peek [S , T] = [O(1) , O(N)]
 */

/**
 * @metadata-start
 * @id 49b276da-97be-4b97-924b-9deeb50a5bda
 * @name LinkedList Implementation
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

package Stack;

class LinkedList_Implementation {
    public static void main(String[] args)
    {
        StackUsingLinkedlist stk = new StackUsingLinkedlist();
        stk.push(11);
        stk.push(22);
        stk.push(33);
        stk.push(44);
        stk.display();
        System.out.printf("\nTop element is %d\n",stk.peek());
        stk.pop();
        stk.pop();
        stk.display();
		System.out.printf("\nTop element is %d\n",stk.peek());
    }

}

class StackUsingLinkedlist {
    class Node 
	{
        int data;
        Node next;
    }

    Node top;
    StackUsingLinkedlist() { this.top = null; }
  
    public void push(int x) 
    {
        Node temp = new Node();
  	    if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }
		temp.data = x;
  		temp.next = top;
        top = temp;
    }
    
    public boolean isEmpty() { return top == null; }

	public int peek()
    {
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    
    public void pop() 
    {
        if (top == null) 
		{
            System.out.print("\nStack Underflow");
            return;
        }
        top = top.next;
    }
  
    public void display()
    {
        if (top == null) {
            System.out.printf("\nStack Underflow");
            return;
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data);
                temp = temp.next;
                if(temp != null)
                    System.out.print(" -> ");
            }
        }
    }

}