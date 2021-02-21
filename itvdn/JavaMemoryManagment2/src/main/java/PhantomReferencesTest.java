import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 05.05.2020.
 */
public class PhantomReferencesTest {

    public static void main(String[] args) throws InterruptedException {
        ReferenceQueue<Employee> queue = new ReferenceQueue<Employee>();
        List<FinilizePerson> list = new ArrayList<FinilizePerson>();
        List<Employee> employees = new ArrayList<Employee>();

        for (int i = 0; i < 10; i++) {
            Employee employee = new Employee(1441, "KK");
            employees.add(employee);
            FinilizePerson person = new FinilizePerson(employee, queue);
            list.add(person);
        }



        employees = null;
        System.gc();

        for (PhantomReference<Employee> reference : list) {
            System.out.println(reference.isEnqueued());
        }

        Reference<? extends Employee> referenceFromQueue;

        while ((referenceFromQueue = queue.poll()) != null) {
            ((FinilizePerson)referenceFromQueue).cleaning();
            referenceFromQueue.clear();
        }

    }

}

class FinilizePerson extends PhantomReference<Employee> {

    /**
     * Creates a new phantom reference that refers to the given object and
     * is registered with the given queue.
     * <p>
     * <p> It is possible to create a phantom reference with a <tt>null</tt>
     * queue, but such a reference is completely useless: Its <tt>get</tt>
     * method will always return null and, since it does not have a queue, it
     * will never be enqueued.
     *
     * @param referent the object the new phantom reference will refer to
     * @param q        the queue with which the reference is to be registered,
     */
    public FinilizePerson(Employee referent, ReferenceQueue<? super Employee> q) {
        super(referent, q);
    }

    public void cleaning() {
        System.out.println("employee is finalizing resources");
    }

}
