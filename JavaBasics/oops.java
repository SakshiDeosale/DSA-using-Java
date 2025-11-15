package JavaBasics;

public class oops {
    public static void main(String[] args) {
        // student s = new student();
        // s.roll = 1;
        // s.Name = "Sakshi";
        // s.marks = 90;
        // System.out.println(s.roll+" "+s.Name+" "+s.marks);
        product p =new product();
        p.discount();
    }
    
}

class product{
    private int id;
    private String name;
    private double price;
    private String category;

    product() {
        this.id = 0;
        this.name = "Default Product";
        this.price = 300.0;
        this.category = "General";
    }

    void discount(){
        int final_price = (int) (price * 0.1);
        System.out.println("Discounted Price: " + final_price);
    }
}