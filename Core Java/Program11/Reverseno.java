import java.util.Scanner;

public class Reverseno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int i = sc.nextInt();
        int temp = i;
        int rev =0;
        if(i>=1000 && i<=9999){
            while(i>0){
            int d = i%10;
            rev = rev*10+d;
            i = i/10;
            }
            System.out.println("Reverse of the number is "+rev);

            StringBuilder result = new StringBuilder();
            int placeValue = 1; // Start with the units place
        // Process each digit
        temp = rev;
        while (temp > 0) {
            int digit = temp % 10; // Get the last digit
            if (digit != 0) {
                if (result.length() > 0) {
                    result.insert(0, " + "); // Add " + " only if there are previous terms
                }

                // Prepend the current part (digit × place value) to the result
                result.insert(0, (digit * placeValue));
            }
            temp = temp / 10; // Remove the last digit
            placeValue = placeValue * 10; // Move to the next place value
        }
            System.out.println(result);

        
        }
        else{
            System.out.println(i+" is invalid number");
            
        }
        

    }
    
}
