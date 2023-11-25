class Vehicle
{
    final String name = "Vehicle";
    int door;
    public int speed;
    protected String color;

    public void setAttrib(String col, int spee, int dor)
    {
        // 'name' is declared as final and cannot be reassigned.
        // Change it to a non-final variable if you want to modify it.
        // Also, correct the assignment of 'speed' to 'spee'.
        color = col;
        speed = spee;
        door = dor;
    }

    public void showAttrib()
    {
        System.out.println("name=" + name);
        System.out.println("Color=" + color);
        System.out.println("speed=" + speed);
        System.out.println("door=" + door);
    }

    public void run() {
        // 'spee' is not defined in this method.
        System.out.println("Vehicle is running speed of " + speed);
    }
}

public class VehicleUse
{
    public static void main(String args[])
    {
        Vehicle car = new Vehicle();
        Vehicle bike = new Vehicle();
        Vehicle raceCar = new Vehicle();

        // 'doors' is not a member of the 'Vehicle' class; it should be 'door'.
        // Also, fix the assignment of 'color' for 'car'.
        car.door = 4;
        car.speed = 180;
        car.color = "white"; // Accessing 'color' is correct because it's protected.

        raceCar.setAttrib("red", 400, 2);
        car.run();
        car.showAttrib();
        bike.run();
        bike.showAttrib();
        raceCar.run();
        raceCar.showAttrib();
    }
}
