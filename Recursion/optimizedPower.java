package Recursion;

public class optimizedPower {
    public static int calPower(int a,int n){
    if(n==0){
        return 1;
    }
    int halfPower = calPower(a,n/2);
    int halfPowerSq = halfPower * halfPower;

    if(n%2 != 0){
        halfPowerSq = a*halfPowerSq;
    }

    return halfPowerSq;
}
    public static void main(String[] args) {
        System.out.println(calPower(2, 5));
    }
}
