package Recursion;

public class fact {
    public static int factorial(int n)
    {
        int fact = 1;
        if(n == 0){
            return 1;
        }
        fact = n * factorial(n-1);
        return fact;
    }  
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
