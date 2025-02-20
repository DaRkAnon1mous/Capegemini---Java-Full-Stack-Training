import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in kg ");
        double w = sc.nextDouble();
        System.out.println("Enter height in cm ");
        double h = sc.nextDouble();
        double bmi = w/((h/100)*(h/100));
        if(bmi>=25){
            System.out.printf("Your BMI is %.2f.",bmi);
            System.out.println(" You are overweight");
            double red = bmi-25;
            System.out.printf("Reduce %.2f kg to be fit",red);
        }
        else if(bmi<25 && bmi>=18.5){
            System.out.printf("Your BMI is %.2f.",bmi);
            System.out.println(" You are fit and healthy");
        }
        else{
            System.out.printf("Your BMI is %.2f.",bmi);
            System.out.println(" You are overweight");
            double red1 = 18.5-bmi;
            System.out.printf("Gain %.2f kg to be fit",red1);
        }
    }
}
