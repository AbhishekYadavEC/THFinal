package java8features;

public class SuperTest {

    public static void main(String[] args) {
//        Square square = new Square ("bar");
//        square.foo ("bar");
//        square.foo();

//        Square square = new Square ();
//        square.foo ();
//        square.foo("bar");

//        Square square = new Square ("bar");
//        square.foo ("bar");
//        square.foo ("bar");

//        Square square = new Square ();
//        square.foo ();
//        square.foo ();


    }

}

class Shape {
    public Shape() {
        System.out.println("Shape: constructor");
    }

    public void foo() {
        System.out.println("Shape: foo");
    }
}

class Square extends Shape {

    public Square() {
        super();
    }

    public Square(String label) {
        System.out.println("Square: constructor");
    }

    public void foo() {
        super.foo();
    }

    public void foo(String label) {
        System.out.println("Square: foo");
    }

}
