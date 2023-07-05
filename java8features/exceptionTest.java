package java8features;
//how to know particular exception is checked or unchecked

class Checked extends Exception{

}

class Unchecked extends RuntimeException{

}

public class exceptionTest {
    public static void main(String[] args) {
        Checked checked= new Checked();
        Unchecked unchecked = new Unchecked();
        if (checked instanceof Exception){
            System.out.println("This is the checked exception.");
        }
        if (unchecked instanceof RuntimeException)
            System.out.println("This is uncheked exception.");

        if (unchecked instanceof Exception)
            System.out.println("This is uncheked exception.");

        //if it is checked or unchecked
//        if (checked instanceof Exception && (checked instanceof RuntimeException)){
//            System.out.println("true");
//        }
    }
}
