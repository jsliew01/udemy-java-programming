import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        System.out.print("\nPick a number to count by: ");
        int countBy = scan.nextInt();

        System.out.print("Pick a number to start counting from: ");
        int startCount = scan.nextInt();

        System.out.print("Pick a number to count to: ");
        int countTo = scan.nextInt();

        for(int i = startCount; i <= countTo; i += countBy){
          System.out.print(i + " ");
        }

        

      /* Task 2 – Create a for loop that:
            1. starts from the second number.
            2. stops at the third number. 
            3. counts in steps of the first.
      */

        scan.close();
    }
}
