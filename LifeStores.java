package co.simplon.lifestores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;


public class LifeStores {

	public static void main(String[] args) {
		// Lecture du fichier csv
		System.out.println("================ LECTURE ET AFFICHAGE DU FICHIER CSV ================");
		try {
			File file = new File("Products.csv");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null){
				System.out.println(s);
			}
		}
		catch (Exception e) {e.printStackTrace();}
		
		
		System.out.println("\n\n======================== DISTRIBUTEUR ==========================");
		// Remplissage du distributeur avec les produits
		Product aquarius = new Product("aquarius",1.5f);
		Product coca = new Product("coca",2f);
		Product kitkat = new Product("kitkat",3.7f);
		Product pocky = new Product("pocky",4f);
		Product evian = new Product("evian",1f);

		List<Product> products = Arrays.asList(aquarius,coca,kitkat,pocky,evian);
		
		Distributor distributor = new Distributor();		
		distributor.addProducts(products);
		
		// R�sultat apr�s vente d'une bouteille aquarius
		System.out.println("\n====== R�sultat apr�s vente d'une bouteille Aquarius ======");
		distributor.sell(aquarius);
		System.out.println("\n"+distributor);
		
		// Affichage du distributeur rempli ou non
		if (distributor.filled()) System.out.println("distributeur rempli");
		else System.out.println("distributeur non rempli");
		
		
		System.out.println("\n\n======================== MAGASIN FAMILY MART ===================");
				
		// Remplissage de Family Mart avec les m�mes produits et un employ�
		FamilyMart familymart = new FamilyMart(1);		
		familymart.addProducts(products);
		
		System.out.println("\n=================== Affichage avant vente ===================");
		System.out.println("\n"+familymart);
		
		
		if (familymart.filled()) System.out.println("Family Mart rempli");
		else System.out.println("\nFamily Mart non rempli");		
		
		System.out.println("=================== Affichage apr�s vente ===================");
		
		// R�sultat apr�s vente d'une bouteille pocky
		System.out.println("\n====== R�sultat apr�s vente d'une bouteille Pocky ======");
		familymart.sell(pocky);
		System.out.println("\n"+familymart);
		
		// Affichage de Family Mart rempli ou non
		if (familymart.filled()) System.out.println("Family Mart rempli");
		else System.out.println("Family Mart non rempli");
		
		System.out.println("\n== Affichage du r�sultat apr�s le d�part de l'employ� � 23h ==");
		// D�part de l'employ�
		FamilyMart familymart_23h = new FamilyMart(0);
		// Vente de l'�vian
		familymart_23h.sell(evian);
		System.out.println("\n"+familymart);
		
		
	}

}
