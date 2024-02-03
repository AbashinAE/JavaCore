package DZ_4;

import java.time.LocalDate;

public class Order {
    private LocalDate date;

    private Client buyer;

    private Product product;

    int productAmount;


    public Order(LocalDate date, Client buyer, Product product, int productAmount) {
        this.date = date;
        this.buyer = buyer;
        this.product = product;
        this.productAmount = productAmount;
    }

    @Override
    public String toString() {
        return String.format("Order date - %s, customer - %s, product - %s, product amount - %d",
                date.toString(), buyer.getName(), product.getDescription(), productAmount);
    }
}
