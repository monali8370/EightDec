//Write a Java program to create a class called "Employee" with instance variables
// "name," "salary," and "ID." Include a method to
// calculate the employee's yearly salary and a method to print the employee's name and salary.
import java.util.Random;

public class Employee
{
    private String name;
    private String salary;
    private String id;
}
abstract class Main1
{
    abstract public void EmpSal();
}
class Main2 extends Main1
{
    public static void main(String[] args)
    {
        Main2 ob=new Main2();
        ob.EmpSal();
    }

    @Override
    public void EmpSal()
    {
        double sal=15000;
        System.out.println(sal*12);
    }
}

