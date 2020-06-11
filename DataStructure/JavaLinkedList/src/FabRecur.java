//Fibonacci Series using Recursion 
class FabRecur 
{ 
    static int fib(int n) 
    { 
    if (n <= 1) 
       return n;
    //System.err.print(n+"-");
    return fib(n-1) + fib(n-2); 
    } 
       
    public static void main (String args[]) 
    { 
    int n = 9; 
    System.out.println(fib(n)); 
    } 
} 