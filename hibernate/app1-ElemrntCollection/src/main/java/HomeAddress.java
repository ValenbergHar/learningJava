import javax.persistence.*;
import java.util.List;

@Entity
public class HomeAddress {
    @Id
    @GeneratedValue
    private int id;
    private String street;

    @ManyToMany
    private List<Person> person;


    public void setPerson(List<Person>  person) {
        this.person = person;
    }

    public HomeAddress() {
    }

    public HomeAddress(String street) {
        this.street = street;
    }

}
