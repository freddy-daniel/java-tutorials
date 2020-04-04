class ExceptionHandle 
{ 
    public static void main(String args[]) 
    { 
        try { 
            int a[] = new int[2]; 
            a[4] = 5;
        } 
        catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println ("Array Index is Out Of Bounds"); 
        }

        try {
            int c = 1/0;
            System.out.println ("Sum = " + c); 
        }
        catch (ArithmeticException e) { 
            System.out.println ("Can't divide a number by 0"); 
        }
        
        try { 
            int num = Integer.parseInt ("test") ; 
            System.out.println(num); 
        }
        catch (NumberFormatException e) { 
            System.out.println("Number format exception"); 
        }
    } 
}