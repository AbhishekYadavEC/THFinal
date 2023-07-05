package java8features.streams;

import java.util.*;
import java.util.stream.Stream;

public class StreamRandomInteger {
    public static void main(String[] args) {

        // using Stream.generate() method
        // to generate 5 random Integer values
        Stream.generate(new Random()::nextInt).limit(3).forEach(System.out::println);
    }
}
