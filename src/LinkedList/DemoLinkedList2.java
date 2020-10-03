package LinkedList;

import java.util.*;

import javax.swing.plaf.ListUI;

public class DemoLinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crea una lista de paises
		LinkedList<String> countries=new LinkedList<String>();
		
		countries.add("Colombia");
		countries.add("Uruguay");
		countries.add("México");
		countries.add("Brasil");
		countries.add("Chile");
		countries.add("Perú");
		countries.add("Argentina");
		
		LinkedList<String> capitals=new LinkedList<String>();
		
		capitals.add("Bogotá");
		capitals.add("Montevideo");
		capitals.add("CDMX");
		capitals.add("Brasilia");
		capitals.add("Santiago");
		capitals.add("Lima");
		capitals.add("BSAS");
		
		ListIterator<String> it=countries.listIterator();
		ListIterator<String> it2=capitals.listIterator();
		
		while(it2.hasNext()) {
			if(it.hasNext()) {
				it.next();
				it.add(it2.next());
			}
		}
		
		System.out.println(countries);
		
		//Devuelve el iterador a su posición original
		it=countries.listIterator();		

		// Elimina las que están en posición par
		while(it.hasNext()) {
			it.next();
			if(it.hasNext()) {
				it.next();
				it.remove();
			}
		}
		
		System.out.println(countries);
		
		
		
	}

}
