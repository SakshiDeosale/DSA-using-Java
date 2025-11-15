package Oops.Constructors;

public class demo {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Sakshi";
        s1.roll = 12;
        System.out.println(s1.name);
        System.out.println(s1.roll);
        Student s2 =new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.roll);
    }
}

class Student{
    String name;
    int roll;
    int marks[];

    Student(){
     marks =new int[3];
     System.out.println("Inside the constuctor");
    }
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
     
        // System.out.println(name);
    }
}
