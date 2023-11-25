class Student
{
    public int regNo; // instance variable
    public String name;
    static String institute = "ATI"; // static variable

    // Constructor
    Student(int r, String n)
    {
        regNo = r;
        name = n;
    }

    // Method to display the values
    void display()
    {
        System.out.println(regNo + " " + name + " " + institute);
    }
}

public class TestStaticVariable1
{
    public static void main(String args[])
    {
        Student s1 = new Student(001, "Jumail");
        s1.display();
        s1.name = "SLIATE"; // Fixed the assignment

        // We can change the institute of all objects by a single line of code
        // Student.college should be Student.institute
        Student.institute = "SLIATE";

        Student s2 = new Student(002, "Zaman");
        s1.display(); // Display updated institute value for s1
        s2.display(); // Display updated institute value for s2
    }
}
