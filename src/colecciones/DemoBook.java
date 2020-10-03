package colecciones;

public class DemoBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1=new Book("Java desde Cero","Jesús","37896487");
		Book book2=new Book("Java desde Cero","Jesús","37896487");
		
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
	}

}
