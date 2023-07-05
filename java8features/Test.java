//Lambda expression with functional interface
package java8features;

interface Interf{
    public double m1(int a,double d);
}

public class Test {
    public static void main(String[] args) {
        Interf i = (x,y)-> x+y;
        System.out.println("Addition:"+i.m1(2,2.5));
    }
}
