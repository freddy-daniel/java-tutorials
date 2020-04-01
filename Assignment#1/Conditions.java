import java.util.Calendar;

class Conditions {

    public static void main(String[] args) {
        
        Calendar now = Calendar.getInstance(); 

        // if condition
        if (50 > 15) 
        {
            System.out.println("\n50 is always greater than 15\n");
        }

        // if...else...chain
        if (now.get(Calendar.HOUR_OF_DAY) < 12) 
        {
            System.out.println("Good moring.\n");
        } 
        else 
        {
            System.out.println("Good evening.\n");
        }

        // demonstrate switch statement
        System.out.print("Today is ");
        switch (now.get(Calendar.DAY_OF_WEEK)) 
        {
            case 1:
                System.out.print("Sunday");
                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");
                break;
            case 5:
                System.out.print("Thursday");
                break;
            case 6:
                System.out.print("Friday");
                break;
            case 7:
                System.out.print("Saturday");
                break;
        }
        System.out.print("\n");
    }
}