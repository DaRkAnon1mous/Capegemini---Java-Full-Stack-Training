import java.util.*;

public class Car {

	private Map<String,Integer> carMap=new TreeMap<>();

	// Include getter and setter

	
	public Map<String, Integer> getCarMap() {
		return carMap;
	}

	public void setCarMap(Map<String, Integer> carMap) {
		this.carMap = carMap;
	}

	public void addCar(String name,int num)
	{
		// Code here
		name = name.toLowerCase();
		if(!carMap.containsKey(name)) {
			carMap.put(name,num);
		}
		
	}
	
	public int carByName(String name)
	{
		name = name.toLowerCase();
		if(carMap.containsKey(name)) {
			return carMap.get(name);
		}else {
			return -1;
		}
	}
	
	public List<String> carByCount(int count)
	{
		List<String> ls = new ArrayList<>();
		for(Map.Entry<String, Integer> c:carMap.entrySet()) {
			if(c.getValue()>=count) {
				ls.add(c.getKey());
			}
		}
		return ls.isEmpty()?null:ls;
	}
	
	public int totalCarsSold()
	{
		int sum=0;
		for(Map.Entry<String, Integer> e:carMap.entrySet()) {
			sum+=e.getValue();
		}
		return sum;
	}
	
}
