/*
 * Description:
 * Henry has a magic goose. The goose will lay eggs only for 30 consecutive days in a year. The number of eggs laid by the goose will be in the following pattern. On day 1, it will lay 1 egg, on day 2, it will lay 2 eggs, on day 3 it will lay 5 eggs, on day 4 12 eggs and so on. Write a java program to calculate the number of eggs the goose will lay on a particular day. 

Note: The egg laying pattern follows the pell series. i.e.,[0,1,2,5,12,29,70...]

If the day is more than 30 or negative or zero, then print "<<day>> is invalid day". 

Note:

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text represents the output.

- Adhere to the code template, if provided. 

- Please don't use System.exit(0) to terminate the program.

Sample Input/Output 1:

Enter the day

15

Number of eggs in 15th day is 195025

Sample Input/Output 2:

Enter the day

40

40 is invalid day

Sample Input/Output 3:

Enter the day

-9

-9 is invalid day


 */











import java.util.Scanner;

public class Pellseries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day ");
        int i = sc.nextInt();
        if (i>30 || i<=0){
            System.out.println(i+" is invalid day");
            return;
        }
        int p1 = 1;
        if (i==1){
            System.out.println("Number of eggs in "+i+"th day is "+p1);
            return;
        }
        int p2 = 2;
        if (i==2){
            System.out.println("Number of eggs in "+i+"th day is "+p2);
            return;
        }
        int p3=0;
        for (int a =3;a<=i;a++){
            p3=(2*p2)+p1;
            p1=p2;
            p2=p3;
        }
        System.out.println("Number of eggs in "+i+"th day is "+p3);

        }
}
