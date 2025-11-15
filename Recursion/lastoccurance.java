package Recursion;

public class lastoccurance {
    
    public static int findLastOccurance(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        int isFound = findLastOccurance(arr, key, i+1);

        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
        
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,4,5,4};
        System.out.println(findLastOccurance(arr, 4, 0));
    }
}
