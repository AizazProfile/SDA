import java.util.Scanner;

// Product class (Model)
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
}

// Application class (Without Creator)
public class WithoutCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        // Directly creating the Product object (violates Creator principle)
        Product product = new Product(name, price);
        product.display();
    }
}
