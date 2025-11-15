package Array;
import java.util.*;

public class linearSearch {
      
    public static int search(int num[],int key){
     
        for(int i=0;i<num.length;i++){
            if( num[i] == key){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String args[]){
        int num[] = {2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search:");
        int key = sc.nextInt();

        int index = search(num, key);

        if(index == -1){
            System.out.println("number does'nt exist");
        }else{
           System.out.println("index of number:"+index);
        }
    }
}
