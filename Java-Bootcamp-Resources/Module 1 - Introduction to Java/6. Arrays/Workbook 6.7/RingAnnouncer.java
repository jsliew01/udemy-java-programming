public class RingAnnouncer {
    public static void main(String[] args) {
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};

        int wins = 0;
        int losses = 0;

        for(int i = 0; i < record.length; i++){
            if(record[i].equals("WIN")){
                wins ++;
            } else{
                losses ++;
            }
        }
        
        System.out.println("\nWith a professional record of " + wins + " Wins and " + losses +" losses.\nHe is the pride of oracle: Java Fury!");
        /** Task 2
         * Print:
         *     • \nWith a professional record of <wins> Wins and <losses> losses. 
         *     • He is the pride of oracle: Java Fury!
         *
         * 
         */        

    }
}
