package Examples;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcards {
    public static void main(String[] args) {
        // ? Wildcards
        // Unbounded Wildcards
        List<Object> list1 = Arrays.asList(1, "2", 1.0);
        List<Integer> list2 = Arrays.asList(1,2);
        List<String> list3 = Arrays.asList("1", "2");

        print(list1);
        print(list2);
        print(list3);
    }

    // ? <?> THIS IS UNBOUNDED WILDCARD
    static void print(List<?> list) {
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }

    // static void print(List<Object> list) {
    //     list.forEach(System.out::println);
    // }
}
