package Examples;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcards {
    public static void main(String[] args) {
        // ? Wildcards
        // Unbounded Wildcards
        List<Double> list1 = Arrays.asList(1.0, 2.0, 3.0);
        List<Integer> list2 = Arrays.asList(1,2);
        List<Number> list3 = Arrays.asList(1, 1.0, 1.3f);

        // printNumbers(list1); // Double is not Integer or super class of Integer
        printNumbers(list2);
        printNumbers(list3);
    }

    // ? <?> THIS IS UNBOUNDED WILDCARD
    static void printNumbers(List<? super Integer> list) {
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }

    // static void print(List<Object> list) {
    //     list.forEach(System.out::println);
    // }
}
