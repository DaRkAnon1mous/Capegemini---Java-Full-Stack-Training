
import java.util.Scanner;
public class Oxygenplants {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length ");
        double a = sc.nextDouble();
        if (a<1){
            System.out.println("Invalid length");
            return;
        }
        System.out.println("Enter breadth ");
        double b = sc.nextDouble();
        if (b<1){
            System.out.println("Invalid length");
            return;
        }
        System.out.println("Enter Area of plant ");
        double c =sc.nextDouble();
        if (c<1){
            System.out.println("Enter length ");
            return;
        }
        double tl = (a*b)/c*100*100;
        tl = Math.floor(tl/10)*10;
        double po = tl*0.9;
        System.out.printf("Total number of plants is %.0f%n",tl);
        System.out.printf("Total oxygen production is %.2f litres",po);



    }
}
