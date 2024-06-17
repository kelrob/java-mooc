public class Book {
    private final String title;
    private final int publicationYear;

    private final int pages;

    public Book(String bookTitle, int bookPages, int bookPublicationYear) {
        this.title = bookTitle;
        this.pages = bookPages;
        this.publicationYear = bookPublicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return pages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return this.getTitle() + ", " + this.getPages() + " pages, " + this.getPublicationYear();
    }
}
