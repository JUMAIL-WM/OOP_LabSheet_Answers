public class WaterBill
{
    private double previousReading;
    private double currentReading;
    private double consumption;
    private double charge;

    public WaterBill(double previousReading, double currentReading)
    {
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.consumption = calConsumption();
        this.charge = calWaterCharge();
    }

    public double calConsumption()
    {
        consumption = currentReading - previousReading;
        return consumption;
    }

    public double calWaterCharge()
    {
        if (consumption <= 5)
        {
            charge = consumption * 12.00 + 50;
        }
        else if (consumption <= 10)
        {
            charge = consumption * 16.00 + 65;
        }
        else
        {
            charge = consumption * 20.00 + 70;
        }
        return charge;
    }

    public double getPreviousReading()
    {
        return previousReading;
    }

    public double getCurrentReading()
    {
        return currentReading;
    }

    public double getConsumption()
    {
        return consumption;
    }

    public double getCharge()
    {
        return charge;
    }

    public static void main(String[] args)
    {
        WaterBill waterBill = new WaterBill(100.0, 105.5);
        System.out.println("Water Consumption: " + waterBill.getConsumption() + " units");
        System.out.println("Water Charge: " + waterBill.getCharge());
    }
}
