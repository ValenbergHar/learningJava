/**
 * Created by Asus on 05.05.2020.
 */
public class Employee {

    private Integer id;
    private String name;

    public Employee(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

}
