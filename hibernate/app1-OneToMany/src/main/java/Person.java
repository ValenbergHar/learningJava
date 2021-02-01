import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;

//    @OneToOne(mappedBy = "person", fetch = FetchType.LAZY)
//    @JoinColumn(name = "homeId")
//    private HomeAddress homeAddress;

    //    public Person(String name, HomeAddress homeAddress) {
//        this.name = name;
//        this.homeAddress = homeAddress;
//    }
    @OneToMany(mappedBy = "person")
    private List<HomeAddress> homeAddressList;

    public Person(String name, List<HomeAddress> homeAddressList) {
        this.name = name;
        this.homeAddressList = homeAddressList;
    }
}
