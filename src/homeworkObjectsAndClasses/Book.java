package homeworkObjectsAndClasses;

public class Book {
    private final String bookName;
    private final Author author;
    private int publishingYear;

    public Book (String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getBookName () {
        return this.bookName;
    }

    public Author getAuthor () {
        return this.author;
    }

    public int getPublishingYear () {
        return this.publishingYear;
    }

    public void setPublishingYear (int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString () {
        return "Название - " + bookName + "; Автор - " + author + "; Год - " + publishingYear;
    }

    @Override
    public boolean equals (Object otherBook) {
        if (this == otherBook) {
            return true;
        }
        if (otherBook == null || this.getClass() != otherBook.getClass()) {
            return false;
        }
        Book book = (Book) otherBook;
        return bookName.equals(book.bookName) && author.equals(book.author) && publishingYear == book.publishingYear;
    }

    @Override
    public int hashCode () {
        return java.util.Objects.hash(bookName, author, publishingYear);
    }
}
