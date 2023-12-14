//Write a Java program to create aclass called "Computer" with instance variables "processor," "RAM,"
//and "storage." Include a method to calculate the price of the computer based on the processor, RAM, and
//storage capacity and a method to print the computer's processor, RAM, and storage capacity.
public class Computer {
    private String processor;
    private int ram;
    private int storage;

    public Computer(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        }

        public double calculatePrice() {
            double basePrice = 500;
            double ramPrice = ram * 0.05;
            double storagePrice = storage * 0.1;
            return basePrice + ramPrice + storagePrice;
        }

        public void printDetails() {
            System.out.println("Computer Details:");
            System.out.println("Processor: " + processor);
            System.out.println("RAM: " + ram + "GB");
            System.out.println("Storage: " + storage + "GB");
        }

        public static void main(String[] args) {
            Computer myComputer = new Computer("Intel i5", 8, 512);
            myComputer.printDetails();
            double price = myComputer.calculatePrice();
            System.out.println("Price: $" + price);
        }
    }


