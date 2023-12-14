//Write a Java program to create a class called "Furniture" with instance variables "type,"
// "material,"+and "price." Include a method to calculate the discount on the furniture based on its
//material and a method to print the furniture's type, material, and discounted price.
public class Furniture {
    private String type;
    private String material;
    private double price;

    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
        }

        public double calculateDiscount() {
            double discountPercentage = 0;
            if (material.equalsIgnoreCase("wood")) {
                discountPercentage = 0.15;
            }
            return price * discountPercentage;
        }
        public void printDetails() {
            System.out.println("Furniture Details:");
            System.out.println("Type: " + type);
            System.out.println("Material: " + material);
            System.out.println("Original Price: $" + price);

            double discount = calculateDiscount();
            double discountedPrice = price - discount;
            System.out.println("Discounted Price: $" + discountedPrice);
        }

        public static void main(String[] args) {
            Furniture myFurniture = new Furniture("Chair", "Wood", 100.00);
            myFurniture.printDetails();
        }
    }


