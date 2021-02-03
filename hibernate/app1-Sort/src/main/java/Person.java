import org.hibernate.annotations.SortComparator;

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
//    @OrderBy
//    @OrderColumn
//    @org.hibernate.annotations.OrderBy(clause = "marks DESC")
//    @SortComparator(MyComparator.class)
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

    public List<Integer> getMarks() {
        return marks;
    }
}
