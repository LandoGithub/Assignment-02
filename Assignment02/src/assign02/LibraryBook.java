package assign02;

import java.util.GregorianCalendar;

public class LibraryBook extends Book {
	
	private String holder;
	private GregorianCalendar dueDate;
	private boolean checkedInTheLibrary;

	public LibraryBook(long isbn, String author, String title) {
		super(isbn, author, title);
		
		checkedInTheLibrary = true;
	}
	
	public String getHolder() {
		return this.holder;
	}
	
	public GregorianCalendar getDueDate() {
		return dueDate;
	}
	
	public boolean getCheckedIn() {
		return checkedInTheLibrary;
	}
	
	public void checkIn() {
		this.checkedInTheLibrary = true;
		this.holder = null;
		this.dueDate = null;
	}
	
	public void checkOut(String holder, GregorianCalendar dueDate) {
		this.checkedInTheLibrary = false;
		this.dueDate = dueDate;
		this.holder = holder;
	}
	
	
	
	
	
}
