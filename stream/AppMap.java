import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class AppMap {
    public static void main(String[] args) {
        Stream.of("AA","BBB", "C", "DDDD")
                .map((Function<String, Integer>) s -> s.length())
                .forEach(System.out::println);

        List<Integer> list = new ArrayList<>(Arrays.asList(1,44,5,30,6,7,5,3));
        System.out.println(list.stream().allMatch(n->n<50));
        System.out.println(list.stream().anyMatch(n->n==4));
        System.out.println(list.stream().noneMatch(n->n==2));
    }
}
