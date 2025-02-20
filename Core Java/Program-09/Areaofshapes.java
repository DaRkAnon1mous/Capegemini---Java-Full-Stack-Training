import java.util.Scanner;

public class Areaofshapes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides ");
        int s = sc.nextInt();
        if (s==0){
            System.out.println("Enter the radius");
            double r = sc.nextDouble();
            double carea = 3.14*r*r;
            System.out.printf("Area of the Circle is %.2f\n",carea);

        }else if(s==3){
            System.out.println("Enter the base and height");
            double b = sc.nextDouble();
            double h = sc.nextDouble();
            double tarea =(b*h)/2;
            System.out.printf("Area of the Triangle is %.2f\n",tarea);

        }else if(s==4){
            System.out.println("Enter the length");
            double l = sc.nextDouble();
            System.out.println("Enter the breadth");
            double br = sc.nextDouble();
            double rarea =l*br;
            if(l==br){
                System.out.printf("Area of the Square is %.2f\n",rarea);
            }else{
                System.out.printf("Area of the Rectangle is %.2f\n",rarea);
            }

        }
    }
}
