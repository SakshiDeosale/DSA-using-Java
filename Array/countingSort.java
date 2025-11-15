package Array;

public class countingSort {

    public static void countSort(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);

        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0; i<=largest; i++){
            while(count[i]>0){
               arr[j] = i;
               j++;
               count[i]--;
            }
        }
    }


    //print
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,2,4,1,2,5};
        countSort(arr);
        print(arr);
    }
}
