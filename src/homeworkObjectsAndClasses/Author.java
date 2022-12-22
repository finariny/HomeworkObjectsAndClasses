package homeworkObjectsAndClasses;

public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName () {
        return this.firstName;
    }

    public String getLastName () {
        return this.lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object otherAuthor) {
        if (this == otherAuthor) {
            return true;
        }
        if (otherAuthor == null || this.getClass() != otherAuthor.getClass()) {
            return false;
        }
        Author author = (Author) otherAuthor;
        return firstName.equals(author.firstName) && lastName.equals(author.lastName);
    }

    @Override
    public int hashCode () {
        return java.util.Objects.hash(firstName, lastName);
    }
}
