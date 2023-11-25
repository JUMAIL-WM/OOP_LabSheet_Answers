public class Driver {
    public static void main(String[] args) {
        // Create Book objects
        Book book1 = new Book("B0001", "The Snowball", "Alice Schroeder", "Biographies", 1);
        Book book2 = new Book("B0002", "The Total Money Makeover", "Dave Ramsey", "Business", 1);
        Book book3 = new Book("B0003", "The Hunger Games", "Suzanne Collins", "Science Fiction & Fantasy", 1);
        Book book4 = new Book("B0004", "The Intelligent Investor", "Benjamin Graham", "Business", 1);

        // Create a Library object
        Library library = new Library("Science Library", "Peradeniya");

        // Create Student objects
        Student student1 = new Student("S0102");
        Student student2 = new Student("S0093");

        // Display library information
        System.out.println("Library Information:");
        library.displayLibraryInfo();

        // Search for the book named "The Intelligent Investor" by its book ID
        String bookToSearch = "B0004";
        int searchResult = library.searchBook(bookToSearch);
        if (searchResult == 1) {
            System.out.println("Book found and available.");
        } else {
            System.out.println("Book not found or not available.");
        }
    }
}
