package Recursion;

public class firstOccurance {
    public static int search(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return search(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,4,5};
        System.out.println(search(arr, 0, 4));
    }
}
