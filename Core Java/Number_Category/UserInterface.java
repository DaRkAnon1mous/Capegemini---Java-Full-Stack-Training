import java.util.Scanner;
public class UserInterface{
	public static NumberCategory checkAmicable() {
		return(int number1,int number2)->{
			
			int sum1 = 0,sum2=0;
			for(int i=1;i<number1/2+1;i++) {
				if(number1%i==0) {
					sum1+=i;
				}
			}
			for(int i=1;i<number2/2+1;i++) {
				if(number2%i==0) {
					sum2+=i;
				}
			}
			return sum1==number2 && sum2==number1;
			
	};
	}
	public static NumberCategory checkPalindrome() {
		return(int number1,int number2)->{
			int mul1 = number1*number2;
			int mul = mul1;
			int rev = 0;
			while(mul>0) {
				int d = mul%10;
				rev = rev*10+d;
				mul = mul/10;
			}
			return mul1 == rev;
		};
	}

 public static void main(String [] args)
    {

    // Fill the code
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 sc.nextLine();
	 NumberCategory nm1 = checkAmicable();
	 NumberCategory nm2 = checkPalindrome();
	 boolean c = nm1.checkNumberCategory(a, b);
	 boolean d = nm2.checkNumberCategory(a, b);
	 if(c && !d) {
		 System.out.printf("%d and %d are amicable numbers \n",a,b);
		 System.out.printf("Their Product %d does not produce a Palindrome\n",a*b);
	 }else if(!c && d) {
		 System.out.printf("%d and %d are not amicable numbers\n",a,b);
		 System.out.printf("Their Product %d do produces a Palindrome\n",a*b);
	 }
	 sc.close();
    }
}