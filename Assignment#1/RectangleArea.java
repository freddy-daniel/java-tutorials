class RectangleArea {

    public static void main (String[] args)
    {
        System.out.println("Area of rectangle have length: 35 cm and width: 40 cm");
        System.out.println(RectangleArea(35, 40));

        System.out.println("Area of square width: 25 cm");
        System.out.println(RectangleArea(25));
    }


    static int RectangleArea (int length, int width)
    {
        return (length * width);
    }

    static int RectangleArea (int width)
    {
        return (width * width);
    }
}