import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Order> orders;

    public Product(Long id, String name, Double price, List<Order> orders) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.orders = orders;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", orders=" + orders +
                '}';
    }
}
