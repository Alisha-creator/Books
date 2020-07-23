package alisha.digipodium.books.models;

public class Book {
    public String title;
    public String author;
    public String genres;
    public String description;
    public String imageUrl;

    public Book(String title,String author,String genres,String description,String books) {
        this.title = title;
        this.author = author;
        this.genres = genres;
        this.description = description;
        this.imageUrl = books;
    }

}
