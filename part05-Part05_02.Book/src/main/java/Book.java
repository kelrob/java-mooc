public class Book {
    private final String author;
    private final String title;
    private final int pages;

    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    @Override
    public String toString() {
        return this.author + ", " + this.title + ", " + this.pages + " pages";
    }
}
