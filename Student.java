//Write a Java program to create a class called "Student" with instance variables"name,"
// "age," and "ID."Include a method to print the name and age of the student.
public class Student {
    String name="Mona";
    int age=22;
    int id=1;
    void show(){

        System.out.println("the name of student is"+name);
        System.out.println("the age of student is"+age);
        System.out.println("the id of student is"+id);
    }
}
class student1{
    public static void main(String[] args) {
        Student s=new Student();
        s.show();
    }
}
