import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderKey implements Serializable {
    static final long serialVersionUID = 1L;

    @Column(name = "person_id")
    private Long personId;

    @Column(name = "product_id")
    private Long productId;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderKey)) return false;
        OrderKey orderKey = (OrderKey) o;
        return Objects.equals(personId, orderKey.personId) &&
                Objects.equals(productId, orderKey.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, productId);
    }

    @Override
    public String toString() {
        return "OrderKey{" +
                "personId=" + personId +
                ", productId=" + productId +
                '}';
    }
}
