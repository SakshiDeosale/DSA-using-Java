import java.util.ArrayList;

public class TwoSumSortedArray {
    public static boolean twoSum(ArrayList<Integer> nums, int target) {
        int lp = 0;
        int rp = nums.size()-1;

        while(lp != rp){
            if(nums.get(rp) + nums.get(lp) == target){
                return true;
            }

            if(nums.get(rp) + nums.get(lp) > target){
                rp--;
            }else{
                lp++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;
        System.out.println(twoSum(list, target));
    }
}


// Input: numbers = [2, 7, 11, 15], target = 9
// Output: [1, 2]   // because numbers[0] + numbers[1] = 2 + 7 = 9
