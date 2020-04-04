class Animal 
{ 
    void message() 
    { 
        System.out.println("This is Animal class"); 
    } 
} 
  
class Cat extends Animal 
{ 
    void message() 
    { 
        System.out.println("This is Cat class"); 
    } 
  
    void display() 
    { 
        message(); 
        super.message(); 
    }
} 
  
class Super 
{ 
    public static void main(String args[]) 
    { 
        Cat cat = new Cat(); 
        cat.display(); 
    } 
} 