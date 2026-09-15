# Recursion

A recursive function solves a particular problem by calling a copy of itself and solving smaller subproblems of the original problems. Many more recursive calls can be generated as and when required. It is essential to know that we should provide a certain case in order to terminate this recursion process. So we can say that every time the function calls itself with a simpler version of the original problem.

## Algorithm : Steps
The algorithmic steps for implementing recursion in a function are as follows:

1. **Define a base case:** Identify the simplest case for which the solution is known or trivial. This is the stopping condition for the recursion, as it prevents the function from infinitely calling itself.

2. **Define a recursive case:** Define the problem in terms of smaller subproblems. Break the problem down into smaller versions of itself, and call the function recursively to solve each subproblem.

3. **Ensure the recursion terminates:** Make sure that the recursive function eventually reaches the base case, and does not enter an infinite loop.

4. **Combine the solutions:** Combine the solutions of the subproblems to solve the original problem.

### How are recursive functions stored in memory?

Recursion uses more memory, because the recursive function adds to the stack with each recursive call, and keeps the values there until the call is finished. The recursive function uses LIFO (LAST IN FIRST OUT) Structure just like the stack data structure.

### What is the base condition in recursion? 
In the recursive program, the solution to the base case is provided and the solution to the bigger problem is expressed in terms of smaller problems. 

### How a particular problem is solved using recursion? 
The idea is to represent a problem in terms of one or more smaller problems, and add one or more base conditions that stop the recursion. For example, we compute factorial n if we know the factorial of (n-1). The base case for factorial would be n = 0. We return 1 when n = 0. 

### Why Stack Overflow error occurs in recursion? 
If the base case is not reached or not defined, then the stack overflow problem may arise.

### What is the difference between direct and indirect recursion? 
A function fun is called direct recursive if it calls the same function fun. A function fun is called indirect recursive if it calls another function say fun_new and fun_new calls fun directly or indirectly.

### What is the difference between tailed and non-tailed recursion? 
A recursive function is tail recursive when a recursive call is the last thing executed by the function.