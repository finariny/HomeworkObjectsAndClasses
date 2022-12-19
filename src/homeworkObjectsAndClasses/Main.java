package homeworkObjectsAndClasses;

public class Main {
    public static void main(String[] args) {
        firstBook();
        secondBook();
    }

    public static void printBookName (String bookName) {
        System.out.println("Название - " + bookName);
    }

    public static void printBookAuthor (String authorFirstName, String authorLastName) {
        String separator = " ";
        String fullName = String.join(separator, authorFirstName, authorLastName);
        System.out.println("Автор - " + fullName);
    }

    public static void printPublishingYear (int publishingYear) {
        System.out.println("Год - " + publishingYear);
    }

    public static void firstBook () {
        System.out.println("Первая книга");

        Author authorOfCrimeAndPunishment = new Author("Фёдор", "Достоевский");

        Book crimeAndPunishment = new Book("Преступление и наказание", authorOfCrimeAndPunishment, 1866);

        printBookName(crimeAndPunishment.getBookName());
        printBookAuthor(crimeAndPunishment.getAuthor().getFirstName(), crimeAndPunishment.getAuthor().getLastName());
        printPublishingYear(crimeAndPunishment.getPublishingYear());
    }

    public static void secondBook () {
        System.out.println("Вторая книга");

        Author authorOfAfterTheBall = new Author("Лев", "Толстой");

        Book afterTheBall = new Book("После бала", authorOfAfterTheBall, 1910);

        printBookName(afterTheBall.getBookName());
        printBookAuthor(authorOfAfterTheBall.getFirstName(), authorOfAfterTheBall.getLastName());
        printPublishingYear(afterTheBall.getPublishingYear());

        afterTheBall.setPublishingYear(1911);

        printPublishingYear(afterTheBall.getPublishingYear());
    }
}