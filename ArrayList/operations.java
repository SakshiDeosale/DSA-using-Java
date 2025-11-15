
import java.util.ArrayList;

public class operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);


        //add at index
        list.add(2,5);
         System.out.println(list);

         //get
         System.out.println(list.get(2));

         //set
         list.set(2,10);
         System.out.println(list);

         //remove
         list.remove(2);
         System.out.println(list);

         //cotains
         System.out.println(list.contains(1));
    }
}
