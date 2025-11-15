package String;

public class Anagram {
    public static void check(String str1, String str2){
        if(str1.length() == str2.length()){
            int count = 0;
            for(int i=0; i<str1.length(); i++){
                for(int j=0; j<str2.length(); j++){
                    if(str1.charAt(i) == str2.charAt(j)){
                        count++;
                    }
                }
            }
            if(count == str1.length()){
                System.out.println("Strings are anagram");
            }
            else{
                System.out.println("Strings are not anagram");
            }
        }
    }
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "raez";
         check(str1, str2);
    }
}
