public class Member
{
    String Name ;
    int Age;
    int Phone_Number;
    String Address;
    int Salary ;

    void printSalary ()
    {
        System.out.println("Salary is " + Salary);

    }

    public static void main(String[] args)
    {

        Employee Obj1 = new Employee();
        Obj1.Name="Jumail";
        Obj1.Age=22;
        Obj1.Phone_Number=0760527243;
        Obj1.Address="Ninthavur";
        Obj1.Salary=10000;
        Obj1.Specialization = "Software";

        System.out.println(Obj1.Name);
        System.out.println(Obj1.Age);
        System.out.println(Obj1.Phone_Number);
        System.out.println(Obj1.Address);
        System.out.println(Obj1.Salary);
        System.out.println(Obj1.Specialization);


        System.out.println("\n");

        Manager Obj2 = new Manager();

        Obj2.Name="Jumailwm";
        Obj2.Age=23;
        Obj2.Phone_Number=0760527243;
        Obj2.Address="Colombo";
        Obj2.Salary=15000;
        Obj2.Department = "Network";

        System.out.println(Obj2.Name);
        System.out.println(Obj2.Age);
        System.out.println(Obj2.Phone_Number);
        System.out.println(Obj2.Address);
        System.out.println(Obj2.Salary);
        System.out.println(Obj2.Department);



    }
}

class Employee extends Member
{
    String Specialization ;

}

class  Manager extends Member
{
    String Department ;
}