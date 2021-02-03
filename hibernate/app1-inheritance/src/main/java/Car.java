import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Car {
    @Id
    @GeneratedValue
    private int id;
    private String number;

    public Car(String number) {
        this.number = number;
    }

    public Car() {
    }
}
