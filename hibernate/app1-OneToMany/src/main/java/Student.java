import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "app1")
public class Student {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id;

    //@Basic(optional = false, fetch=FetchType.LAZY)
//@Column(name = "Student", unique = true, nullable = false, updatable = false)
//@Type(type = "text")
    private String name;

    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date date;

    @EmbeddedId
    private Address address;

    public String getName() {
        return "Sp. " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(String text, Date date) {
        this.name = text;
        this.date = date;
    }

    public Student() {
    }

    public Student(String text) {
        this.name = text;
    }
}