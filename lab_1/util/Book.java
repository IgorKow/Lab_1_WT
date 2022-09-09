package util;

public class Book implements Comparable<Book>{
	public String title;
	public String author;
	public int price;
	private static int edition;
	private int isbn;
	
	public Book(String title, String author, int price) {
		this.author = author;
		this.price = price;
		this.title = title;
	}
	
	@Override
	
	public String toString() {
		String book = title + " " + author; 
		return book;
	}
	
	@Override
	
	public int hashCode() {
		int result = (price * 1234 + edition) / 2;
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		 if(obj == this)
	            return true;
	        if(!(obj instanceof Book))
	            return false;

	        Book book = (Book)obj;
	        return  book.title == title &&
	                book.author == author;
	}
	
	@Override 
	
	public Object clone() {
		Book book = new Book("St","Dt",1);
		return book;
		
	}
	
	@Override
    public int compareTo(Book obj) {
        if (obj == null)
            throw new NullPointerException();

        if (this.isbn - obj.isbn > 0)
            return 1;
        if (this.isbn - obj.isbn < 0)
            return -1;

        return 0;
    }
}
