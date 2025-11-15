// import java.util.*;
// public class FirstProgram {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a:");
//         int a = sc.nextInt();

//         System.out.println("Enter b:");
//         int b = sc.nextInt();

//         int sum = a+b;
//         System.out.println("Sum="+sum);
//     }
// }

import java.util.*;
public class FirstProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pencil price:");
        float a = sc.nextFloat();
        System.out.println("Enter eraser price:");
        float b = sc.nextFloat();
        System.out.println("Enter pen price:");
        float c = sc.nextFloat();

        float sum = a+b+c;

        float gst = sum+sum*0.18f;
           
        System.out.println(gst);
        
    }
}