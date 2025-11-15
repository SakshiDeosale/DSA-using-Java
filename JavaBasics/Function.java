// package JavaBasics;
// public class Function {
//     public static boolean isPrime(int n){
//         if(n==2){
//             return true;
//         }
//         for(int i=2;i<n;i++){
//             if(n%i == 0){
//              return false;
//             }
//         }
//         return true;
//     }

//     public static void primeRange(int n){
//         for(int i=2; i<=n; i++){
//             if(isPrime(i)){
//                 System.out.print(i+" ");
//             }
//         }
//     }

//     public static void BinDec(int n){
//         int binNum=n;
//         int DecNum=0;
//         int pow=0;
//         while(n>0){
//             int r = n%10;
//             DecNum = DecNum + r * (int)Math.pow(2,pow);
//             n= n/10;
//             pow++;
//         }
//         System.out.println("Decimal num of "+binNum+" is "+DecNum);
//     }
    
//     public static void DecBin(int n){
//         int MyBin=n;
//         int binNum=0;
//         int pow=0;
        
//         while(n>0){
//             int r = n%2;
//             binNum= binNum + r * (int)Math.pow(10,pow);
//             n= n/2;
//             pow++;
//         }
//         System.out.println("Decimal num of "+MyBin+" is "+binNum);
//     }
    
//     public static void main(String[] args) {
//         DecBin(11);
//     }
// }


 package JavaBasics;

public class Function {
   
    public static void Palindrome(int n){
        int myNum=n;
        int rev=0;
        while(n>0){
            int r = n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==myNum){
            System.out.println("It is palindrome number");
        }
        else{
            System.out.println("It is not palindrome number");
        }
    }
    public static void main(String[] args) {
        Palindrome(91);
    }
    
}