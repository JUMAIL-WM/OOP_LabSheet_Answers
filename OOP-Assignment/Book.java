import java.util.ArrayList;

class Book1 {
    private String bookID;
    private String bookName;
    private String authorName;
    private String bookCategory;
    private int bookQuantity;

    public Book1(String bookID, String bookName, String authorName, String bookCategory, int bookQuantity) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookCategory = bookCategory;
        this.bookQuantity = bookQuantity;
    }

    public String getBookID() {
        return bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookID + "\n" +
                "Book Name: " + bookName + "\n" +
                "Author: " + authorName + "\n" +
                "Category: " + bookCategory + "\n" +
                "Quantity: " + bookQuantity + "\n";
    }
}

class Library1 {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        Library library2 = new Library2();

        // Add books to the library
        Book book1 = new Book("B0001", "Book 1", "Author 1", "Category 1", 5);
        Book book2 = new Book("B0002", "Book 2", "Author 2", "Category 2", 3);

        library2.addBook(book1);
        library2.addBook(book2);

        // Display all books in the library
        System.out.println("Books in the Library:");
        library2.displayBooks();
    }
}
