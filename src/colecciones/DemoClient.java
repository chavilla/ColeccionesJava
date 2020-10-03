package colecciones;

import java.util.*;

public class DemoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client cl1=new Client("Jesús", "899456046",375.98);
		Client cl2=new Client("Fernanda", "899509404",631.43);
		Client cl3=new Client("Antonio", "899909345", 505.78);
		Client cl4=new Client("María", "899776800", 222.99);
		Client cl5=new Client("María", "899776800", 222.99);
		
		//Crea la colección de clientes
		Set <Client> clients=new HashSet<Client>();
		
		clients.add(cl1);
		clients.add(cl2);
		clients.add(cl3);
		clients.add(cl4);
		clients.add(cl5);
		
		/*for (Client client : clients) {
			System.out.println(client.getName());
			if(client.getName().equals("Antonio"));
			clients.remove(client);
		}*/
		
		// Dentro del iterador it coloca los objetos de la coleccion cliente y los manipula
		Iterator<Client> it=clients.iterator();
		
		while(it.hasNext()) {
			
			Client c=it.next();
			if(c.getName().equals("Antonio")) {
				it.remove();
			}
		}
		
		for (Client client : clients) {
			System.out.println(client.getName());
		}
		
	}

}
