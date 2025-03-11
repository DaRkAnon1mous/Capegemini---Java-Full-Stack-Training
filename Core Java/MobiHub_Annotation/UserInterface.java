import java.util.Scanner;


public class UserInterface {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Model");
		String s1 = sc.nextLine();
		System.out.println("Enter display (in inches)");
		double s2 = sc.nextDouble();
		System.out.println("Enter Price");
		double s3 = sc.nextDouble();
		IphoneSeries is = new IphoneSeries(s1,s2,s3);
		if(is.getClass().isAnnotationPresent(SmartPhone.class)) {
		System.out.println("iPhone Details\n"
				+ "Model : "+is.getModel());
		System.out.printf("Display in (inches): %.1f",is.getDisplay());
		System.out.printf("\nPrice : %.1f",is.getPrice());
		System.out.printf("\nAmount to be paid : %.1f",is.calculateDiscount());
		Class<IphoneSeries> obj = IphoneSeries.class;
		SmartPhone annotation = obj.getAnnotation(SmartPhone.class);
		System.out.println("\nOS : "+annotation.os());
		System.out.println("Version : "+annotation.version());
		}
		// Fill the code
	}	

}