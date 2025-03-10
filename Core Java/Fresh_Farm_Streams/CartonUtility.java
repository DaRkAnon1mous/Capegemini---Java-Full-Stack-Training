import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class CartonUtility {
	private List<Carton> cartonList;
	
	//FILL THE CODE HERE 

	public List<Carton> getCartonList() {
		return cartonList;
	}

	public void setCartonList(List<Carton> cartonList) {
		this.cartonList = cartonList;
	}

	public Stream<Carton> convertToStream() {
		
		//FILL THE CODE HERE 
		
		
		return cartonList.stream();
	}

	public Carton findMax(Stream<Carton> stream1) {
		
	     return stream1.max(Comparator.comparingInt(Carton::getQuantity)).orElse(null);
	}
	

}
