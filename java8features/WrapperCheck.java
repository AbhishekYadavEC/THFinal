package java8features;

import java.sql.Date;

public class WrapperCheck {
    public static void main(String[] args) {
        String s = "123456";
        Integer i = Integer.parseInt(s);
        System.out.println("i:"+i);

        Date d = Date.valueOf("13/Aug/2010");
        System.out.println(d);
    }
}
