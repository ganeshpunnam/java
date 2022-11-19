package collections;
import java.util.HashMap;
public class Book {
	private int id;
	private String name;
	private String author;
	private static int idgen=100;

	
	public Book (String name,String author){
		this.id=idgen++;
		this.name=name;
		this.author=author;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

	
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	public static void main(String[] args) {
		Book b1= new Book("python","ganesh");
		Book b2= new Book("java","sai");
		Book b3= new Book("Html","chadu");
		
		HashMap<Integer, Book> a=new HashMap<>() ;
		HashMap<Integer, Book> b=new HashMap<>() ;
		a.put(b1.getId(), b1);
		a.put(b2.getId(), b2);
		a.put(b3.getId(), b3);
		b.putAll(a);
		System.out.println(a);
		System.out.println(b);
		

		
		
	}
	

}
