import java.util.Scanner;

public class Numbernames {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int i = sc.nextInt();
        StringBuilder result = new StringBuilder();

    while (i > 0) {
        int digit = i % 10;
        String word;
        switch (digit) {
            case 0: word = "zero"; break;
            case 1: word = "one"; break;
            case 2: word = "two"; break;
            case 3: word = "three"; break;
            case 4: word = "four"; break;
            case 5: word = "five"; break;
            case 6: word = "six"; break;
            case 7: word = "seven"; break;
            case 8: word = "eight"; break;
            case 9: word = "nine"; break;
            default: word = ""; // This case will never occur
        }
        result.insert(0, word + " ");
        i = i / 10;
    }

    //result.toString().trim();
    System.out.println(result);
    }
}

