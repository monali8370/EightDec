//Write a Java program to create a class called "Shirt" with instance variables
//"size," "color," and "price." Include a method to calculate the discount on
// the shirt with instance variables "size," "color," and "price." Include a method to
// calculate the discount on the shirt based on
//  its size and a method to print the shirt's size, color, and discounted price
public class Shirt {
    private String size;
    private String color;
    private double price;
    public Shirt(String size, String color, double price) {
            this.size = size;
            this.color = color;
            this.price = price;
        }
        public double calculateDiscount() {
            double discountPercentage = 0;

            if (size.equalsIgnoreCase("large")) {
                discountPercentage = 0.1;
            }

            return price * discountPercentage;
        }

        public void printDetails() {
            System.out.println("Shirt Details:");
            System.out.println("Size: " + size);
            System.out.println("Color: " + color);
            System.out.println("Original Price: $" + price);

            double discount = calculateDiscount();
            double discountedPrice = price - discount;
            System.out.println("Discounted Price: $" + discountedPrice);
        }

        public static void main(String[] args) {
            // Example usage
            Shirt myShirt = new Shirt("Large", "Blue", 25.00);
            myShirt.printDetails();
        }
    }


