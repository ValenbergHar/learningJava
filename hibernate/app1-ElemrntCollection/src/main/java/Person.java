import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @ManyToMany
    private List<HomeAddress> homeAddressList;

    public Person() {
    }

    public List<HomeAddress> getHomeAddressList() {
        return homeAddressList;
    }

    public void setHomeAddressList(List<HomeAddress> homeAddressList) {
        this.homeAddressList = homeAddressList;
    }

    public Person(String name, List<HomeAddress> homeAddress) {
        this.name = name;
        this.homeAddressList = homeAddress;
    }


}
