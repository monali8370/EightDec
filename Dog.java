//Write a Java program to create a class called "Dog" with instance variables
// "breed," "age," and "weight." Include a method to calculate the dog's age
// in human years and a method to print the dog's breed, age, and weight.
public class Dog {
    public String breed;
    public int age;
    public double weight;

    Dog(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public int humanyear() {
        return age * 7;

    }

    public void year() {
        System.out.println("breed" + breed);
        System.out.println("age" + age +"in human year" + humanyear() + "year");
        System.out.println("weight" + weight);
    }
        public static void main(String[] args) {
            Dog d = new Dog("lab",5,15);
            d.year();
        }
    }
