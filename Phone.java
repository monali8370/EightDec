//Write a Java program to create a class called "Phone" with instance variables "make," "model," and
//"storage." Include a method to calculate the price of the phone based on the make, model, and storage
// capacity and a method to print the phone's make, model, and storage capacity.
public class Phone {
    private String make;
    private String model;
    private int storage;

    public Phone(String make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    public double calculatePrice() {
        double basePrice = 200;
        double storagePrice = storage * 0.1;
        return basePrice + storagePrice;
    }

    public void printDetails() {
        System.out.println("Phone Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + "GB");
    }

    public static void main(String[] args) {
        Phone myPhone = new Phone("Apple", "iPhone 12", 128);
        myPhone.printDetails();

        double price = myPhone.calculatePrice();
        System.out.println("Price: $" + price);
    }
}
