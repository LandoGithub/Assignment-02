package assign02;

import java.util.GregorianCalendar;

public class LibraryBookGeneric<Type> extends Book {
	
	private Type holder;
	private GregorianCalendar dueDate;
	private boolean checkedInTheLibrary;

	public LibraryBookGeneric(long isbn, String author, String title) {
		super(isbn, author, title);
		
		checkedInTheLibrary = true;
	}
	
	public Type getHolder() {
		return this.holder;
	}
	
	public GregorianCalendar getDueDate() {
		return dueDate;
	}
	
	public boolean isCheckedIn() {
		return checkedInTheLibrary;
	}
	
	public void checkIn() {
		this.checkedInTheLibrary = true;
		this.holder = null;
		this.dueDate = null;
	}
	
	public void checkOut(Type holder, GregorianCalendar dueDate) {
		this.checkedInTheLibrary = false;
		this.dueDate = dueDate;
		this.holder = holder;
	}
	
	
	
	
	
}
