package Array.SortingAlgorithms;

public class selectionSort {
    public static void sorting(int arr[]){
        for(int i=0; i<arr.length-1;i++){
            int min=i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[min] > arr[j]){
                    min=j;
                }
            }
            //swap
            int temp = arr[min];
            arr[min] = arr[i]; 
            arr[i] = temp;
        }
        System.out.println("sorting array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,2,1,3};
        sorting(arr);
    }
}
