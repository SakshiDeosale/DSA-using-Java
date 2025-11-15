package Array.ArrayAssignment;

public class array {
    public static boolean twiceOrDistinct(int num[]){
        boolean isDistinct = false;
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i] == num[j]){
                    isDistinct=true;
                    break;
                }
            }
        }
        return isDistinct;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,8,9,1,1};
        System.out.println(twiceOrDistinct(arr));
    }
}
