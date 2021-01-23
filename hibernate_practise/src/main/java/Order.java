import javax.persistence.*;

@Entity
@Table(name = "order")
public class Order {
    @EmbeddedId
    private OrderKey orderKey;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", insertable = false, updatable = false)
    private Person person;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private Product product;

    @Column(name = "price")
    private Double price;

    @Override
    public String toString() {
        return "Order{" +
                "orderKey=" + orderKey +
                ", person=" + person +
                ", product=" + product +
                ", price=" + price +
                '}';
    }
}
