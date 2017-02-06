package co.simplon.lifestores;

public class FamilyMart extends Distributor implements ConvenienceStore{
	private int nbEmployees;
	private final int maximum = 2;
	
	public FamilyMart(int nbEmployees) {
		super();
		this.nbEmployees = nbEmployees;
	}

	public boolean sell(Product product){
			if(products.contains(product) && (nbEmployees >= 1)){
				products.remove(product);
				return true;
			}
			else return false;
	}

	@Override
	public String toString() {
		return "FamilyMart [products=" + products + ", nbEmployees=" + nbEmployees + ", maximum=" + maximum + "]";
	}

}
