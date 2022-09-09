package util;

public class ProgrammerBook extends Book {
	
	private String language;
	private int level;

	public ProgrammerBook(String title, String author, int price) {
		super(title, author, price);
	}
	
	@Override
	
	public int hashCode() {
		return 345 * super.hashCode() * language.hashCode();
	}
	
	@Override
	
	public String toString() {
		return super.toString() +  language + level ;
	}
	
	@Override
	
	public boolean equals(Object obj) {
		 ProgrammerBook pBook = (ProgrammerBook)obj;
	        return super.equals(pBook) && (pBook.level == level);
	}
	
	
	

}
