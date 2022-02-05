import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Survey {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome. Thank you for taking the survey");
        
        int counter = 0;
        System.out.println("\nWhat is your name?");
        counter++;

        String name = scan.nextLine();
        System.out.println("\nHow much money do you spend on coffee");
        double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow much money do you spend on Fast Food");
        double foodPrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow many times per week do you spend on coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;
        
        System.out.println("\nHow many times per week do you buy fast food?");
        int foodAmount = scan.nextInt();
        counter++;

        System.out.println("\nThank you " + name +  " for answering all " + counter + " questions.");
        System.out.println("Your fast food expenses are " +(foodPrice/coffeePrice + " times the coffee expenses"));
        System.out.println("Weekly, you spent $" + (coffeePrice*coffeeAmount) + " on coffee");
        System.out.println("Weeklym you spent $" + (foodPrice * foodAmount) + " on food");

        scan.close();
    }
}
