import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;


public class Expirydate {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Manufacturing Date");
        String s = sc.nextLine();
        try{
            SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
            sd.setLenient(false);
        Date d = sd.parse(s);
        System.out.println("Enter the Month");
        int m = sc.nextInt();
        sc.nextLine();
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.add(Calendar.MONTH,m);
        Date d1 = c.getTime();
        System.out.println(sd.format(d1)+" is the expiry date");
        }catch(Exception e){
            System.out.println(s+" is not a valid date");
        }
        


    }
}
