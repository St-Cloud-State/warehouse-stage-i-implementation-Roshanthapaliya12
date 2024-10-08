import java.util.*;

public class WarehouseTest {
    public static void main(String[] args) {
        Warehouse warehouse = Warehouse.instance();

        // Adding clients
        Client client1 = warehouse.addClient(IdServer.instance().getClientId(), "Alice", "Smith", "123 Main St", "555-1234");
        Client client2 = warehouse.addClient(IdServer.instance().getClientId(), "Bob", "Jones", "456 Elm St", "555-5678");

        // Adding products
        Product product1 = warehouse.addProduct("Laptop", IdServer.instance().getProductId(), 999.99, 10);
        Product product2 = warehouse.addProduct("Smartphone", IdServer.instance().getProductId(), 699.99, 20);

        // Adding to wishlist
        warehouse.addToWishList(client1.getClientID(), product1.getProductID(), 1); // Added quantity of 1
        warehouse.addToWishList(client2.getClientID(), product2.getProductID(), 1); // Added quantity of 1

        // Viewing clients
        Iterator<Client> clients = warehouse.getClients();
        System.out.println("Clients:");
        while (clients.hasNext()) {
            System.out.println(clients.next());
        }

        // Viewing products
        Iterator<Product> products = warehouse.getProducts();
        System.out.println("Products:");
        while (products.hasNext()) {
            System.out.println(products.next());
        }
    }
}
