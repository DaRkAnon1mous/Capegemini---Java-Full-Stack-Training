import java.util.*;

public class UserInterface
{
	public String getDuplicateElement()
    {
		Scanner sc;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter the size of an array");
			int a = sc.nextInt();
			if(a<0) {
				sc.close();
	             throw new NegativeArraySizeException("Array size should be positive");
				
			}
			sc.nextLine();
			System.out.println("Enter the array elements");
			int[] arr2 = new int[a];
			for(int i=0;i<a;i++) {
				arr2[i]=sc.nextInt();
			}
			System.out.println("Enter the position of the element to be replicated");
			int b = sc.nextInt();
			if(b>=arr2.length) {
				sc.close();
				throw new ArrayIndexOutOfBoundsException();
			}
			
		
		StringBuilder res = new StringBuilder("The array elements are ");
		int[] arr = new int[arr2.length+1];
		for (int i = 0; i < arr2.length; i++) {
            arr[i] = arr2[i];
        }
		 arr[arr2.length]=arr[b];
       
        for(int i=0;i<arr.length;i++) {
        	res.append(arr[i]);
        	if(i<arr.length) {
        		res.append(" ");
        	}
        }
        sc.close();
        return res.toString();
		} catch (ArrayIndexOutOfBoundsException  e) {
			return "Array index is out of range";
			//e.printStackTrace();
		} catch (InputMismatchException e) {
			return "Input was not in the correct format";
		} catch(NegativeArraySizeException e) {
			return e.getMessage();

		}
    }
	
	public static void main(String[] args)
    {
        // Fill the code
		UserInterface ui = new UserInterface();
        String result = ui.getDuplicateElement();
        System.out.println(result);
		
    }
}