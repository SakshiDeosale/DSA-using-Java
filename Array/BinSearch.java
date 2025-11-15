package Array;

public class BinSearch {

    public static int binSearch(int arr[],int key){
       int start=0, end=arr.length-1;
       while(start<=end){
        int mid = (start+end)/2;

        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]>key){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
       }
       return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7};
        int key = 16;
        System.out.println("index for key is:"+binSearch(arr,key));
    }   
}