class Vehicle
{
    String name = "Vehicle";
    int door;
    public int speed;
    protected String color;

    public void setAttrib(String col, int spee, int dor)
    {
        name = "car";
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

    public void run()
    {
        System.out.println("Vehicle is running speed of " + speed);
    }
}


class VehicleUse
{
    public static void main(String args[])
    {
        Vehicle car = new Vehicle();
        Vehicle bike = new Vehicle();
        Vehicle raceCar = new Vehicle();
        car.door = 4;
        car.speed = 180;
        car.color = "white";
        raceCar.setAttrib("red", 400, 2);
        car.run();
        car.showAttrib();
        bike.run();
        bike.showAttrib();
        raceCar.run();
        raceCar.showAttrib();
    }
}
