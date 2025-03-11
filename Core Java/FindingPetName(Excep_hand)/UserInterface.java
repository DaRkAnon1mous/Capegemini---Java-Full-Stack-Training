import java.io.*;
import java.util.*;
public class UserInterface {
    
	public String findPetName(String fileName) {
		try (FileReader fr = new FileReader(fileName);
	             BufferedReader br = new BufferedReader(fr)) {

	            String line;
	            while ((line = br.readLine()) != null) {
	                if (checkVowels(line)) {
	                    return line; 
	                }
	            }
	        } catch (FileNotFoundException e) {
	            return "Please give the correct file name"; 
	        } catch (IOException e) {
	            return "Error occurred while reading the names from file"; 
	        }

	        return "";

	}
	private boolean checkVowels(String s) {
    	return s.replaceAll("[^aeiouAEIOU]", "").length() == 2;
    }
	public static void main(String args[]) {

		// Fill the code here
		UserInterface ui = new UserInterface();
		String res = ui.findPetName("FindingPetName/inputfeed.txt");
		System.out.println(res);

	}

}
