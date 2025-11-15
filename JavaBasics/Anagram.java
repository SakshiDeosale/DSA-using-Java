package JavaBasics;

public class Anagram {
  
    public static boolean isAnagram(String str1, String str2) {
         int count = 0;
         if(str1.length() == str2.length()){
            for(int i=0; i<str1.length(); i++){
                for(int j=i; j<str2.length(); j++){
                    if(str1.charAt(i) == str2.charAt(j)){
                        count++;
                    }
                }
            }
        }System.out.println(count+" "+str1.length());
         if(count == str1.length()){
               return true;
            }
            else{
              return false;
            }
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}

