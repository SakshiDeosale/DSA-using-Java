package Array;

public class plusOne {

    public static int[] plusOne1(int[] digits) {
        int m = digits.length;
        int sum = 0;
        int i=0;
        while(m>0){
           sum = sum*10+digits[i];
           i++;
           m--;
        }

        int k=0;
        sum = sum+1;
        System.out.println(sum);
        while(sum >0){
          digits[k] = sum%10;
          sum = sum/10;
          k++;
        }
        return digits;
    }
    public static void main(String[] args) {
        int digits[] = {1,2,3};
        plusOne1(digits);
        //for(int i=0; i<)
    }
}

