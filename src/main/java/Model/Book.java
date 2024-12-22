package Model;

public class Book {
    //variables
    private int id;
    private String title;
    private String author;
    private Boolean isAvailable;
    //constructor
    public Book(int id, String title, String author, Boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public String toString(){
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", isAvailable=" + isAvailable + "]";
    }

}
