public class PaySlip
{

    private double basicSalary;
    private double OT_Rate;

    public PaySlip(double basicSalary, double OT_Rate)
    {
        this.basicSalary = basicSalary;
        this.OT_Rate = OT_Rate;
    }

    public double calSalary(double OT_Hours, double deductions)
    {

        double netSalary;

        netSalary = basicSalary + (OT_Rate * OT_Hours) - deductions;

        return netSalary;
    }

    public double getBasicSalary()
    {
        return basicSalary;
    }

    public double getOT_Rate()
    {
        return OT_Rate;
    }


    public static void main(String[] args)
    {

        PaySlip employeePaySlip = new PaySlip(50000.0, 20.0);

        double netSalary = employeePaySlip.calSalary(10, 2000);

        System.out.println("Net Salary: $" + netSalary);
    }
}
