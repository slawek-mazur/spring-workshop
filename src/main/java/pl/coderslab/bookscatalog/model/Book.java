package pl.coderslab.bookscatalog.model;

public class Book {

    private long id;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String type;

    public Book(long id, String isbn, String title,
                String author, String publisher, String type) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Book{" +
            "id='" + id + '\'' +
            ", isbn='" + isbn + '\'' +
            ", title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", publisher='" + publisher + '\'' +
            ", type='" + type + '\'' +
            '}';
    }
}
