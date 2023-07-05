package java8features;
//not correct

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
public class LocalDateToSqlDate {
    public static void main(String[] args) throws ParseException {
//        String strDate="23-Mar-2011";

        LocalDate localDate = LocalDate.now();
        System.out.println("local date now default local date format:"+localDate);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            Date varDate=dateFormat.parse(localDate.toString());
//            dateFormat=new SimpleDateFormat("dd-MM-yyyy");
            dateFormat=new SimpleDateFormat("yyyy-MM-dd");
            String reqYYYYMMDD = dateFormat.format(varDate);

            System.out.println("in string:"+reqYYYYMMDD);
            java.sql.Date date = java.sql.Date.valueOf(reqYYYYMMDD);
            System.out.println("in java.sql.Date:"+date);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
