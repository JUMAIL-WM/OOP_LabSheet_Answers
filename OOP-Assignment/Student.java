class Student {
    private String registrationNumber;
    private int booksBorrowed;

    public Student(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        this.booksBorrowed = 0; // Initial value is zero
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getBooksBorrowed() {
        return booksBorrowed;
    }

    public void setBooksBorrowed(int booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }
}

class Library3 {
    // ... (rest of the Library class from the previous example)

    public static void main(String[] args) {
        // ...

        // Create a new student
        Student student1 = new Student("S0001");

        // Display student information
        System.out.println("Student Registration Number: " + student1.getRegistrationNumber());
        System.out.println("Number of Books Borrowed: " + student1.getBooksBorrowed());

        // Update the number of books borrowed by the student
        student1.setBooksBorrowed(2);
        System.out.println("Updated Number of Books Borrowed: " + student1.getBooksBorrowed());
    }
}
