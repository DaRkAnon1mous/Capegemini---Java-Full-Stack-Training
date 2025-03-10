import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ClassHouseFormation chf = new ClassHouseFormation();
		System.out.println("Enter the number of students");
		int s1 = sc.nextInt();
		sc.nextLine();
		if(s1<=0) {
			System.out.println("Invalid input");
			sc.close();
			return;
		}
		
		System.out.println("Enter the details");
		String[] s2 = new String[s1];
		for (int i = 0; i < s1; i++) {
			s2[i] = sc.nextLine();
		}
		HashSet<String> studSet1 = new HashSet<String>(Arrays.asList(s2));
		//chf.setStudSet(studSet1);
		for (String e : studSet1) {
			chf.addName(e);
		}
		
		//System.out.println(chf.formTeam());
        chf.formTeam().forEach(System.out::println);
		// Write code here
        sc.close();
	}
}