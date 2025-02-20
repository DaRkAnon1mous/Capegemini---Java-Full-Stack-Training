import java.util.Scanner;

public class Lotterywinner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ticket Id ");
        long num = sc.nextLong();
        System.out.println("Enter the unlucky code ");
        int unc = sc.nextInt();
        String snum = String.valueOf(num);
        String sunc = String.valueOf(unc);
        int i = 0;
        int count =0;
        while(i<snum.length()){
            if(snum.charAt(i)==sunc.charAt(0)){
                count+=1;
            }
            i++;
        }
        if(count==0){
            System.out.println(num+" is lucky ticket");
            

        }else if(count>=3){
            System.out.println(num+" is unlucky ticket");

        }else{
            System.out.println(num+" is partially lucky");

        }


    }
}
