package Array;

// public class subarraySum {
    
//     public static void subarray(int num[]){
//         int maxSum = Integer.MIN_VALUE;
//         for(int i=0; i<num.length; i++){
//             for(int j=i; j<num.length; j++){
//                 int currSum=0;
//                 for(int k=i; k<=j; k++){
//                     currSum = currSum + num[k];
//                 }
//                 if(currSum > maxSum ){
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println(maxSum);
//     }
//     public static void main(String[] args) {
//             int number[] = {1,2,3,-1};
//             subarray(number);
//     }
// }


//prefix sum 
public class subarraySum {

//     public static void prefixSum(int arr[]){
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] =new int[arr.length];
//         int currSum = 0;

//         prefix[0] = arr[0]; //first index element sum is it self
//         for(int i=1;i<prefix.length;i++){
//             prefix[i] = prefix[i-1] + arr[i];
//         }

//         for(int i=0; i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
//                 System.out.println(currSum);
//                 if(maxSum<currSum){
//                     maxSum =currSum;
//                 }
//             }
//         }
//         System.out.println(maxSum);
//     }

    public static void kadanes(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<arr.length; i++){
            currSum = currSum + arr[i];
            if(currSum < 0){
                currSum= 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
            int number[] = {-1};
              kadanes(number);
            }
}
