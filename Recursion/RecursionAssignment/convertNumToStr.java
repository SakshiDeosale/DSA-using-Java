
// Question 2 :
// You are given a number (eg - 2019), convert it into a String of english like
// “two zero one nine”. Use a recursive function to solve this problem.
// NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
// can’t be 0.
// Sample Input : 1947
// Sample Output : “one nine four seven”

package Recursion.RecursionAssignment;

public class convertNumToStr {
    public static void numToString(String num,int idx){
       if(idx == num.length()){
        return;
       }
       char s = num.charAt(idx);
       switch (s) {
        case '0': System.out.print("zero ");
        break;

        case '1' : System.out.print("one ");
        break;

        case '2' : System.out.print("two ");
        break;

        case '3' : System.out.print("three ");
        break;

        case '4' : System.out.print("four ");
        break;

        case '5' : System.out.print("five ");
        break;

        case '6' : System.out.print("six ");
        break;

        case '7' : System.out.print("seven ");
        break;

        case '8' : System.out.print("eight ");
        break;

        case '9' : System.out.print("nine ");
        break;
       } 

       numToString(num, idx+1);
    }

    public static void main(StringProblem[] args) {
        Integer num = 2029;
        String str = Integer.toString(num);
        numToString(str,0);
    }
}
