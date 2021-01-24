import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App57 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        List<Integer> out = integers.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        }).collect(Collectors.toList());
        System.out.println(out);


        List<Integer> out2 = integers.stream()
                .filter((n) -> { return n % 2 == 0; })
                .collect(Collectors.toList());
        System.out.println(out2);

        integers.stream().filter((n)->n%2==1).forEach(integer -> System.out.println(integer));
    }
}
