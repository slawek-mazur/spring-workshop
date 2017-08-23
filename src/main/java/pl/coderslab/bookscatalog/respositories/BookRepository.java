package pl.coderslab.bookscatalog.respositories;

import org.springframework.stereotype.Repository;
import pl.coderslab.bookscatalog.model.Book;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Repository
public class BookRepository {

    private List<Book> books =
        Arrays.asList(
            new Book(
                1,
                "978-83-7574-610-5",
                "Pan lodowego ogrodu",
                "Jarosław Grzędowicz",
                "Fabryka Słów",
                "fantastyka"
            ),
            new Book(
                2,
                "856-11-5290-610-5",
                "Anioły i Demony",
                "Down Brown",
                "Cisz Company",
                "powieść"
            ),
            new Book(
                3,
                "83-904230-6-5",
                "Piąta góra",
                "Paulo Coelho",
                "Fabryka Słów",
                "kryminał"
            )
        );

    public List<Book> all() {
        return books;
    }

    public Optional<Book> single(long id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    public Book update(Book book) {
        final Optional<Book> single = single(book.getId());
        single.ifPresent(b -> {
            b.setIsbn(book.getIsbn());
            b.setAuthor(book.getAuthor());
            b.setTitle(book.getTitle());
            b.setPublisher(book.getPublisher());
            b.setType(book.getType());
        });
        return book;
    }

    public Optional<Book> delete(long id) {
        for (Iterator<Book> it = books.iterator(); it.hasNext(); ) {
            final Book book = it.next();
            if (id == book.getId()) {
                it.remove();
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }
}
