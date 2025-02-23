import java.util.Scanner;


class Volume{
    private double radius,height;
    private int length,breadth,height2;

    public double calculateVolume(double radius,double height){
        return 3.14*radius*radius*height;
}
    public double calculateVolume(int length,int breadth,int height2){
        return length*breadth*height;
}

}

public class Volumecalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Volume v = new Volume();
        System.out.println("Enter the choice ");
        System.out.println("1.Find Volume For Cylinder");
        System.out.println("2.Find Volume For Cuboid");
        int i = sc.nextInt();
        switch(i){
            case 1:
            System.out.println("Enter the radius");
            int r =sc.nextInt();
            System.out.println("Enter the height");
            int h = sc.nextInt();
            double res1= v.calculateVolume(r, h);
            System.out.printf("Volume of the Cylinder is %.2f\n",res1);
            break;

            case 2:
            System.out.println("Enter the length");
            int l =sc.nextInt();
            System.out.println("Enter the breadth");
            int b = sc.nextInt();
            System.out.println("Enter the height");
            int h2 = sc.nextInt();
            double res2= v.calculateVolume(l,b,h2);
            System.out.printf("Volume of the Cylinder is %.2f\n",res2);
            break;
        }

    }}