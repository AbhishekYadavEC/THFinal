package java8features;

import java.text.SimpleDateFormat;
import java.text.ParseException;

public class date_test2 {
    public static void main(String[] args) {
        String createDate = "13/Apr/2010";
        String reqYYYYMMDD= null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            java.util.Date varDate = dateFormat.parse(createDate);
            dateFormat=new SimpleDateFormat("yyyy-MM-dd");
            //String in format YYYY-MM-DD
            reqYYYYMMDD = dateFormat.format(varDate);

        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(reqYYYYMMDD);
    }
}
