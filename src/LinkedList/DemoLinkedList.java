package LinkedList;

import java.util.*;

public class DemoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crea un linkedlist
		LinkedList<String> people=new LinkedList<String>();
		
		people.add("Jesús");
		people.add("Ashley");
		people.add("Diana");
		people.add("Rubiela");
		
		ListIterator<String> it=people.listIterator();
		
		it.next();
		it.add("Juan");
		
		for(String person: people) {
			System.out.println(person);
		}
		
	}

}
