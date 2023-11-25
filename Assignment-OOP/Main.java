class LiteUser
{
    private double charge;
    private int minutes;

    public LiteUser(int minutes)
    {
        this.minutes = minutes;
        calculateBill();
    }

    final public void PrintData()
    {
        System.out.println("Number of minutes: " + minutes);
        System.out.println("Charge: Rs. " + charge);
    }

    public void calculateBill()
    {

        double monthlyRental = 500.00;

        int freeMinutes = 1000;

        double chargePerMinute = 0.20;

        if (minutes <= freeMinutes)
        {
            charge = monthlyRental;
        }
        else
        {
            charge = monthlyRental + (minutes - freeMinutes) * chargePerMinute;
        }
    }
}

class HeavyUser extends LiteUser
{
    public HeavyUser(int minutes)
    {
        super(minutes);
    }

    @Override
    public void calculateBill()
    {

    }
}

public class Main
{
    public static void main(String[] args)
    {
        LiteUser liteUser = new LiteUser(1200);
        liteUser.PrintData();

        HeavyUser heavyUser = new HeavyUser(1500);
        heavyUser.PrintData();
    }
}
