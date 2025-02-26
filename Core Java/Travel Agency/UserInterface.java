import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       String[] cities = {"Chennai","Coimbatore", "Erode", "Karur", "Madurai","Hyderabad", "Salem", "Bangalore", "Delhi", "Agra"};
       System.out.println("Enter the city name");
       String s = sc.nextLine();
       boolean f = false;
       for(int i=0;i<cities.length;i++) {
    	   if(cities[i].equalsIgnoreCase(s)) {
    		  f=true;
    		   break;
    	   }
       }
       if(f) {
       System.out.println("Bus for "+s+" is available");
       }else {
       System.out.println("Bus for "+s+" is not available");
       }
        //Fill the code here
        sc.close();
    }
}