package Recursion;

public class incAndDec {
    public static void indOrder(int n){
        if(n==1){
            System.out.println(1);
            return;            
        }
        indOrder(n-1);
        System.out.println(n);
    }

    public static void decOrder(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        decOrder(n-1);
    }
    
    public static void main(String[] args) {
        indOrder(5);
        decOrder(5);
    }
}
