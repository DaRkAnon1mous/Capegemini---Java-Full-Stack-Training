
public class Validator {

	public static boolean validateStation(float freq) throws StationNotAvailableException {
		boolean flag = false;

		if (freq == 91.2f || freq == 93.5f || freq == 98.9f || freq == 109.4f)
			flag = true;
		else{
			// fill the logic
			throw new StationNotAvailableException(String.format("The frequency %.1f is out of range", freq));
}
			return flag;

	}
}
