import java.util.*;

public class Products {

	private List<String> productList=new ArrayList<String>();

	// Write code for getter and setter

	public List<String> getProductList() {
		return productList;
	}

	public void setProductList(List<String> productList) {
		this.productList = productList;
	}

	public void addProductToList(String product)
	{
		// code here
		productList.add(product);
	}
	
	public void sortProductList()
	{
		// code here
		Collections.sort(productList);
	}
}