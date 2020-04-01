class Loops {
    public static void main(String[] args) {
        
        // for loop example
        System.out.println("\nShowing first 10 natural numbers using for loop");
        for (int i = 1; i <= 10; i++) 
        {
           System.out.print( "\t" + i);
        }

        // while loop
        System.out.println("\n\nShowing first 5 natural numbers using while loop");
        int i = 1;
        while (i <= 5) {
           System.out.print( "\t" + i);
           i++;
        }


        // do while loop
        System.out.println("\n\nShowing even numbers between 1 and 10 using do ... while loop");
        int j = 0;
        do {
            j = j+2;
            System.out.print( "\t" + j);
        }
        while (j < 10);
    }
}