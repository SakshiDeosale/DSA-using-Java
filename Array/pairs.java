package Array;

public class pairs {
    public static void printpairs(int num[]){
        for(int i=0; i<num.length; i++){
            for(int j=i+1;j<num.length; j++){
                System.out.print("("+num[i]+","+num[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5};
        printpairs(number);
    }
}


