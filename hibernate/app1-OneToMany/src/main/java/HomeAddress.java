import javax.persistence.*;

@Entity
public class HomeAddress {
    @Id
    @GeneratedValue
    private int id;
    private String street;
    //    @OneToOne
//    private Person person;

    @ManyToOne
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public HomeAddress(String street) {
        this.street = street;
    }
}
