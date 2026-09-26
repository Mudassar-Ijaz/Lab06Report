package lab06;

import java.util.List;

public interface LibrarySystem {
    void addBook(Book book);
    void removeBook(String bookId);
    Book searchBook(String bookId);
    void issueBook(String bookId);
    void returnBook(String bookId);
    List<Book> getAllBooks();
}