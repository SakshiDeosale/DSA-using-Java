package String;


//concat
// public class string {
//     public static void main(String[] args) {
//         String firstName = "Sakshi";
//         String lastName = "Deosale";
//        System.out.print(firstName+lastName);   
//     }
// }

//charAt
// public class string {

//     public static void main(String[] args) {
//         String str = "HelloWorld";
//         System.out.println(str.charAt(0));
//     }
// }

//SubString

// public class string {

//     public static void main(String[] args) {
//         String str = "HelloWorld";
//         System.out.println(str.substring(0,5));
//     }
// }

//StringBuilder => whenever we add any character in string that 
//time it goes to another memory location by  using StringBuilder
// we will strore the final string 

// public class string {

//     public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("");
//        for(char ch='a'; ch<='z'; ch++){
//         sb.append(ch);
//        }
//        System.out.println(sb);
//     }
// }


public class string {
    public static void main(String args[]) {
    String str = "ShradhaDidi";
    String str1 = "ApnaCollegee";
    String str2 = "ShradhaDidi";
    System.out.println(str.compareTo(str1));//It comapre  lexicographically
    System.out.println(str.equals(str1) + " " + str.equals(str2));
    }
    }
    // public class string {
    //     public static void main(String args[]) {
    //     String str = "ApnaCollege".replace("l", "");
    //     System.out.println(str);
        
    //     }
    //     }
        