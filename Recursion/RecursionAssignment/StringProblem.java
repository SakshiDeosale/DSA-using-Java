// Question 4 : We are given a string S, we need to find the count of all contiguous substrings
// starting and ending with the same character.
// Sample Input 1 : S = "abcab"
//  Sample Output 1 : 7

package Recursion.RecursionAssignment;
import java.util.*;

public class StringProblem {
    public static int program(String str){
        int count = 0;
        int n = str.length();
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(str.charAt(i) == str.charAt(j)){
                   count++;
                   System.out.print(str.substring(i, j + 1)+" ");
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "abcab";
        System.out.println(program(str));
    }
}
