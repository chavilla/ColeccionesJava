package TreeSet;

import java.util.*;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crea tres articulos
		Product p1=new Product(100, "Trípode");
		Product p2=new Product(20, "Computador Dell");
		Product p3=new Product(3, "Mouse Maxell");
		
		// Crea un arbol de tipo String
		TreeSet<Product> productOrder=new TreeSet<Product>();
		
		productOrder.add(p1);
		productOrder.add(p2);
		productOrder.add(p3);
		
		for(Product p: productOrder) {
			System.out.println(p.getDescription());
		}
		
		ProductComparator productComparator=new ProductComparator();
		TreeSet<Product> productOrder2= new TreeSet<Product>(productComparator);
	
		productOrder2.add(p1);
		productOrder2.add(p2);
		productOrder2.add(p3);
		
		for(Product p: productOrder2) {
			System.out.println(p.getDescription());
		}
		
	}
}


class Product implements Comparable<Product>{
	
	private int id;
	private String description;

	public Product(int id, String description) {
		this.id=id;
		this.description=description;
	}
	
	//Devuelve la descripcion
	public String getDescription() {
		return description;
	}
	
	//Metodo override de la interfaz
	public int compareTo(Product p) {
		// TODO Auto-generated method stub
		return id-p.id;
	}

	/*public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		String description1=p1.getDescription();
		String description2=p2.getDescription();
		
		return description1.compareTo(description2);
	}*/
	
}


class ProductComparator implements Comparator<Product>{

	@Override
	public int compare(Product arg0, Product arg1) {
		// TODO Auto-generated method stub
		String desc1=arg0.getDescription();
		String desc2=arg1.getDescription();
		
		return desc1.compareTo(desc2);
	}
	
	
}



