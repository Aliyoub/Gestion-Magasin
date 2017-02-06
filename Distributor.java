package co.simplon.lifestores;

import java.util.ArrayList;
import java.util.List;

public class Distributor implements ConvenienceStore{
	protected List<Product> products = new ArrayList<Product>();
	protected final int maximum = 5;
	

	public boolean sell(Product product){
		// Vérification de l'appartenance de product à la liste products
		if(products.contains(product)){
			products.remove(product);
			return true;
		}
		else return false;	
	}

	public boolean filled(){
		if(products.size() >= this.maximum) return true;
		else return false;
	}

	public void addProducts(List<Product> products) {
		this.products.addAll(products);		
	}

	public String toString() {
		return "Distributor [products=" + products + ", maximum=" + maximum + "]";
	}
	
}
