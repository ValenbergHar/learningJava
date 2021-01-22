import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import javax.persistence.criteria.Fetch;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "person")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Order> orders;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        orders = new ArrayList<Order>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}

