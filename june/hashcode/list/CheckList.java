package june.hashcode.list;

import java.util.List;

public class CheckList {
    public static void main(String[] args)
    {
        List<Person> presidents1 = List.of(
                new Person("Obama", 60),
                new Person("Trump", 75),
                new Person("Biden", 79));

        List<Person> presidents2 = List.of(
                new Person("Obama", 60),
                new Person("Trump", 75),
                new Person("Biden", 79));

//        boolean isEqual = Objects.equals(presidents1, presidents2);
        System.out.println(presidents1.equals(presidents2));
//        if (isEqual) {
//            System.out.println("Both lists are equal");
//        }
//        else {
//            System.out.println("Both lists are not equal");
//        }
    }
}
