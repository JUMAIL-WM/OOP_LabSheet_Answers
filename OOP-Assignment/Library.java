import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Book {
    public Book(String b0001, String s, String s1, String s2, int i) {
    }

    public Object getBookID() {
        Object bookID = null;
        return bookID;
    }

    public int getBookQuantity() {
        int bookQuantity = 0;
        return bookQuantity;
    }

    public void setBookQuantity(int i) {
    }
    // ... (same as before)

    // Add any necessary methods to Book class
}

class Library {
    private String libraryName;
    private String location;
    private ArrayList<Book> books = new ArrayList<>();
    private Map<String, Integer> borrowedBooks = new HashMap<>();

    public Library(String libraryName, String location) {
        this.libraryName = libraryName;
        this.location = location;
    }

    public Library() {

    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayLibraryInfo() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Location: " + location);
        System.out.println("Books in the Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public int searchBook(String bookID) {
        for (Book book : books) {
            if (book.getBookID().equals(bookID) && book.getBookQuantity() > 0) {
                return 1;  // Book found and available
            }
        }
        return -1;  // Book not found or not available
    }

    public int checkoutBook(String bookID, String studentID) {
        borrowedBooks.putIfAbsent(studentID, 0);

        int bookStatus = searchBook(bookID);

        if (bookStatus == 1) {
            if (borrowedBooks.get(studentID) < 3) {
                // Decrease available book quantity and increase the number of books borrowed by the student
                for (Book book : books) {
                    if (book.getBookID().equals(bookID)) {
                        book.setBookQuantity(book.getBookQuantity() - 1);
                        borrowedBooks.put(studentID, borrowedBooks.get(studentID) + 1);
                        return 1;  // Checkout successful
                    }
                }
            } else {
                return -1;  // Student has already borrowed 3 books
            }
        }

        return bookStatus;  // -1 for book not found or not available
    }

    public static void main(String[] args) {
        Library library = new Library("My Library", "Library Location");

        // Add books to the library
        Book book1 = new Book("B0001", "Book 1", "Author 1", "Category 1", 5);
        Book book2 = new Book("B0002", "Book 2", "Author 2", "Category 2", 3);
        library.addBook(book1);
        library.addBook(book2);

        // Display library information
        library.displayLibraryInfo();

        // Search for a book by book ID
        int bookStatus = library.searchBook("B0001");
        if (bookStatus == 1) {
            System.out.println("Book found and available.");
        } else {
            System.out.println("Book not found or not available.");
        }

        // Perform book checkout
        String studentID = "S001";
        int checkoutStatus = library.checkoutBook("B0001", studentID);
        if (checkoutStatus == 1) {
            System.out.println("Checkout successful.");
        } else if (checkoutStatus == -1) {
            System.out.println("Checkout failed. Book not found or not available.");
        } else {
            System.out.println("Checkout failed. Student has already borrowed 3 books.");
        }
    }

    public void displayBooks() {
    }
}
