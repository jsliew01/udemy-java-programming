import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {

        String[] store = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can I help you find?\n");

        Scanner scan = new Scanner(System.in);
        String userResponse = scan.nextLine();
        
        for (int i = 0; i < store.length; i++) {
                if(store[i].equals(userResponse)){
                    System.out.println("\nWe have that in aisle: " + i);
                    break;
                } 
        }

                scan.close();
    }
}
