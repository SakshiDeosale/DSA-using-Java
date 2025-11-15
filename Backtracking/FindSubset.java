package Backtracking;

public class FindSubset {
    public static void findSubset(String str, int i, String ans){
        if(i==str.length()){
            if(str.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }

       //first yes
       findSubset(str, i+1, ans+str.charAt(i));

       //then call no
       findSubset(str, i+1, ans);
    }
    public static void main(String[] args) {
        findSubset("abc", 0, "");
    }
}
