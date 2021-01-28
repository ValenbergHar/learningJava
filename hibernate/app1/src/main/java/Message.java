import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "app1")
public class Message {
    @Id
    @GeneratedValue
    private int id;

    private String text;

    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date date;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Message(String text, Date date) {
        this.text = text;
        this.date = date;
    }

    public Message(String text) {
        this.text = text;
    }
}