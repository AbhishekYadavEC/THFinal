package java8features;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = i->i%2 == 0;
        System.out.println(predicate.test(10));
        System.out.println(predicate.test(5));
        System.out.println(predicate.test(11));
        System.out.println(predicate.test(14));
    }
}
