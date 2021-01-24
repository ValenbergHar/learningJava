import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class AppFuncPredic {
    public static void main(String[] args) {
        Function<String, Integer> strToLen = String::length;
        Stream.of("zdfabsdf", "sdfgs", "ffv").map(strToLen).forEach(System.out::println);


        List<Integer> list= Arrays.asList(2,3,5,6,6);
        int sum = list.stream().reduce(0, (a,b)->a+b);
        System.out.println(sum);
    }
}
