package Array;

import java.util.Scanner;
public class largest {
    public static int largest1(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element in array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter number:");
            arr[i] = sc.nextInt();
        }
        int largestNum = largest1(arr);
        System.out.println("largest number is:"+largestNum);
    }
}
