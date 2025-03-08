import java.util.Map;
import java.util.HashMap;

public class Country {
    
    private Map<String,String> countryMap=new HashMap<String,String>();

        // Write code for getter and setter

    public Map<String, String> getCountryMap() {
		return countryMap;
	}

	public void setCountryMap(Map<String, String> countryMap) {
		this.countryMap = countryMap;
	}

	public void add(String cname,String capname)
    {
	    // Code here
		countryMap.put(cname, capname);
    }

    public String search(String cname)
    {
    	if(countryMap.containsKey(cname)) {
    		return countryMap.get(cname);
    	}else {
    		return "Data not found";
    	}
    }
}
