package java8features;

public class StaticTest {
    int i;
    static int i2 = 20;

    public static void main(String[] args) {
        //System.out.println(i);           //ce

        StaticTest staticTest = new StaticTest();
        System.out.println(staticTest.i);
        System.out.println(i2);
        System.out.println(staticTest.i2);
    }
}
