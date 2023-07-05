package java8features;
//vImp
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class date_test {
    public static void main(String[] args) throws ParseException {
        String strDate="23-Mar-2011";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            Date varDate=dateFormat.parse(strDate);
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
