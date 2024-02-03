package DZ_4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Client> customers;

    List<Order> orders;
    List<Product> products;

    public Store() {
        customers = new ArrayList<>();
        orders = new ArrayList<>();
        products = new ArrayList<>();
    }

    public void buyProduct(Client client, Product product, int count) {
        try {
            if (!customers.contains(client))
                throw new ClientNotFound("Client not found");
            if (!products.contains(product))
                throw new NotFoundProduct("Product not found");
            if (count < 0)
                throw new NegativeAmountProduct("The amount of product must not be negative");
            Order order = new Order(LocalDate.now(), client, product, count);
            orders.add(order);
            String s = File.separator;
            System.out.println("C:\\Users\\Asus\\IdeaProjects\\untitled\\src\\main\\java\\DZ_4\\File");
            try (FileWriter fw = new FileWriter("C:\\Users\\Asus\\IdeaProjects\\untitled\\src\\main\\java\\DZ_4\\File")) {
                fw.write(order.toString());
                fw.write("\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (ClientNotFound | NotFoundProduct | NegativeAmountProduct e) {
            System.out.println(e.getMessage());
        }

    }

    public void addClient(Client customer) {
        customers.add(customer);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
