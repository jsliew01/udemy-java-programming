import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        randomCard();

        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler.\n");
        System.out.println("• There are two players, you and the computer.");
        System.out.println("• The dealer will give each player one card.");
        System.out.println("• Then, the dealer will draw five cards (the river)");
        System.out.println("• The player with the most river matches wins!");
        System.out.println("If the matches are equal, everyone's a winner!\n");
        System.out.println("• Ready? Type anything if you are.");

        scan.nextLine();

        String userCard = randomCard();
        System.out.println("Here's your card");
        System.out.println(userCard + "\n");

        String computerCard = randomCard();
        System.out.println("Here's the computer's card");
        System.out.println(computerCard + "\n");

        int yourMatches = 0;
        int computerMatches = 0;

        /** Task 4 - Draw five cards
         * 
         * • print:  Now, the dealer will draw five cards. Press enter to continue.
         * • The dealer will draw a card every time the user presses enter.
         * • Before you draw a card, print the order it was drawn in:
         *      Card 1 
         *      <2 new lines>
         *      <print card>
         *      Card 2
         *      <2 new lines>
         *      <print card>
         *      ...
         */

        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        scan.nextLine();

        String userdrawCard = "";
        String computerDrawCard = "";

        for(int i = 1; i <=5; i++){

            scan.nextLine();
            System.out.println("card " + i + "\n\n");
            
            userdrawCard = randomCard();
            System.out.println(userdrawCard);
            if(userdrawCard == userCard){
                yourMatches ++;
            } else{
                //nothing
            }

            }

        for(int j = 1; j <= 5; j++){

            scan.nextLine();
            System.out.println("computer card " + j + "\n\n");


            computerDrawCard = randomCard();
            System.out.println(computerDrawCard);

            if(computerDrawCard == computerCard){
                computerMatches ++;
            } else{
                //nothing 
            }
        }

            System.out.println("Your number of matches: " + yourMatches);
            System.out.println("Computer number of matches: " + computerMatches);

            if(yourMatches > computerMatches){
                System.out.println("You Win!");
            } else if(computerMatches > yourMatches){
                System.out.println("The computer wins");
            } else{
                System.out.println("everyone wins!");
            }

            scan.close();

        }


        /** Task 5 - Get the winner
         * 
         * • Count your number of matches.
         * • Count the computer's number of matches.
         * • print: Your number of matches: <yourMatches>
         * • print: Computer number of matches:  <computerMatches>
         * 
         * • If you have more matches, print: You win!. 
         * • If the computer has more matches, print: The computer wins! 
         * • If the matches are equal, print: everyone wins!.
         */

    
    
    public static String randomCard() {
        int randomNumber = (int)(Math.random() * 13) + 1;
        String card = " ";
        switch(randomNumber){
            case 1:
            card =               
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n";
            break;
            case 2:
             card =               
            "   _____\n"+              
            "  |2    |\n"+ 
            "  |  o  |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____Z|\n";
            break;
            case 3:
             card =  
            "   _____\n" +
            "  |3    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____E|\n";
            break;
            case 4:
             card = 
            "   _____\n" +
            "  |4    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  | o o |\n"+
            "  |____h|\n";
            break;
            case 5:
             card =  
            "   _____ \n" +
            "  |5    |\n" +
            "  | o o |\n" +
            "  |  o  |\n" +
            "  | o o |\n" +
            "  |____S|\n";
            break;
            case 6:
             card = 
            "   _____ \n" +
            "  |6    |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  |____6|\n";
            break;
            case 7:
             card =
            "   _____ \n" +
            "  |7    |\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |____7|\n";
            break;
            case 8:
             card =
            "   _____ \n" +
            "  |8    |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  |____8|\n";
            break;
            case 9:
             card = 
            "   _____ \n" +
            "  |9    |\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |____9|\n";
            break;
            case 10:
             card = 
            "   _____ \n" +
            "  |10  o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |___10|\n";
            break;
            case 11:
             card = 
            
            "   _____\n" +
            "  |J  ww|\n"+ 
            "  | o {)|\n"+ 
            "  |o o% |\n"+ 
            "  | | % |\n"+ 
            "  |__%%[|\n";
            break;
            case 12:
             card = 
            "   _____\n" +
            "  |Q  ww|\n"+ 
            "  | o {(|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%O|\n";
            break;
            case 13:
             card = 
            "   _____\n" +
            "  |K  WW|\n"+ 
            "  | o {)|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%>|\n";

            default: //impossible
        }

        return card;
    }

}
