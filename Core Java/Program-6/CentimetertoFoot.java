import java.util.Scanner;
public class CentimetertoFoot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height in cm ");
        double a = sc.nextDouble();
        a = a/30.48;
        System.out.printf("Height in foot is %.2f foot",a);

    }
}