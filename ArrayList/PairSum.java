//in rotated sorted array finding target

import java.util.ArrayList;

public class PairSum {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int bp = -1; 
        //find breaking poin
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }

        int lp = bp+1; //smallest
        int rp = bp; //largest
        int n = list.size();

        while (lp != rp) {  
            int Sum = list.get(lp) + list.get(rp);
            if(Sum == target){
                return true;
            }

            if(Sum > target){
                rp = (n+rp-1) % n;
            }else{
                lp = (lp+1) % n;
            }
        }
        return false;
    }
 public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

        list.add(7);
        list.add(8);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 7;
        System.out.println(pairSum(list, target));
 }   
}
