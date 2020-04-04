class StringDemo
{
    public static void main(String[] args)
    {
        System.out.println("String class is unmutable");
        String str = new String("Freddy");
        System.out.println("using concat method: " + str.concat(" Daniel"));
        System.out.println("but string is unmutable");
        System.out.println(str);


        System.out.println("String StringBuffer and StringBuilder are unmutable");
        StringBuffer buffer = new StringBuffer("Hi");
        buffer.append(" String buffer");
        System.out.println(buffer);
        
        StringBuilder builder = new StringBuilder("Hi");
        builder.append(" String builder");
        System.out.println(builder);
    }
}