package java8features;

interface MyInterface {
    int myVar =10;   //by default every variable is public statc and final
}
public class test2 {
    public static void main(String args[]) {
        //MyInterface.myVar=12;
        System.out.println(MyInterface.myVar);
    }
}