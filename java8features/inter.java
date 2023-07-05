package java8features;
class MyClass {
    public String type = "f ";
    public MyClass() {
        System.out.print("MyClass ");
    }
}
public class inter extends MyClass{
    public inter() {
        System.out.print("Test ");
    }
    public static void main(String[] args) {
        new inter().go();
    }
    void go() {
        type = "c ";
        System.out.print(this.type + super.type);
    }
}