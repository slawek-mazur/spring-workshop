package pl.coderslab.bookscatalog.controllers;

import org.springframework.web.bind.annotation.*;
import pl.coderslab.bookscatalog.model.Book;
import pl.coderslab.bookscatalog.respositories.BookRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public List<Book> books() {
        return bookRepository.all();
    }

    @GetMapping("/{id}")
    public Optional<Book> single(@PathVariable long id) {
        return bookRepository.single(id);
    }

    @PostMapping
    public Book add(@RequestBody Book book) {
        return bookRepository.add(book);
    }

    @DeleteMapping("/{id}")
    public Optional<Book> delete(@PathVariable long id) {
        return bookRepository.delete(id);
    }
}
