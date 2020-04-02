class Polymorphism
{
    public static void main(String[] args) 
    {
        System.out.println("Polymorphism with bike top speed ;) ");
        Bike unicorn = new Unicorn();
        unicorn.topSpeed();

        Bike thunderbird = new Thunderbird();
        thunderbird.topSpeed();
        
        Bike rX100 = new RX100();
        rX100.topSpeed();
    }
}

class Bike
{
    void topSpeed()
    {
        System.out.println("\tBike top speed: 90 km/h");
    }
}

class Unicorn extends Bike
{
    void topSpeed()
    {
        System.out.println("\tUnicorn bike top speed: 114 km/h");
    }
}

class Thunderbird extends Bike
{
    void topSpeed()
    {
        System.out.println("\tThunderbird bike top speed: 130 km/h");
    }
}

class RX100 extends Bike
{
    void topSpeed()
    {
        System.out.println("\tRX100 bike top speed: 110 km/h");
    }
}
