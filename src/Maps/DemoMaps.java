package Maps;
import java.util.*;

public class DemoMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Employee> mapEmployee=new HashMap<String, Employee>();
		
		mapEmployee.put("1082976656", new Employee("Jesús"));
		mapEmployee.put("1080771390", new Employee("Antonio"));
		mapEmployee.put("9899404", new Employee("Gabriel"));
		
		
		System.out.println(mapEmployee);
		
		mapEmployee.remove("9899404");
		
		System.out.println(mapEmployee);
		
		//Cuando se coloca una clave igual el elemento es modificado
		mapEmployee.put("1082976656", new Employee("Jesu"));
		
		System.out.println(mapEmployee);
		
		System.out.println(mapEmployee.entrySet());
		
		//Personaliza la obtencion de datos mediante la interfa interna Map.enty
		for (Map.Entry<String, Employee> employee: mapEmployee.entrySet()) {
			System.out.println("Clave: "+ employee.getKey() +". Empleado: "+ employee.getValue());
		}
		
	}

}

class Employee{
	
	private String name;
	private double salary;
	
	public Employee(String name) {
		this.name=name;
		salary=2000;
	}

	public String toString() {
		return "[name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}