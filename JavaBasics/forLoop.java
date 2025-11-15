package JavaBasics;
import java.util.*;

// public class forLoop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number:");
//         int n = sc.nextInt();
        
//         int rev = 0;
//         while (n>0) {
//             int r = n%10;
//             rev = rev*10 + r;
//             n=n/10;
//         }
//         System.out.println("Reverse number : "+rev);
//     }
// }


// public class forLoop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         do{
//             System.out.println("Enter number");
//             int n = sc.nextInt();

//             if(n%10 == 0){
//                 continue;
//             }

//             System.out.println("number was:"+n);
//         }while(true);
//     }
// }

// public class forLoop {
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             System.out.print("Enter number:");
//             int n = sc.nextInt();

//             int count = 0;
//             for(int i=2;i<=n;i++){
//                 if(n%i==0){
//                     count++;
//                 }
//             }
//             if(count==1){
//                  System.out.println("It is prime number");
//             }
//             else{
//                 System.out.println("not Prime");
//             }

//         }
// }

//Star Pattern
// public class forLoop {
//     public static void main(String[] args) {
//         for(int i=5;i>=1;i--){
//             for(int j=i;j>=1;j--){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
// }


// public class forLoop{
//     public static void main(String[] args){
//         for(int i=1;i<=6;i++){
//             for(int j=i-1;j>=1;j--){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// public class forLoop {

//     public static void main(String[] args) {
//         for(int i=1; i<=100; i++){
//             int num = i;
//             int rev=0;
//             while(num>0){
//                 int r= num%10;
//                 rev=rev*10+r;
//                 num=num/10;
//             }
//             if(rev==i){
//                 System.out.println(i);
//             }
//         }
//     }
// }


//     *
//    **
//   ***
//  ****
// *****
// public class forLoop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n:");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class forLoop {

//     public static void main(String[] args) {
//         for(int i=5; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
// public class forLoop {

//     public static void main(String[] args) {
//         int t=1;
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(t+" ");
//                 t++;
//             }
//             System.out.println();
//         }
//     }
// }

// 1
// 01
// 101
// 0101
// 10101
// public class forLoop {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 if((i+j) % 
//                 2 == 0){
//                     System.out.print("1");
//                 }else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

//Hollow rectange
// public class forLoop {

//     public static void main(String[] args) {
//         int n=5;
//         for(int i=n; i>=1; i--){
//             //space
//             for(int j=1; j<i; j++){
//                 System.out.print(" ");
//             }
//             //star
//             for(int j=1; j<=n; j++){
//                 if(i==1 || i==n || j==1 || j==n){
//                 System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

//diamond shape 
public class forLoop{
    public static void main(String args[]){
       int n = 5;

       //upper
       for(int i=1; i<=n; i++){
        //space
        for(int s=n-1; s>=i; s--){
            System.out.print(" ");
        }

        //stars
        for(int j=1; j<=2*i-1; j++){
            System.out.print("*");
        }
        System.out.println();
       }

       //lower
       for(int i=n-1; i>=1; i--){
        
        //space
        for(int s=n-i; s>0; s--){
            System.out.print(" ");
        }

        //stars
        for(int j=1; j<=2*i-1; j++){
            System.out.print("*");
        }
        System.out.println();
       }

    }
}