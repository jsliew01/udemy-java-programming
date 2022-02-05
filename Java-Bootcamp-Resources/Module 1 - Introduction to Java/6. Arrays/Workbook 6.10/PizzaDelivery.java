import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**  Task 1: 
         *   1. Ask the user: How many pizza toppings do you want?. 
         *   2. Then, pick up the result using Scanner.
         */
        System.out.println("How many pizza toppings do you want?");
        int result = scan.nextInt();
        scan.nextLine();

        // Task 2 – Create the array here

        String[] pizzaToppings = new String[result];

        /** Task 3
         *  print Great, enter each topping!
         *  Create a for loop that runs through the length of the array.   
         * 
         */
        System.out.println("Great, enter each topping\n");
        for(int i = 0; i < pizzaToppings.length; i++){
            System.out.print(i + ".");
            pizzaToppings[i] =  scan.nextLine();
        }    

        System.out.println("\nThank you! Here are the toppings your ordered");

        for(int j = 0; j < pizzaToppings.length; j++ ){
            System.out.println(j + "." + pizzaToppings[j]);    
        }

        System.out.println("\nPress anything to confirm your order.");

        scan.nextLine();

        System.out.println("Great, a driver is on the way!");
        
        scan.close();         
    }
}
