import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @ElementCollection
    private List<HomeAddress> homeAddressList;
    @ElementCollection
    private List<Integer> marks;

    public Person() {
    }

    public Person(String name, List<HomeAddress> homeAddress) {
        this.name = name;
        this.homeAddressList = homeAddress;
    }

    public Person(String name, List<HomeAddress> homeAddressList, List<Integer> marks) {
        this.name = name;
        this.homeAddressList = homeAddressList;
        this.marks = marks;
    }
}
