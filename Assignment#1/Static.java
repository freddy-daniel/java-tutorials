class Book
{  
    String name;
    String author;
    static String publisher ="Random House";
        
    Book(String n, String a)
    {
        name = n;
        author = a;
    }
    
    void display ()
    {
       System.out.println("Book name: "+name+", author: "+author+" is published by "+publisher);
    }

    static void getPublisher()
    {
        System.out.println("publisher: "+publisher);
    }
}  

public class Static
{  
    public static void main(String args[])
    {  
        Book book1 = new Book("American Spy", "Lauren Wilkinson");  
        Book book2 = new Book("Invisible Man", "Ralph Ellison");  
        book1.display();  
        book2.display();
        System.out.println("becoz publisher is static, get publisher method is also static");
        book1.getPublisher();
    }
}