class student {
    int regNo; // Will get memory when an instance is created
    static int c;

    student()
    {
        c = c + 1;
        regNo = c;
        System.out.println("RegNo of Student " + c + "=" + regNo);
        System.out.println("Total no of students object=" + c);
    }

    public static void main(String args[])
    {
        student c1 = new student();
        student c2 = new student();
        student c3 = new student();

    }
}
