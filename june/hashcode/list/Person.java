package june.hashcode.list;
import java.util.*;

public class Person {

        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            System.out.println("is in equals of list");
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }

       /* @Override
        public int hashCode() {
            System.out.println("is in hashcode");
            return Objects.hash(name, age);
        }*/

}
