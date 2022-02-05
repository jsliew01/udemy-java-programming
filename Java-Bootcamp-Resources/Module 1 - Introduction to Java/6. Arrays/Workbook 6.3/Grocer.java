import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {
        
        String[] aisle = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        System.out.println("\nDo you sell coffee?");

        for(int i = 0; i < aisle.length; i++){
            String userInquiry = "coffee";
            
            if(aisle[i].equals(userInquiry)){ 
            System.out.println("\nWe have that in aisle: " + i);
            break;
            }
        }
                   
    }
}
