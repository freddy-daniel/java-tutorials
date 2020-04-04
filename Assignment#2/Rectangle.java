interface Shape
{
    void calculateArea(int length, int width);
}

class Rectangle implements Shape
{
    public void calculateArea(int length, int width)
    {
        System.out.println("Area of Rectangle is " + length*width );
    }

    public static void main (String[] args)
    {
        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea(20, 10);
    }
}