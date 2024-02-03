package DZ_4;

public class Main {
    public static void main(String[] args) {
        OnlineStore.store.addClient(new Client("Name_1", "City_1", "+777712345"));
        OnlineStore.store.addClient(new Client("Name_2", "City_2", "+788812345"));
        OnlineStore.store.addClient(new Client("Name_3", "City_3", "+799912345"));
        OnlineStore.store.addProduct(new Product("product_1"));
        OnlineStore.store.addProduct(new Product("product_2"));
        OnlineStore.store.addProduct(new Product("product_3"));


        Client client = new Client("Name_3", "City_3", "+799912345");
        Product product = new Product("product_2");
        OnlineStore.store.buyProduct(client, product, 3);

//        Client client_2 = new Client("Name_2", "City_2", "+788812345");
//        Product product_2 = new Product("product_2");
//        OnlineStore.store.buyProduct(client, product, 2);
//
//        Client client_3 = new Client("Name 3", "City 3", "+799912345");
//        Product product_3 = new Product("product 3");
//        OnlineStore.store.buyProduct(client, product, 3);

    }
}
