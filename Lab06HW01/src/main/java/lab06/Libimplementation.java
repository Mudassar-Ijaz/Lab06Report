package lab06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Libimplementation implements LibrarySystem {
    private Map<String, Book> books;
    private Map<String, Boolean> issuedStatus;

    public Libimplementation() {
        books = new HashMap<>();
        issuedStatus = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getBookId(), book);
        issuedStatus.put(book.getBookId(), false);
    }

    public void removeBook(String bookId) {
        books.remove(bookId);
        issuedStatus.remove(bookId);
    }

    public Book searchBook(String bookId) {
        return books.get(bookId);
    }

    public void issueBook(String bookId) {
        if (books.containsKey(bookId) && !issuedStatus.get(bookId)) {
            issuedStatus.put(bookId, true);
        }
    }

    public void returnBook(String bookId) {
        if (books.containsKey(bookId)) {
            issuedStatus.put(bookId, false);
        }
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public static void main(String[] args) {
        LibrarySystem library = new Libimplementation();

        library.addBook(new Book("B001", "Clean Code", "Robert Martin"));
        library.addBook(new Book("B002", "Effective Java", "Joshua Bloch"));

        System.out.println("All books: " + library.getAllBooks());

        library.issueBook("B001");
        System.out.println("Issued B001");

        Book found = library.searchBook("B001");
        System.out.println("Search result: " + found);

        library.returnBook("B001");
        System.out.println("Returned B001");

        library.removeBook("B002");
        System.out.println("After removal: " + library.getAllBooks());
    }
}