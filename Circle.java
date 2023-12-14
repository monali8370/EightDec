//Write a Java program to create a class called "Circle" with an instance variable
// "radius."Include a method to calculate the area of the circle and a method
// tocalculate the circumference of the circle.
import java.util.*;
//import java.math
class Circle {
    public static void main(String[] args) {
        int radius;
        double circumference;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radis of circle:");
        radius=sc.nextInt();
        circumference=Math.PI*2*radius;
        System.out.println("the circumference of circle:"+circumference);


    }
}
