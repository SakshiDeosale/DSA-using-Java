package Array.twoDarray;
import java.util.*;
// public class demo {

//     public static boolean search(int arr[][]){
//         int n=arr.length;
//         int m =arr.length;
//         int key =4;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//               if(arr[i][j] == key){
//                 System.out.println("found at cell ("+i+","+j+")");
//                 return true;
//               }
//             }
//     }
//     System.out.println("Key not found");
//     return false;
// }

//      public static void print(int arr[][]){
//         int n=arr.length;
//         int m =arr[0].length;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//      }
//     }
//     public static void main(String[] args) {
//         int arr[][] = new int[3][3];
//         Scanner sc = new Scanner(System.in);
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 System.out.print("Enter num:");
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         print(arr);
//         search(arr);
//     }
// }


public class demo{
   
    public static int removeDuplicates(int[] nums) {
        int largest = Integer.MIN_VALUE;
         for(int i=0; i<nums.length; i++){
            largest = Math.max(largest, nums[i]);

        }
        int count[] = new int[largest+1];
        for(int i=0; i<nums.length; i++){
           count[nums[i]]++;
        }
        int j=0;
   
        int c = 0;
        for(int i=0; i<count.length; i++){
            if(count[i] > 0){
                nums[j] = i;
                c++;
                j++;
            }   
        }
        
     
        return c;
    }
       
        


 public static void main(String[] args) {
    int nums[] = {0,0,1,1,2,3,3,3,4,4};
    System.out.println(removeDuplicates(nums));
    
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    // print(nums);
 }
}