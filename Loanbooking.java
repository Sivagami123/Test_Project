package Assignment;
import java.io.inputfiles;
import java.util.Scanner;
#test
public class LibraryTester {

public static void main(String args[]){

    Library lib = new Library(HelperUtilities.generateBooks());
    Scanner sc = new Scanner(System.in);

    displayMenu(lib, sc);
}

public static void displayMenu(Library i, Scanner s) {
System.out.println("--- Library Menu ---");
System.out.println("---(1) Display Books ---");
System.out.println("---(2) Add Book ---");
System.out.println("---(3) Remove Book ---");
System.out.println("---(4) Edit Book ---");
System.out.println("---(5) Loan Book ---");
System.out.println("---(6) Return Book ---");
System.out.println("---(7) EXIT ---");

package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

private ArrayList<Book> books;

public Library (ArrayList<Book> books){
    super();
    this.books = books;
}

public ArrayList<Book> getBooks () {
    return books;
}

public void setBooks(ArrayList<Book> books){
    this.books = books;
}

public void displayBooks()
{
    for (int i = 0; i < books.size(); i++) {
        System.out.println("ID " +books.get(i).getBookID());
        System.out.println("Title "+books.get(i).getTitle());
    }
    System.out.println("Displayed "+books.size()+" Books");
}

public void addBook(int ID, String title)
{
    books.add(new Book(ID,title));

}

public void loaning_A_Book (int bookIndex) {
    Book book = books.get(bookIndex);
    book.setOn_Loan (true);
}

public void removeBook(int id)
{
    boolean successful = false;
    for (int i=0;i<books.size();i++)
    {
        if((int)books.get(i).getBookID()==id)
        {
            books.remove(i);
            System.out.println("Book removal successful");
            successful=true;
        }
    }

    if (!successful)
    {
        System.out.println("Could not remove book id "+id);
        }
    }

public void editBook(int idToEdit, Scanner s) {
    // TODO Auto-generated method stub

}
