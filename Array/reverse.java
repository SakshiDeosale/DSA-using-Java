package Array;


public class reverse {

    public static void reverseArray(int number[]){
        int first = 0, last = number.length-1;
        while (first < last) {
            
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int num[] = {2,3,4,5,6,7,8};

        reverseArray(num);
        for(int i=0; i<num.length;i++){
            System.out.print(" "+num[i]);
        }
    }
}