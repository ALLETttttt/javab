package intro_to_oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    List<Book> bookList;

    public Library() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.bookList.add(book);
    }

    public void getBookList() {
        for (Book book : bookList) {
            book.displayBookInfo();
        }
    }

    public Optional<Book> getBookByTitleName(String bookName) {
        return bookList.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(bookName))
                .findFirst();
    }
}
