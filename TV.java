//Write a Java program to create a class called "TV" with instance variables "brand,"
//"size," and "price." Include a method to calculate the discount on the TV based on
// its size and a method to print the TV's brand, size, and discounted price.
public class TV {

        private String brand;
        private int size;
        private double price;

        public TV(String brand, int size, double price) {
            this.brand = brand;
            this.size = size;
            this.price = price;
        }

        public double calculateDiscount() {
            double discountPercentage = 0;

            if (size >= 50) {
                discountPercentage = 0.1;
            }

            return price * discountPercentage;
        }

        public void printDetails() {
            System.out.println("TV Details:");
            System.out.println("Brand: " + brand);
            System.out.println("Size: " + size + " inches");
            System.out.println("Original Price: $" + price);

            double discount = calculateDiscount();
            double discountedPrice = price - discount;
            System.out.println("Discounted Price: $" + discountedPrice);
        }

        public static void main(String[] args) {
            TV myTV = new TV("Samsung", 55, 800.00);
            myTV.printDetails();
        }
    }


