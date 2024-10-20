package librarymanagementsystem;

public class Book {
    private String id;
    private String title;
    private String author;
    private String isbnNumber;
    private boolean isAvailable;

    public Book(String id, String title, String author, String isbnNumber, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbnNumber = isbnNumber;
        this.isAvailable = isAvailable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
