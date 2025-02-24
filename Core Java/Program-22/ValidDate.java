import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ValidDate {
    public static boolean validateD(String s){
        try{
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        f.setLenient(false);
        Date d = f.parse(s);
        return true;
    }catch(Exception e){
        return false;
    }
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the date");
        String s1= sc.nextLine();
        boolean b = validateD(s1);
        if(b==true){
            System.out.println(s1+" is a valid date");
        }else{
            System.out.println(s1+" is not a valid date");
        }


    }
}

