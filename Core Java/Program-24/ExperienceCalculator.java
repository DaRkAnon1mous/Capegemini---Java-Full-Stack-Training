import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class ExperienceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date of joining");
        String s = sc.nextLine();
        try{
            SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
            sd.setLenient(false);
            Date d1 = sd.parse(s);
            String s2 = "15/12/2020";
            Date d2 = sd.parse(s2);
            Calendar c1 = Calendar.getInstance();
            Calendar c2 = Calendar.getInstance();
            c1.setTime(d1);
            c2.setTime(d2);
            long diff = (c2.getTimeInMillis()-c1.getTimeInMillis())/(1000L*60*60*24*365);
            System.out.printf("%d diff",diff);


        }catch(Exception e){
            System.out.println(s+" is not a valid date");
        }
    }
}
