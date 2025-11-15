// Question 1 : For a given integer array of size N. You have to find all the occurrences
// (indices) of a given element (Key) and print them. Use a recursive function to solve this
// problem.
// Sample Input : arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
// Sample Output : 1 5 7 8

package Recursion.RecursionAssignment;

public class occurance {
    public static void main(StringProblem[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        searchOccurance(arr,0, 2);
    }
    public static void searchOccurance(int arr[],int idx, int tar){
       if(idx == arr.length){return;}

       if(arr[idx] == tar){
        System.out.print(idx+" ");
       }

       searchOccurance(arr, idx+1, tar);
    }
}
