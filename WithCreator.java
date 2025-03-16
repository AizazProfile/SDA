import java.util.Scanner;

// Factory class (Encapsulates Product Creation)
class ProductFactory {
    public static Product createProduct(String name, double price) {
        return new Product(name, price);
    }
}
public class WithCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        // Using the Creator (Factory) to create the Product object
        Product product = ProductFactory.createProduct(name, price);
        product.display();
    }
}
