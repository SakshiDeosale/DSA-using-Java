package String;

public class reverse {
    public static String reverseOfString(String str){
        StringBuilder sb = new StringBuilder();

        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static String reverseMethod2(String str){
        char[] chars =  str.toCharArray();
        int left = 0;
        int right = str.length()-1;

        while (left < right) {
         char temp = chars[left];
         chars[left] = chars[right];
         chars[right] = temp;   

         left++;
         right--;
        }
        return new String(chars);
        }
    public static void main(String[] args) {
        System.out.println(reverseOfString("Sakshi"));
        System.out.println(reverseMethod2("Sakshi"));
    }
}
